package com.saucelabs.appium;

import java.io.FileInputStream; 
import java.io.FileOutputStream; 
import java.io.IOException; 
import java.io.InputStream; 

import org.apache.poi.hssf.usermodel.HSSFWorkbook; 
import org.apache.poi.ss.usermodel.Cell; 
import org.apache.poi.ss.usermodel.Row; 
import org.apache.poi.ss.usermodel.Sheet; 
import org.apache.poi.ss.usermodel.Workbook; 
import org.apache.poi.ss.usermodel.WorkbookFactory; 

public class testexcel {
	 //使用POI创建excel工作簿 
	public static void createWorkBook() throws IOException { 
		//创建excel工作簿 
		Workbook wb = new HSSFWorkbook(); 
		Sheet sheet = wb.createSheet("new sheet"); 
		//Row 行 
        //Cell 方格 
        // Row 和 Cell 都是从0开始计数的 
		
		Row row = sheet.createRow((short) 0); 
		// 在row行上创建一个方格 
		Cell cell = row.createCell(0); 
		cell.setCellValue(1); 
		row.createCell(1).setCellValue(1.2); 
		row.createCell(2).setCellValue("This is a string 速度反馈链接"); 
        row.createCell(3).setCellValue(true); 
		
        FileOutputStream fileOut = new FileOutputStream("workbook.xls"); 
        wb.write(fileOut); 
        fileOut.close(); 
	}
	
	public static void readWorkBook() throws Exception { 
		InputStream inp = new FileInputStream("workbook.xls"); 
		 Workbook wb = WorkbookFactory.create(inp); 
		 Sheet sheet = wb.getSheetAt(0); 
		 for (Row row : sheet) { 
	            //遍历row中的所有方格 
	            for (Cell cell : row) { 
	                //输出方格中的内容，以空格间隔 
	                System.out.print(cell.toString() + "  "); 
	            } 
	            //每一个行输出之后换行 
	            System.out.println(); 
	        } 
	        //关闭输入流 
	        inp.close(); 
		
	}
	
	 public static void main(String[] args) throws Exception { 
//		 testexcel.createWorkBook(); 
		 testexcel.readWorkBook();
	    } 
				
}








