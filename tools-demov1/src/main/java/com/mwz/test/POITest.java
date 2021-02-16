package com.mwz.test;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.hssf.usermodel.HSSFDataValidation;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.util.CellRangeAddressList;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.SimpleFormatter;

/**
 * @description:
 * @author: Wenzhong.Ma
 * @create: 2021-01-12 00:00
 **/

public class POITest {


    public static void main(String[] args) throws IOException {

        POITest test = new POITest();
        test.createExcleFile4Cell();
    }


    /**
     * @Author wenzhong.ma
     * @Description 创建文档测试
     * @Date 11:13 上午 2021/2/13
     * @Param []
     * @return void
     **/

    public String genDateFileName(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmSS");
        return  sdf.format(new Date());
    }
    public void createExcleFile(){
        try{
            HSSFWorkbook hssfWorkbook = new HSSFWorkbook();
            HSSFSheet hssfSheet1= hssfWorkbook.createSheet("poi文档创建测试目录1");
            HSSFSheet hssfSheet2= hssfWorkbook.createSheet("poi文档创建测试目录2");
            HSSFSheet hssfSheet3= hssfWorkbook.createSheet("poi文档创建测试目录3");
            hssfWorkbook.write(new FileOutputStream(new File(genDateFileName()+".xls")));
        }catch (Exception e) {

            e.printStackTrace();
        }
    }

    /**
     * @Author wenzhong.ma
     * @Description
     * @Date 4:23 上午 2021/2/16
     * @Param []
     * @return void
     **/
    public void createExcleFile4Cell(){
        try{
            HSSFWorkbook hssfWorkbook = new HSSFWorkbook();
            HSSFSheet hssfSheet1= hssfWorkbook.createSheet("poi文档创建测试目录1");


            String titleHead[] = {"姓名","性别","手机号","住址","单位","紧急联系人","联系电话"};

            HSSFRow row = hssfSheet1.createRow(0);
            for (int i= 0;i<titleHead.length;i++){
                HSSFCell cell= row.createCell(i);
                cell.setCellValue(titleHead[i]);
            }
            hssfWorkbook.write(new FileOutputStream(new File(genDateFileName()+".xls")));

        }catch (Exception e) {

            e.printStackTrace();
        }
    }

    public void createExcleFile4Cellvalue(){
        try{
            HSSFWorkbook hssfWorkbook = new HSSFWorkbook();
            HSSFSheet hssfSheet1= hssfWorkbook.createSheet("poi文档创建测试目录1");


            String titleHead[] = {"姓名","性别","手机号","住址","单位","紧急联系人","联系电话"};

            HSSFRow row = hssfSheet1.createRow(0);
            for (int i= 0;i<titleHead.length;i++){
                HSSFCell cell= row.createCell(i);
                cell.setCellValue(titleHead[i]);
            }

            row = hssfSheet1.createRow(0);
            for (int i= 0;i<titleHead.length;i++){
                HSSFCell cell= row.createCell(i);
                cell.setCellValue(titleHead[i]);
            }

            hssfWorkbook.write(new FileOutputStream(new File(genDateFileName()+".xls")));

        }catch (Exception e) {

            e.printStackTrace();
        }
    }


    public void testPoi() throws IOException {
        HSSFWorkbook hssfWorkbook = new HSSFWorkbook();
        HSSFSheet sheet = hssfWorkbook.createSheet();
        HSSFRow row = sheet.createRow(0);
        row.createCell(0).setCellValue("名称");
        row.createCell(1).setCellValue("类型");
        String col = "JGLX";   //机构类型
        Map<String, String> boxMap = new HashMap<String, String>();
        boxMap.put("JGLX", "1类型,2类型,3类型");
        //指定将下拉框添加至1-10行，0-0列。即第一列的第2到11行
        HSSFDataValidation dataValidation = createBox(col, boxMap , 1 , 10 , 0 , 0);
        if(dataValidation != null) {
            sheet.addValidationData(dataValidation);
        }
        FileOutputStream out = new FileOutputStream("test1.xls");
        hssfWorkbook.write(out);
        out.close();
    }

    /**
     *  excel导出，有码值的数据使用下拉框展示。
     * @param col             列名
     * @param boxMap          码值集合
     * @param firstRow        插入下拉框开始行号
     * @param lastRow         插入下拉框结束行号
     * @param firstCol        插入下拉框开始列号
     * @param lastCol         插入下拉框结束行号
     * @return
     */
    public HSSFDataValidation createBox(String col, Map<String , String> boxMap , int firstRow, int lastRow, int firstCol, int lastCol) {
        HSSFDataValidation dataValidation = null;
        //查询码值表
        String cols = "";
        if(null != boxMap.get(col)) {
            cols = boxMap.get(col);
        }
        //设置下拉框
        if(cols.length() > 0 && null != cols) {
            String str[] = cols.split(",");
            //指定0-9行，0-0列为下拉框
            CellRangeAddressList cas = new CellRangeAddressList(firstRow , lastRow , firstCol , lastCol);
            //创建下拉数据列
            DVConstraint dvConstraint = DVConstraint.createExplicitListConstraint(str);
            //将下拉数据放入下拉框
            dataValidation = new HSSFDataValidation(cas, dvConstraint);
        }
        return dataValidation;
    }




}
