package com.avaya.jtapi.tsapi.csta1;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;

public final class CSTAChangeMonitorFilter extends CSTARequest {
	int monitorCrossRefID;
	CSTAMonitorFilter monitorFilter;
	public static final int PDU = 115;

	public CSTAChangeMonitorFilter(int _monitorCrossRefID,
			CSTAMonitorFilter _monitorFilter) {
		this.monitorCrossRefID = _monitorCrossRefID;
		this.monitorFilter = _monitorFilter;
	}

	public CSTAChangeMonitorFilter() {
	}

	public void encodeMembers(OutputStream memberStream) {
		CSTAMonitorCrossRefID.encode(this.monitorCrossRefID, memberStream);
		CSTAMonitorFilter.encode(this.monitorFilter, memberStream);
	}

	public static CSTAChangeMonitorFilter decode(InputStream in) {
		CSTAChangeMonitorFilter _this = new CSTAChangeMonitorFilter();
		_this.doDecode(in);

		return _this;
	}

	public void decodeMembers(InputStream memberStream) {
		this.monitorCrossRefID = CSTAMonitorCrossRefID.decode(memberStream);
		this.monitorFilter = CSTAMonitorFilter.decode(memberStream);
	}

	public Collection<String> print() {
		Collection<String> lines = new ArrayList<String>();
		lines.add("CSTAChangeMonitorFilter ::=");
		lines.add("{");

		String indent = "  ";

		lines.addAll(CSTAMonitorCrossRefID.print(this.monitorCrossRefID,
				"monitorCrossRefID", indent));
		lines.addAll(CSTAMonitorFilter.print(this.monitorFilter,
				"monitorFilter", indent));

		lines.add("}");
		return lines;
	}

	public int getPDU() {
		return 115;
	}

	public int getMonitorCrossRefID() {
		return this.monitorCrossRefID;
	}

	public CSTAMonitorFilter getMonitorFilter() {
		return this.monitorFilter;
	}
}