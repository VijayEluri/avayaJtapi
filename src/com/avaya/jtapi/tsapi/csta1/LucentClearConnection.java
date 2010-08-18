package com.avaya.jtapi.tsapi.csta1;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;

import com.avaya.jtapi.tsapi.asn1.ASNEnumerated;

public class LucentClearConnection extends LucentPrivateData {
	public static LucentClearConnection decode(InputStream in) {
		LucentClearConnection _this = new LucentClearConnection();
		_this.doDecode(in);

		return _this;
	}

	short dropResource;
	LucentUserToUserInfo userInfo;

	static final int PDU = 1;

	public LucentClearConnection() {
	}

	public LucentClearConnection(short _dropResource,
			LucentUserToUserInfo _userInfo) {
		dropResource = _dropResource;
		userInfo = _userInfo;
	}

	@Override
	public void decodeMembers(InputStream memberStream) {
		dropResource = ASNEnumerated.decode(memberStream);
		userInfo = LucentUserToUserInfo.decode(memberStream);
	}

	@Override
	public void encodeMembers(OutputStream memberStream) {
		ASNEnumerated.encode(dropResource, memberStream);
		LucentUserToUserInfo.encode(userInfo, memberStream);
	}

	@Override
	public int getPDU() {
		return 1;
	}

	@Override
	public Collection<String> print() {
		Collection<String> lines = new ArrayList<String>();

		lines.add("LucentClearConnection ::=");
		lines.add("{");

		String indent = "  ";

		lines.addAll(LucentDropResource.print(dropResource, "dropResource",
				indent));
		lines.addAll(LucentUserToUserInfo.print(userInfo, "userInfo", indent));

		lines.add("}");
		return lines;
	}
}

