package com.avaya.jtapi.tsapi.csta1;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;

import com.avaya.jtapi.tsapi.asn1.ASNNull;

public final class CSTAClearConnectionConfEvent extends CSTAConfirmation {
	public static final int PDU = 10;

	public static CSTAClearConnectionConfEvent decode(InputStream in) {
		CSTAClearConnectionConfEvent _this = new CSTAClearConnectionConfEvent();
		_this.doDecode(in);

		return _this;
	}

	@Override
	public void decodeMembers(InputStream memberStream) {
		ASNNull.decode(memberStream);
	}

	@Override
	public void encodeMembers(OutputStream memberStream) {
		ASNNull.encode(memberStream);
	}

	@Override
	public int getPDU() {
		return 10;
	}

	@Override
	public Collection<String> print() {
		Collection<String> lines = new ArrayList<String>();
		lines.add("CSTAClearConnectionConfEvent ::=");
		lines.add("{");

		String indent = "  ";

		lines.addAll(ASNNull.print(indent));

		lines.add("}");
		return lines;
	}
}
