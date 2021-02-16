package com.mwz.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @description:
 * @author: Wenzhong.Ma
 * @create: 2021-02-16 10:46
 **/

public class SimpleDateFormatTest {

    public static void main(String[] args) {


        SimpleDateFormatTest simpleDateFormatTest = new SimpleDateFormatTest();
        simpleDateFormatTest.createFile();

    }

    /**
     * @Author wenzhong.ma
     * @Description 在指定目录创建文件，并写入内容
     * @Date 11:36 上午 2021/2/16
     * @Param []
     * @return void
     **/

    public void createFile(){
        try{
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd_HHmmSS");
            String filePath  = sdf.format(new Date());
            File file = new File(filePath+"/timefile.txt");
            System.out.println("file.getParentFile():"+file.getParentFile());
            System.out.println("file.getParentFile():"+file.getAbsolutePath());
            System.out.println("file.getParentFile():"+file.getPath());
            if(!file.getParentFile().exists()){
                System.out.println("-- start 创建目录");
                file.getParentFile().mkdirs();
            }

            file.createNewFile();
            FileWriter fw = new FileWriter( new File(filePath+"/"+filePath+"_timefile.txt"));
            BufferedWriter bw= new BufferedWriter( fw);
            bw.write(filePath);

            bw.flush();
            bw.close();
            fw.close();

        }catch ( Exception e){

            e.printStackTrace();
        }
    }

    public String getFilePath(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd_HHmmSS");
        String filePath  = sdf.format(new Date());
        return filePath;
    }


    public void createFileforPath1(String filePath){
        try{

            File file = new File(filePath+"/timefile.txt");
            System.out.println("file.getParentFile():"+file.getParentFile());
            System.out.println("file.getParentFile():"+file.getAbsolutePath());
            System.out.println("file.getParentFile():"+file.getPath());
            if(!file.getParentFile().exists()){
                System.out.println("-- start 创建目录");
                file.getParentFile().mkdirs();
            }

            file.createNewFile();
            FileWriter fw = new FileWriter( new File(filePath+"/"+filePath+"_timefile.txt"));
            BufferedWriter bw= new BufferedWriter( fw);
            bw.write(filePath);

            bw.flush();
            bw.close();
            fw.close();

        }catch ( Exception e){

            e.printStackTrace();
        }finally {

        }
    }

    public void createFileforPath(String filePath){
        try{

            File file = new File(filePath+"/timefile.txt");
            System.out.println("file.getParentFile():"+file.getParentFile());
            System.out.println("file.getParentFile():"+file.getAbsolutePath());
            System.out.println("file.getParentFile():"+file.getPath());
            if(!file.getParentFile().exists()){
                System.out.println("-- start 创建目录");
                file.getParentFile().mkdirs();
            }

            file.createNewFile();
            FileWriter fw = new FileWriter( new File(filePath+"/"+filePath+"_timefile.txt"));
            BufferedWriter bw= new BufferedWriter( fw);
            bw.write(filePath);

            bw.flush();
            bw.close();
            fw.close();

        }catch ( Exception e){

            e.printStackTrace();
        }finally {

        }
    }
    
     public void createFilePath(String filePath){
        try{

            File file = new File(filePath+"/timefile.txt");
            System.out.println("file.getParentFile():"+file.getParentFile());
            System.out.println("file.getParentFile():"+file.getAbsolutePath());
            System.out.println("file.getParentFile():"+file.getPath());
            if(!file.getParentFile().exists()){
                System.out.println("-- start 创建目录");
                file.getParentFile().mkdirs();
            }

            file.createNewFile();
            FileWriter fw = new FileWriter( new File(filePath+"/"+filePath+"_timefile.txt"));
            BufferedWriter bw= new BufferedWriter( fw);
            bw.write(filePath);

            bw.flush();
            bw.close();
            fw.close();

        }catch ( Exception e){

            e.printStackTrace();
        }finally {

        }
    }

    public void createExcelFile(){
        try{
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd_HHmmSS");
            String filePath  = sdf.format(new Date());
            File file = new File(filePath+"/timefile.txt");

            if(!file.getParentFile().exists()){
                System.out.println("-- start 创建目录");
                file.getParentFile().mkdirs();
            }

            file.createNewFile();

        }catch ( Exception e){

            e.printStackTrace();
        }
    }
    public void createNullFile(){
        try{
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd_HHmmSS");
            String filePath  = sdf.format(new Date());
            File file = new File(filePath+"/timefile.txt");

            if(!file.getParentFile().exists()){
                System.out.println("-- start 创建目录");
                file.getParentFile().mkdirs();
            }

            file.createNewFile();

        }catch ( Exception e){

            e.printStackTrace();
        }
    }

    
    
    public void createNullFile(){
        try{
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd_HHmmSS");
            String filePath  = sdf.format(new Date());
            File file = new File(filePath+"/timefile.txt");
         
            if(!file.getParentFile().exists()){
                System.out.println("-- start 创建目录");
                file.getParentFile().mkdirs();
            }

            file.createNewFile();
            
        }catch ( Exception e){

            e.printStackTrace();
        }
    }
    
    

}
