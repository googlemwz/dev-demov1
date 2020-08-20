package com.mwz.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description:
 * @author: Wenzhong.Ma
 * @create: 2020-08-17 19:51
 **/

public class DemoTest {


    public static void main2(String[] args) {
        ArrayList<String> listA= new ArrayList<String>();
        listA.add("Tom");
        listA.add("Tom");
        ArrayList<String> listB= new ArrayList<String>();
        listB.add("Tom1");
        listA.retainAll(listB);
        System.out.println(listA);
        if(listA.size()>0){
            System.out.println("这两个集合有相同的交集");
        }else{
            System.out.println("这两个集合没有相同的交集");
        }
    }

    public static void main11(String[] args) {

        List<User> list1 = new ArrayList<User>();
        User user1 = new User();
        user1.setNumber("mawenzhong1");
        user1.setRoletype("sit");
        user1.setUserName("马文中1");
        user1.setStatus("1");
        list1.add(user1);


        List<User> list2 = new ArrayList<User>();
        User user2 = new User();
        user2.setNumber("mawenzhong1");
        user2.setRoletype("sit");
        user2.setUserName("马文中1");
        user2.setStatus("1");
        list2.add(user2);


        if(user1.hashCode()==user2.hashCode() ){
            System.out.println(user1.getUserName()+"hashCode相同："+user1.getUserName());
        }else{
            System.out.println(user1.getUserName()+"hashCode不相同："+user1.getUserName());
        }

//        if(user1.equals(user2)){
//            System.out.println(user1.getUserName()+"相同："+user1.getUserName());
//        }else {
//            System.out.println(user1.getUserName()+"不相同："+user1.getUserName());
//        }

        List<User> list3 = new ArrayList<User>();
         list3.addAll(list1);
         list3.addAll(list2);


        System.out.println("list3:"+list3);
        list3.retainAll(list2);
        if(list3.size()>0){
            System.out.println("存在交集");
        }else{
            System.out.println("不存在交集");
        }
        System.out.println("list3:"+list3);

    }


    public static void main(String[] args) {

        DemoTest demoTest = new DemoTest();
        demoTest.println();


        List<User> list3 = new ArrayList<User>();
        list3.add( new User("马文中1","mawenzhong1","sit","1"));
        list3.add( new User("马文中2","mawenzhong1","sit","1"));
        list3.add( new User("马文中3","mawenzhong1","sit","1"));
        list3.add( new User("马文中4","mawenzhong1","sit","1"));

        System.out.println("list3 :"+list3 );
        System.out.println("list3 size:"+list3.size());
        List<User> list4 = new ArrayList<User>();
        list4.add( new User("马文中1","mawenzhong1","sit","1"));
        list4.add( new User("马文中2","mawenzhong1","sit","1"));
        list4.add( new User("马文中3","mawenzhong1","sit2","1"));

        System.out.println("list4 :"+list4 );
        System.out.println("list4 size:"+list4.size());

        List<String> list1 = new ArrayList<String>();
        list1.add("马文中3");
        list1.add("马文中2");
        list1.add("马文中1");
        list1.add("马文中4");

        List<String> list2 = new ArrayList<String>();
        list2.add("马文中3");
        list2.add("马文中2");
        list2.add("马文中1");
        list2.add("马文中4");


//
//        list2.add("马文中4");
/*
        List<String> list3 = new ArrayList<String>();
        System.out.println("1:"+list3);
        list3.addAll(list1);
        list3.addAll(list2);
        System.out.println("2:"+list3);
        list3.retainAll(list2);
        System.out.println("2:"+list2);
        System.out.println("3:"+list3);

        List<String> list4 = new ArrayList<String>();
        list4.addAll(list1);
        list4.addAll(list2);
        System.out.println(list4);
        list4.removeAll(list3);
        System.out.println(list4);*/

        List<User> listResult = new ArrayList<User>();
        listResult = demoTest.getDif22(list3,list4);
        System.out.println( listResult );
        System.out.println( listResult.size() );


    }


    public void println(){
        System.out.println("测试打印方法【print】");
    }



    public void ListEquery(){
        List<String> list1 = new ArrayList<String>();
        list1.add("马文中1");
        list1.add("马文中2");
        list1.add("马文中3");

        List<String> list2 = new ArrayList<String>();
        list2.add("马文中1");
        list2.add("马文中2");
        list2.add("马文中3");





    }

    //1.方法一：两次循环数组+contains()方法：
    private   List<String>getDif1(List<String> l1, List<String> l2){
        long start = System.currentTimeMillis();
        List<String> dif = new ArrayList<String>();
        for(String str : l1){
            if(!l2.contains(str)){
                dif.add(str);
            }
        }
        for(String str : l2){
            if(!l1.contains(str)){
                dif.add(str);
            }
        }
        long end = System.currentTimeMillis();
        long t= start-end;
        System.out.println(dif);
        return dif;

    }

    //2.方法二：removeAll()+retainAll()方法：
    private  List<String>getDif2(List<String> l1, List<String> l2){
        long start = System.currentTimeMillis();
        List<String> dif = new ArrayList<String>();
        List<String> res = new ArrayList<String>();
        dif.addAll(l1);
        //先求出两个list的交集；
        dif.retainAll(l2);
        System.out.println("dif:"+dif);
        res.addAll(l1);
        res.addAll(l2);
        System.out.println("res:"+res);
        //用合集去掉交集，就是不同的元素；
        res.removeAll(dif);
        long end = System.currentTimeMillis();
        long t= start-end;
        System.out.println(res);
        return dif;

    }

    private  List<User>getDif22(List<User> l1, List<User> l2){
        long start = System.currentTimeMillis();
        List<User> dif = new ArrayList<User>();
        List<User> res = new ArrayList<User>();
        dif.addAll(l1);
        //先求出两个list的交集；
        dif.retainAll(l2);
        System.out.println("dif:"+dif);
        System.out.println("dif size:"+dif.size());
        res.addAll(l1);
        res.addAll(l2);
        System.out.println("res:"+res);
        System.out.println("res size:"+res.size());
        //用合集去掉交集，就是不同的元素；
        res.removeAll(dif);
        long end = System.currentTimeMillis();
        long t= start-end;
        System.out.println(res);
        return res;

    }

    //3.方法三：把数组放进map,key:string,value:次数，最后提取value=1的key;
    private static List<String>getDif3(List<String> l1, List<String> l2){
        List<String> dif = new ArrayList<String>();
        Map<String,Integer> map = new HashMap<String,Integer>();

        for (String str: l1){
            map.put(str,1);
        }
        for(String str : l2){
            if(map.get(str) != null){
                map.put(str,2);
                continue;
            }else {
                map.put(str,1);
            }
        }
        for(Map.Entry<String,Integer> en : map.entrySet()){
            if(en.getValue()==1){
                dif.add(en.getKey());
            }
        }
        System.out.println(dif);
        return dif;

    }


}
