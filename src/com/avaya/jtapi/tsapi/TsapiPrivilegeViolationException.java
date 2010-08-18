package com.avaya.jtapi.tsapi;

import javax.telephony.PrivilegeViolationException;

public final class TsapiPrivilegeViolationException extends
		PrivilegeViolationException implements ITsapiException {
	private static final long serialVersionUID = 1L;
	int errorType = 0;
	int errorCode = 0;

	public TsapiPrivilegeViolationException(int _errorType, int _errorCode,
			int type) {
		super(type);
		errorType = _errorType;
		errorCode = _errorCode;
	}

	public TsapiPrivilegeViolationException(int _errorType, int _errorCode,
			int type, String s) {
		super(type, s);
		errorType = _errorType;
		errorCode = _errorCode;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public int getErrorType() {
		return errorType;
	}
}

