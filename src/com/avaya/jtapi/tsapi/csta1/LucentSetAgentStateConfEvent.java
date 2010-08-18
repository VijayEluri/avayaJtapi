package com.avaya.jtapi.tsapi.csta1;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;

import com.avaya.jtapi.tsapi.asn1.ASNBoolean;

public final class LucentSetAgentStateConfEvent extends LucentPrivateData {
	boolean isPending;
	public static final int PDU = 103;

	public static LucentSetAgentStateConfEvent decode(InputStream in) {
		LucentSetAgentStateConfEvent _this = new LucentSetAgentStateConfEvent();
		_this.doDecode(in);

		return _this;
	}

	@Override
	public void decodeMembers(InputStream memberStream) {
		isPending = ASNBoolean.decode(memberStream);
	}

	@Override
	public void encodeMembers(OutputStream memberStream) {
		ASNBoolean.encode(isPending, memberStream);
	}

	@Override
	public int getPDU() {
		return 103;
	}

	public boolean isPending() {
		return isPending;
	}

	@Override
	public Collection<String> print() {
		Collection<String> lines = new ArrayList<String>();

		lines.add("LucentSetAgentStateConfEvent ::=");
		lines.add("{");

		String indent = "  ";

		lines.addAll(ASNBoolean.print(isPending, "isPending", indent));

		lines.add("}");
		return lines;
	}

	public void setPending(boolean isPending) {
		this.isPending = isPending;
	}
}
