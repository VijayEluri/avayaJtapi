package com.avaya.jtapi.tsapi.csta1;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;

import com.avaya.jtapi.tsapi.asn1.ASNInteger;

public final class CSTARouteRegisterAbortEventReport extends CSTAEventReport {
	int routeRegisterReqID;
	public static final int PDU = 82;

	public static CSTARouteRegisterAbortEventReport decode(InputStream in) {
		CSTARouteRegisterAbortEventReport _this = new CSTARouteRegisterAbortEventReport();
		_this.doDecode(in);

		return _this;
	}

	@Override
	public void decodeMembers(InputStream memberStream) {
		routeRegisterReqID = ASNInteger.decode(memberStream);
	}

	@Override
	public void encodeMembers(OutputStream memberStream) {
		ASNInteger.encode(routeRegisterReqID, memberStream);
	}

	@Override
	public int getPDU() {
		return 82;
	}

	public int getRouteRegisterReqID() {
		return routeRegisterReqID;
	}

	@Override
	public Collection<String> print() {
		Collection<String> lines = new ArrayList<String>();

		lines.add("CSTARouteRegisterAbortEventReport ::=");
		lines.add("{");

		String indent = "  ";

		lines.addAll(ASNInteger.print(routeRegisterReqID, "routeRegisterReqID",
				indent));

		lines.add("}");
		return lines;
	}

	public void setRouteRegisterReqID(int routeRegisterReqID) {
		this.routeRegisterReqID = routeRegisterReqID;
	}
}
