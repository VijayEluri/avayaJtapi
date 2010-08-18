package com.avaya.jtapi.tsapi.csta1;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;

import com.avaya.jtapi.tsapi.asn1.ASNBitString;

public class LucentMonitorConfEvent extends LucentPrivateData {
	int usedFilter;
	static final int PDU = 30;

	static LucentMonitorConfEvent decode(InputStream in) {
		LucentMonitorConfEvent _this = new LucentMonitorConfEvent();
		_this.doDecode(in);

		return _this;
	}

	@Override
	public void decodeMembers(InputStream memberStream) {
		usedFilter = ASNBitString.decode(memberStream);
	}

	@Override
	public int getPDU() {
		return 30;
	}

	@Override
	public Collection<String> print() {
		Collection<String> lines = new ArrayList<String>();

		lines.add("LucentMonitorConfEvent ::=");
		lines.add("{");

		String indent = "  ";

		lines.addAll(LucentPrivateFilter
				.print(usedFilter, "usedFilter", indent));

		lines.add("}");
		return lines;
	}
}

