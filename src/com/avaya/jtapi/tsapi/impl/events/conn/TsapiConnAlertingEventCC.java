package com.avaya.jtapi.tsapi.impl.events.conn;

import javax.telephony.callcontrol.events.CallCtlConnAlertingEv;

import com.avaya.jtapi.tsapi.ITsapiCallInfo;

@SuppressWarnings("deprecation")
public class TsapiConnAlertingEventCC extends TsapiCallCtlConnEvent implements
		CallCtlConnAlertingEv, ITsapiCallInfo {
	public TsapiConnAlertingEventCC(ConnEventParams params) {
		super(params);
	}

	public final int getID() {
		return 203;
	}
}

