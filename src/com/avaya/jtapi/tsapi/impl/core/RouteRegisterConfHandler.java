package com.avaya.jtapi.tsapi.impl.core;

import com.avaya.jtapi.tsapi.csta1.CSTAEvent;
import com.avaya.jtapi.tsapi.csta1.CSTARouteRegisterReqConfEvent;
import com.avaya.jtapi.tsapi.tsapiInterface.ConfHandler;

final class RouteRegisterConfHandler implements ConfHandler {
	TSDevice device;

	RouteRegisterConfHandler(TSDevice _device) {
		device = _device;
	}

	public void handleConf(CSTAEvent event) {
		if ((event == null)
				|| (!(event.getEvent() instanceof CSTARouteRegisterReqConfEvent))) {
			return;
		}

		CSTARouteRegisterReqConfEvent routeRegisterConf = (CSTARouteRegisterReqConfEvent) event
				.getEvent();
		device.registerReqID = routeRegisterConf.getRegisterReqID();
	}
}
