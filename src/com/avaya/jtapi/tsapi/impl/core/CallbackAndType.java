package com.avaya.jtapi.tsapi.impl.core;

import com.avaya.jtapi.tsapi.impl.monitor.TsapiCallMonitor;

final class CallbackAndType {
	TsapiCallMonitor callback;
	DevWithType devWithType;

	CallbackAndType(TsapiCallMonitor _callback, DevWithType _devWithType) {
		callback = _callback;
		devWithType = _devWithType;
	}
}

