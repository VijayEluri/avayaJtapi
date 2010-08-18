package com.avaya.jtapi.tsapi.csta1;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;

public class LucentSnapshotCallInfoConfEvent extends LucentPrivateData {
	LucentDeviceHistoryEntry[] deviceHistory;
	static final int PDU = 138;

	static LucentSnapshotCallInfoConfEvent decode(InputStream in) {
		LucentSnapshotCallInfoConfEvent _this = new LucentSnapshotCallInfoConfEvent();
		_this.doDecode(in);

		return _this;
	}

	@Override
	public void decodeMembers(InputStream memberStream) {
		deviceHistory = CSTADeviceHistoryData.decode(memberStream);
	}

	public LucentDeviceHistoryEntry[] getDeviceHistory() {
		return deviceHistory;
	}

	@Override
	public int getPDU() {
		return 138;
	}

	@Override
	public Collection<String> print() {
		Collection<String> lines = new ArrayList<String>();

		lines.add("LucentSnapshotCallInfoConfEvent ::=");
		lines.add("{");

		String indent = "  ";

		lines.addAll(CSTADeviceHistoryData.print(deviceHistory,
				"deviceHistory", indent));

		lines.add("}");
		return lines;
	}
}
