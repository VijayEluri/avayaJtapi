package com.avaya.jtapi.tsapi.acs;

import com.avaya.jtapi.tsapi.asn1.TsapiRequest;

public abstract class ACSRequest extends TsapiRequest {
	@Override
	public final int getPDUClass() {
		return 0;
	}
}

