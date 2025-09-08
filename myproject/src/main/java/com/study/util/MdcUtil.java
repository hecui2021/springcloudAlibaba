package com.study.util;

import com.google.common.base.Strings;
import org.slf4j.MDC;

import java.util.Optional;
import java.util.UUID;

public class MdcUtil {

    private static final String SERVER_ENV = "server-env";
    private static final String REQUEST_TIME_KEY = "request-time";
    private static final String REQUEST_URI_KEY = "request-uri";
    private static final String CLIENT_IP_KEY = "client-ip";
    private static final String TRACE_ID_KEY = "trace-id";

    public static void init() {
        init("", "", "");
    }

    public static void init(String uri, String clientIp, String traceId) {
        initMdcEnv();
        setRequestTime(System.currentTimeMillis());
        setRequestUri(uri);
        setClientIp(clientIp);

        if (Strings.isNullOrEmpty(traceId)) {
            initTraceId();
        } else {
            MdcUtil.setTraceId(traceId);
        }
    }

    public static void initMdcEnv() {
        MDC.put(SERVER_ENV, System.getProperty("SERVER_ENV"));
    }

    public static void clear() {
        setTraceId("");
        setRequestUri("");
        setClientIp("");
        setTraceId("");
        setRequestTime(0);
    }

    // -------------------------------------------------
    // getter / setter
    // -------------------------------------------------

    public static String getClientIp() {
        return MDC.get(CLIENT_IP_KEY);
    }

    public static long getRequestTime() {
        String raw = MDC.get(REQUEST_TIME_KEY);
        if (raw == null) {
            return 0;
        }

        return Long.parseLong(raw);
    }

    public static String getTraceId() {
        return MDC.get(TRACE_ID_KEY);
    }

    public static void setTraceId(String traceId) {
        MDC.put(TRACE_ID_KEY, traceId);
    }

    private static void initTraceId() {
        MDC.put(TRACE_ID_KEY, UUID.randomUUID().toString().replaceAll("-", ""));
    }

    /**
     * 毫秒级时间戳
     * @param time
     */
    private static void setRequestTime(long time) {
        MDC.put(REQUEST_TIME_KEY, String.valueOf(time));
    }

    private static void setClientIp(String clientIp) {
        MDC.put(CLIENT_IP_KEY, clientIp);
    }

    private static void setRequestUri(String uri) {
        MDC.put(REQUEST_URI_KEY, uri);
    }

    public static String getRequestUri() {
        return Optional.ofNullable(MDC.get(REQUEST_URI_KEY)).orElse("");
    }
}
