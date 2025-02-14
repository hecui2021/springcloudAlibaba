package com.study.util;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

/**
 * @Author peterche
 * @Description
 * @Date 2023/5/15 10:46
 **/
public class Base64Util {

    /**
     * 解码
     *
     * @param str
     * @return
     */
    public static String decode(String str) {
        return new String(Base64.getDecoder().decode(str), StandardCharsets.UTF_8);
    }

    /**
     * 编码
     * @param str
     * @return
     */
    public static String encode(String str) {
        return new String(Base64.getEncoder().encode(str.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
    }

    /**
     * 编码
     * @param bytes
     * @return
     */
    public static String encode(byte[] bytes) {
        return new String(Base64.getEncoder().encode(bytes), StandardCharsets.UTF_8);
    }
}
