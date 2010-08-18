package com.avaya.jtapi.tsapi.impl.events.termConn;

import javax.telephony.callcontrol.events.CallCtlTermConnRingingEv;

import com.avaya.jtapi.tsapi.ITsapiCallInfo;

@SuppressWarnings("deprecation")
public class TsapiTermConnRingingEventCC extends TsapiCallCtlTermConnEvent
		implements CallCtlTermConnRingingEv, ITsapiCallInfo {
	public TsapiTermConnRingingEventCC(TermConnEventParams params) {
		super(params);
	}

	public final int getID() {
		return 218;
	}
}

