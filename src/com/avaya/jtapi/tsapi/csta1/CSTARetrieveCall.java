package com.avaya.jtapi.tsapi.csta1;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;

public final class CSTARetrieveCall extends CSTARequest {
	public static CSTARetrieveCall decode(InputStream in) {
		CSTARetrieveCall _this = new CSTARetrieveCall();
		_this.doDecode(in);

		return _this;
	}

	CSTAConnectionID heldCall;

	public static final int PDU = 41;

	public CSTARetrieveCall() {
	}

	public CSTARetrieveCall(CSTAConnectionID _heldCall) {
		heldCall = _heldCall;
	}

	@Override
	public void decodeMembers(InputStream memberStream) {
		heldCall = CSTAConnectionID.decode(memberStream);
	}

	@Override
	public void encodeMembers(OutputStream memberStream) {
		CSTAConnectionID.encode(heldCall, memberStream);
	}

	public CSTAConnectionID getHeldCall() {
		return heldCall;
	}

	@Override
	public int getPDU() {
		return 41;
	}

	@Override
	public Collection<String> print() {
		Collection<String> lines = new ArrayList<String>();

		lines.add("CSTARetrieveCall ::=");
		lines.add("{");

		String indent = "  ";

		lines.addAll(CSTAConnectionID.print(heldCall, "heldCall", indent));

		lines.add("}");
		return lines;
	}
}

