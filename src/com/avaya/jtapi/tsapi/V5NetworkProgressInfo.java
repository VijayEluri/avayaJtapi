package com.avaya.jtapi.tsapi;

import javax.telephony.callcenter.CallCenterTrunk;

public class V5NetworkProgressInfo extends NetworkProgressInfo {
	String trunkGroup;
	String trunkMember;
	public CallCenterTrunk trunk;

	public V5NetworkProgressInfo() {
	}

	V5NetworkProgressInfo(String _trunkGroup, String _trunkMember,
			TsapiTrunk _trunk, short progressLocation, short progressDescription) {
		super(progressLocation, progressDescription);
		trunkGroup = _trunkGroup;
		trunkMember = _trunkMember;
		trunk = _trunk;
	}

	String getTrunkGroup() {
		return trunkGroup;
	}

	String getTrunkMember() {
		return trunkMember;
	}

	public void setTrunkGroup(String trunkGroup) {
		this.trunkGroup = trunkGroup;
	}

	public void setTrunkMember(String trunkMember) {
		this.trunkMember = trunkMember;
	}

	public void setTsapiTrunk(TsapiTrunk trunk) {
		this.trunk = trunk;
	}
}

