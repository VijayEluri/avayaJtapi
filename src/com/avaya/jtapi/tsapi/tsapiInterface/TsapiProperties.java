package com.avaya.jtapi.tsapi.tsapiInterface;

public abstract interface TsapiProperties {
	public static final String ALTERNATE_TRACE_FILE = "altTraceFile";
	public static final String DEFAULT_ALTERNATE_TRACE_FILE = "";
	public static final String DEBUG_LEVEL = "debugLevel";
	public static final String DEFAULT_DEBUG_LEVEL = "0";
	public static final String ENABLE_PRESERVE_REDIRECTED_VDNS = "enable_PreserveRedirectedVDNs";
	public static final String DEFAULT_ENABLE_PRESERVE_REDIRECTED_VDNS = "0";
	public static final String MAX_WAIT_FOR_SOCKET = "maxWaitForSocket";
	public static final String DEFAULT_MAX_WAIT_FOR_SOCKET = "20";
	public static final String TRUST_STORE_LOCATION = "trustStoreLocation";
	public static final String DEFAULT_TRUST_STORE_LOCATION = "";
	public static final String TRUST_STORE_PASSWORD = "trustStorePassword";
	public static final String DEFAULT_TRUST_STORE_PASSWORD = "password";
	public static final String VERIFY_SERVER_CERTIFICATE = "verifyServerCertificate";
	public static final String DEFAULT_VERIFY_SERVER_CERTIFICATE = "false";
	public static final String USE_TLINK_IP = "useTlinkIP";
	public static final String DEFAULT_USE_TLINK_IP = "0";
	public static final String GETSERVICES_TIMEOUT = "getServicesTimeout";
	public static final String DEFAULT_GETSERVICES_TIMEOUT = "10";
	public static final String CALLCOMPLETIONTIMEOUT = "callCompletionTimeout";
	public static final String DEFAULT_CALLCOMPLETIONTIMEOUT = "15";
	public static final String CALL_CLEANUP_RATE = "callCleanupRate";
	public static final String DEFAULT_CALL_CLEANUP_RATE = "100";
	public static final String ENABLE_AUDIT_DUMP = "enableAuditDump";
	public static final String DEFAULT_ENABLE_AUDIT_DUMP = "false";
	public static final String AUDIT_DUMP_INTERVAL = "auditDumpInterval";
	public static final String DEFAULT_AUDIT_DUMP_INTERVAL = "3";
	public static final String AUDIT_OBJECT_AGE_THRESHOLD = "auditObjectAgeThreshold";
	public static final String DEFAULT_AUDIT_OBJECT_AGE_THRESHOLD = "60";
	public static final String TS_DEVICE_PERFORMANCE_OPTIMIZATION = "tsDevicePerformanceOptimization";
	public static final String DEFAULT_TS_DEVICE_PERFORMANCE_OPTIMIZATION = "false";
	public static final String HANDLE_CSTA_EVENT_TIME_THRESHOLD = "handleCstaEventTimeThreshold";
	public static final String DEFAULT_HANDLE_CSTA_EVENT_TIME_THRESHOLD = "250";
	public static final String TRACE_FILE_COUNT = "traceFileCount";
	public static final int DEFAULT_TRACE_FILE_COUNT = 10;
	public static final String TRACE_FILE_SIZE = "traceFileSize";
	public static final int DEFAULT_TRACE_FILE_SIZE = 50;
	public static final String ERROR_FILE = "errorFile";
	public static final String DEFAULT_ERROR_FILE = "";
	public static final String ERROR_FILE_COUNT = "errorFileCount";
	public static final int DEFAULT_ERROR_FILE_COUNT = 10;
	public static final String ERROR_FILE_SIZE = "errorFileSize";
	public static final int DEFAULT_ERROR_FILE_SIZE = 50;
	public static final String PERFORMANCE_FILE = "perfFile";
	public static final String PERFORMANCE_FILE_COUNT = "perfFileCount";
	public static final String PERFORMANCE_FILE_SIZE = "perfFileSize";
	public static final String PERFORMANCE_WINDOW = "performanceWindow";
	public static final int DEFAULT_PERFORMANCE_WINDOW = 60;
	public static final String UNSOLICITED_HANDLING_TIME_THRESHOLD = "unsolicitedHandlingTimeThreshold";
	public static final int DEFAULT_UNSOLICITED_HANDLING_TIME_THRESHOLD = 100;
	public static final String SERVICE_REQUEST_TURNAROUND_TIME_THRESHOLD = "serviceRequestTurnaroundTimeThreshold";
	public static final int DEFAULT_SERVICE_REQUEST_TURNAROUND_TIME_THRESHOLD = 100;
	public static final String QUEUE_LENGTH_THRESHOLD = "queueLengthThreshold";
	public static final int DEFAULT_QUEUE_LENGTH_THRESHOLD = 10;
	public static final String MESSAGE_LATENCY_THRESHOLD = "messageLatencyThreshold";
	public static final int DEFAULT_MESSAGE_LATENCY_THRESHOLD = 20;
	public static final String MAX_THREAD_POOL_SIZE = "maxThreadPoolSize";
	public static final String DEFAULT_MAX_THREAD_POOL_SIZE = "20";
	public static final String REFRESH_INTERVAL_FOR_TSAPI_PRO = "propertyRefreshRate";
	public static final int DEFAULT_REFRESH_INTERVAL_FOR_TSAPI_PRO = 100;
	public static final int DEFAULT_PORT = 450;
}

