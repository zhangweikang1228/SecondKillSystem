package com.kang.seckillmall.utils;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * @projectName: secKillMall
 * @package: com.kang.seckillmall.tuils
 * @className: MD5Util
 * @author: Weikang Zhang
 * @description: TODO
 * @date: 09/04/2023 21:45
 * @version: 1.0
 */
public class MD5Util {
    public static String getMd5(String str){
        return DigestUtils.md5Hex(str);
    }

    private static final String salt = "1a2b3c4d";

    public static String inputPassToFormPass(String inputPas){
        String str = "" + salt.charAt(0) + salt.charAt(2) + inputPas + salt.charAt(5) + salt.charAt(4);
        return getMd5(str);
    }


    public static String formPassToDBPass(String inputPas,String salt){
        String str = "" + salt.charAt(0) + salt.charAt(2) + inputPas + salt.charAt(5) + salt.charAt(4);
        return getMd5(str);
    }

    public static String inputPassToDBPass(String inputPas,String salt){
        String fromPass = inputPassToFormPass(inputPas);
        String dbPass = formPassToDBPass(fromPass,salt);
        return dbPass;
    }

    public static void main(String[] args) {
        //16add37301c95de2bc7abe1788a752e7
        System.out.println(inputPassToFormPass("123456"));
        //ebf3c29f2cb675c999d2a21053ada53a
        System.out.println(formPassToDBPass("d3b1294a61a07da9b49b6e22b2cbd7f9", "1a2b3c4d"));
        //ebf3c29f2cb675c999d2a21053ada53a
        System.out.println(inputPassToDBPass("123456", "1a2b3c4d"));
    }

}
