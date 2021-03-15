package com.mwz.test;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: Wenzhong.Ma
 * @create: 2020-09-23 09:34
 **/

public class TestMapPrint {


    public static void main(String[] args) {


        while (  true ){
            Map<String, String> map = new HashMap<String,String>();
            map.put("aa", "ssssss");
            map.put("bb", "cccccc");
            map.put("cc", "ffffff");
            map.put("dd", "gggggg");
            map.put("ee", "kkkkkk");

            String contaions = "aa";
            System.out.println("before: contains " + contaions + " : " + map.containsKey(contaions));
            System.out.println( "text:"+ map.toString() );
            // System.out.println("before: map = " + JSONObject.toJSONString(map, SerializerFeature.WriteMapNullValue));
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("remove: " + contaions);
            map.remove(contaions);
            System.out.println("after remove: contains " + contaions + " : " + map.containsKey(contaions));
            System.out.println( "text:"+ map.toString() );
            //System.out.println("after remove: map = " + JSONObject.toJSONString(map, SerializerFeature.WriteMapNullValue));
            //System.out.println("----------------------------------------------------------------------------");
            System.out.println("put null: " + contaions);
            //map.put(contaions, null);
            //System.out.println("after put null: contains " + contaions + " : " + map.containsKey(contaions));
            //System.out.println("after put null: map = " + JSONObject.toJSONString(map, SerializerFeature.WriteMapNullValue));

        }


        }
}
