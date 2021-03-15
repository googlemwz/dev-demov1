package com.mwz.test;

/**
 * @description:
 * @author: Wenzhong.Ma
 * @create: 2020-12-25 12:50
 **/

public class StringBufferTest {

    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();

        for (int i=0;i<=4;i++){
            stringBuffer.append("str"+i+",");
        }


        System.out.println(stringBuffer);
        System.out.println(stringBuffer.substring(0,stringBuffer.lastIndexOf(",")-1));



    }
}
