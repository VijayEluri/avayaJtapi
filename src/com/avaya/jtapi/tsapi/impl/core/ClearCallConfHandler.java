package com.avaya.jtapi.tsapi.impl.core;

import java.util.Vector;

import com.avaya.jtapi.tsapi.csta1.CSTAClearCallConfEvent;
import com.avaya.jtapi.tsapi.csta1.CSTAEvent;
import com.avaya.jtapi.tsapi.impl.monitor.TsapiCallMonitor;
import com.avaya.jtapi.tsapi.tsapiInterface.ConfHandler;

final class ClearCallConfHandler implements ConfHandler {
	TSCall call;

	ClearCallConfHandler(TSCall _call) {
		call = _call;
	}

	public void handleConf(CSTAEvent event) {
		if ((event == null)
				|| (!(event.getEvent() instanceof CSTAClearCallConfEvent))) {
			return;
		}

		call.replyPriv = event.getPrivData();

		Vector<TSEvent> eventList = new Vector<TSEvent>();
		call.setState(34, eventList);
		if (eventList.size() > 0) {
			Vector<TsapiCallMonitor> observers = call.getObservers();
			for (int j = 0; j < observers.size(); ++j) {
				TsapiCallMonitor callback = observers.elementAt(j);
				callback.deliverEvents(eventList, 100, false);
			}
		}
		call.endCVDObservers(100, null);
	}
}

