package com.avaya.jtapi.tsapi.csta1;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;

public final class CSTAQueryFwdConfEvent extends CSTAConfirmation {
	CSTAForwardingInfo[] forward;
	public static final int PDU = 32;

	public static CSTAQueryFwdConfEvent decode(InputStream in) {
		CSTAQueryFwdConfEvent _this = new CSTAQueryFwdConfEvent();
		_this.doDecode(in);

		return _this;
	}

	@Override
	public void decodeMembers(InputStream memberStream) {
		forward = ListForwardParameters.decode(memberStream);
	}

	@Override
	public void encodeMembers(OutputStream memberStream) {
		ListForwardParameters.encode(forward, memberStream);
	}

	public CSTAForwardingInfo[] getForward() {
		return forward;
	}

	@Override
	public int getPDU() {
		return 32;
	}

	@Override
	public Collection<String> print() {
		Collection<String> lines = new ArrayList<String>();

		lines.add("CSTAQueryFwdConfEvent ::=");
		lines.add("{");

		String indent = "  ";

		lines.addAll(ListForwardParameters.print(forward, "forward", indent));

		lines.add("}");
		return lines;
	}

	public void setForward(CSTAForwardingInfo[] forward) {
		this.forward = forward;
	}
}

