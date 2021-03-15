package com.mwz;

import sun.security.provider.MD5;

import java.security.MessageDigest;

/**
 * @description:
 * @author: Wenzhong.Ma
 * @create: 2021-03-14 19:06
 **/

public class TestDemo {

    //盐，用于混交md5
    private static final String slat = "&%5123***&&%%$$#@";


    public static String encrypt(String dataStr) {
        try {

            MessageDigest m = MessageDigest.getInstance("MD5");
            m.update(dataStr.getBytes("UTF8"));
            byte s[] = m.digest();
            String result = "";
            for (int i = 0; i < s.length; i++) {
                result += Integer.toHexString((0x000000FF & s[i]) | 0xFFFFFF00).substring(6);
            }
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "";
    }


    public static void main(String[] args) {
         String str ="54533126";
//盐，用于混交md5

        String md5 = TestDemo.encrypt(str);
        System.out.println(md5);

        String str1 ="5";
        String md51 = TestDemo.encrypt(str1);
        System.out.println(md51);





             int tt[]={1,2,3,4,5,6,7,8,9};

    }
}
