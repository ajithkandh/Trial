package com.naresh.sj.scripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_Read {

	public static void main(String[] args) throws IOException {
		FileInputStream path=new FileInputStream("C:\\Users\\Admin\\Desktop\\Book1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(path);
		XSSFSheet sheet=wb.getSheet("Sheet1");
		int countRow=sheet.getLastRowNum();
		int countCell=sheet.getRow(0).getLastCellNum();
		
		for(int i=0;i<countRow;i++)
		{
			XSSFRow count=sheet.getRow(i);
			for(int j=0;j<countCell;j++)
			{
				String data=count.getCell(j).toString();
				System.out.print(" || " + data);
			}
			System.out.println();
		}

	}

}
