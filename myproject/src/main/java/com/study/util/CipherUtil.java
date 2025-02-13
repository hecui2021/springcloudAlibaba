package com.study.util;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Base64;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.util.DigestUtils;

@Slf4j
public class CipherUtil {
    /****
     * static{}
     * 这段见这里：
     * https://stackoverflow.com/questions/24907530/java-security-invalidkeyexception-illegal-key-size-or-default-parameters-in-and
     * https://blog.csdn.net/shfqbluestone/article/details/104550146
     */

    static {
        String errorString = "Failed manually overriding key-length permissions.";
        int newMaxKeyLength;
        try {
            if ((newMaxKeyLength = Cipher.getMaxAllowedKeyLength("AES")) < 256) {
                Class c = Class.forName("javax.crypto.CryptoAllPermissionCollection");
                Constructor con = c.getDeclaredConstructor();
                con.setAccessible(true);
                Object allPermissionCollection = con.newInstance();
                Field f = c.getDeclaredField("all_allowed");
                f.setAccessible(true);
                f.setBoolean(allPermissionCollection, true);

                c = Class.forName("javax.crypto.CryptoPermissions");
                con = c.getDeclaredConstructor();
                con.setAccessible(true);
                Object allPermissions = con.newInstance();
                f = c.getDeclaredField("perms");
                f.setAccessible(true);
                ((Map) f.get(allPermissions)).put("*", allPermissionCollection);

                c = Class.forName("javax.crypto.JceSecurityManager");
                f = c.getDeclaredField("defaultPolicy");
                f.setAccessible(true);
                Field mf = Field.class.getDeclaredField("modifiers");
                mf.setAccessible(true);
                mf.setInt(f, f.getModifiers() & ~Modifier.FINAL);
                f.set(null, allPermissions);

                newMaxKeyLength = Cipher.getMaxAllowedKeyLength("AES");
            }
        } catch (Exception e) {
            throw new RuntimeException(errorString, e);
        }
        if (newMaxKeyLength < 256) {
            throw new RuntimeException(errorString); // hack failed
        }
    }

    private static final String CBC_PKCS5_PADDING = "AES/CBC/PKCS5Padding";//AES是加密方式 CBC是工作模式 PKCS5Padding是填充模式
    private static final String AES = "AES";//AES 加密
    private static final String IV_KEY = "TAISWI1276@#$%sH";


    public static String getUUID4Carmp() {
        return UUID.randomUUID().toString().replace("-","");
    }

    public static Random random = new Random();

    public static String MD5AsHex(String str) {
        if (StringUtils.isEmpty(str)) {
            return "";
        }
        return DigestUtils.md5DigestAsHex(str.getBytes());
    }

    public static String getBase64(byte[] str) {
        if (str == null || str.length == 0) {
            return "";
        }
        return Base64.getEncoder().encodeToString(str);
    }

    public static byte[] randomBytes(int length) {
        byte[] b = new byte[length];
        random.nextBytes(b);
        return b;
    }

    /*
     * 加密
     */
    public static String encrypt(String key, String cleartext) {
        try {
            byte[] result = encrypt(key, cleartext.getBytes());
            return Base64.getEncoder().encodeToString(result);
        } catch (Exception e) {
            e.printStackTrace();
            log.error("", e);
            log.warn("encrypt get exception");
        }
        return null;
    }

    /*
     * 加密
     */
    private static byte[] encrypt(String key, byte[] clear) throws Exception {
        SecretKeySpec skeySpec = new SecretKeySpec(key.getBytes(), AES);
        Cipher cipher = Cipher.getInstance(CBC_PKCS5_PADDING);
        IvParameterSpec iv = new IvParameterSpec(IV_KEY.getBytes(), 0, 16);
        cipher.init(Cipher.ENCRYPT_MODE, skeySpec, iv);
        byte[] encrypted = cipher.doFinal(clear);
        return encrypted;
    }



    /* 解密
     */
    public static String decrypt(String key, String encrypted) {
        try {
            byte[] enc = Base64.getDecoder().decode(encrypted);
            byte[] result = decrypt(key, enc);
            return new String(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    /*
     * 解密
     */
    private static byte[] decrypt(String key, byte[] encrypted) throws Exception {
        SecretKeySpec skeySpec = new SecretKeySpec(key.getBytes(), AES);
        Cipher cipher = Cipher.getInstance(CBC_PKCS5_PADDING);
        IvParameterSpec iv = new IvParameterSpec(IV_KEY.getBytes(), 0, 16);
        cipher.init(Cipher.DECRYPT_MODE, skeySpec, iv);
        byte[] decrypted = cipher.doFinal(encrypted);
        return decrypted;
    }
}
