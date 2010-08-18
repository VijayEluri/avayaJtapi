package com.avaya.jtapi.tsapi.acs;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;

import com.avaya.jtapi.tsapi.asn1.ASNEnumerated;

public final class ACSNameSrvRequest extends ACSRequest {
	public static ACSNameSrvRequest decode(InputStream in) {
		ACSNameSrvRequest _this = new ACSNameSrvRequest();
		_this.doDecode(in);

		return _this;
	}

	short streamType;

	public static final int PDU = 10;

	public ACSNameSrvRequest() {
	}

	public ACSNameSrvRequest(short _streamType) {
		streamType = _streamType;
	}

	@Override
	public void decodeMembers(InputStream memberStream) {
		ASNEnumerated.decode(memberStream);
	}

	@Override
	public void encodeMembers(OutputStream memberStream) {
		ASNEnumerated.encode(streamType, memberStream);
	}

	@Override
	public int getPDU() {
		return 10;
	}

	@Override
	public Collection<String> print() {
		Collection<String> lines = new ArrayList<String>();
		lines.add("ACSNameSrvRequest ::=");
		lines.add("{");

		String indent = "  ";

		lines.addAll(StreamType.print(streamType, "streamType", indent));

		lines.add("}");
		return lines;
	}
}

