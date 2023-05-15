package com.naresh.sj.scripts;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class DataWr {
	public void Data_Wr() throws IOException {
	String path2=("C:\\Users\\Admin\\Desktop\\Book3.xlsx");
	HSSFWorkbook wb2=new HSSFWorkbook();
	HSSFSheet sh2=wb2.createSheet("Sheet1");
	HSSFRow rw=sh2.createRow(0);
	rw.createCell(0).setCellValue("Ok");
	rw.createCell(1).setCellValue("Done");
	rw.createCell(2).setCellValue(" But");
	
	FileOutputStream flo=new FileOutputStream(path2);
	wb2.write(flo);
	flo.close();
	wb2.close();
	}
	public static void main(String[] args) throws IOException {
		DataWr obj=new DataWr();
		obj.Data_Wr();
	}
}
