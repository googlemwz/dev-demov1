package com.mwz.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

/**
 * @description:
 * @author: Wenzhong.Ma
 * @create: 2021-03-07 14:35
 **/
@RestController
public class redisController {

    @Autowired
    StringRedisTemplate stringRedisTemplate ;

    @GetMapping("/getUser")
    public  String write(){
        String str[] ={"key1","key2","key3","key4","key5"};
        stringRedisTemplate.opsForValue().set(str[0],"mawenzhong is "+str[0]);
        return  stringRedisTemplate.opsForValue().get(str[0]);
    }

    @GetMapping("/getInfo")
    public String getInfor(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmSSS");
        String str= "key1，key2,key3";
        return sdf.format(new Date()) + " "+ str ;
    }

    /**
     * @Author wenzhong.ma
     * @Description
     * @Date 7:47 上午 2021/3/9
     * @Param [dataMap]
     * @return java.lang.String
     **/
    @GetMapping("/getUserByResourceId")
    public String getOprStr(Map<String,String> dataMap){
        /**1.1 判断入参是否为空*/
        if( dataMap.isEmpty() ){
            return "";
        }

        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        StringBuffer sb = new StringBuffer();
        sb.append( "getOprStr: " + sdf.format(new Date()) );

        return sb.toString();
    }

}
