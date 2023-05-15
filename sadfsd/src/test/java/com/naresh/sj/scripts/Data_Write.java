package com.naresh.sj.scripts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_Write {
	public void Data_Write(String sheetname,String Value,int row,int cell) throws IOException
	{
		String path1=("C:\\Users\\Admin\\Desktop\\Book2.xlsx");
		//File book=new File(path1);
		FileInputStream fl=new FileInputStream(path1);
		XSSFWorkbook wb1=new XSSFWorkbook(fl);
		XSSFSheet sh1=wb1.getSheet(sheetname);
		
		sh1.getRow(row).getCell(cell).setCellValue(Value);
	FileOutputStream fl1=new FileOutputStream("C:\\Users\\Admin\\Desktop\\Book2.xlsx");
		fl1.close();
		
	}
 public static void main(String[] args) throws IOException {
	 Data_Write obj=new Data_Write();
	 obj.Data_Write("Sheet1","Gold",1,1);
	// obj.Data_Write("Sheet1", "Hani", 2, 1);
	 
 }
}
