package com.avaya.jtapi.tsapi.csta1;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;

import com.avaya.jtapi.tsapi.asn1.ASNEnumerated;
import com.avaya.jtapi.tsapi.asn1.ASNIA5String;

public final class CSTABackInServiceEvent extends CSTAUnsolicited {
	String device;
	short cause;
	static final int PDU = 96;

	public static CSTABackInServiceEvent decode(InputStream in) {
		CSTABackInServiceEvent _this = new CSTABackInServiceEvent();
		_this.doDecode(in);

		return _this;
	}

	@Override
	public void decodeMembers(InputStream memberStream) {
		device = ASNIA5String.decode(memberStream);
		cause = ASNEnumerated.decode(memberStream);
	}

	public short getCause() {
		return cause;
	}

	public String getDevice() {
		return device;
	}

	@Override
	public int getPDU() {
		return 96;
	}

	@Override
	public Collection<String> print() {
		Collection<String> lines = new ArrayList<String>();
		lines.add("CSTABackInServiceEvent ::=");
		lines.add("{");

		String indent = "  ";
		lines.add(indent + "monitorCrossRefID " + monitorCrossRefID);
		lines.addAll(ASNIA5String.print(device, "device", indent));
		lines.addAll(CSTAEventCause.print(cause, "cause", indent));

		lines.add("}");
		return lines;
	}
}

