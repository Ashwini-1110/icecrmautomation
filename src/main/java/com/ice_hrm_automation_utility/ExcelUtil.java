package com.ice_hrm_automation_utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil 
{
	 private Workbook workbook;
	 private Sheet sheet;
	 
    public Object[][] getExcelData(String filepath ,String sheetname)
      {
	  
      try
      {
   	   // here comes FileNotFoundException in FileInputStream Thats why this taken in try catch block
   	   
      FileInputStream inputstream = new FileInputStream(filepath); 
      
      String extension = filepath.substring(filepath.indexOf(".")+1);
      // to access the workbook based on extension
      if(extension.equals("xlsx")) 
        {
   	   workbook= new XSSFWorkbook(inputstream);// here comes IOException 
        }
      else if (extension.equals("xlx"))
        {
   	   workbook = new HSSFWorkbook(inputstream);
        }
       // to access sheet with the reference of workbook
       sheet = workbook.getSheet(sheetname);
      
      //to get total number of rows & columns
      
      int totalRows = sheet.getPhysicalNumberOfRows();
      
      int totalcolumns = sheet.getRow(0).getPhysicalNumberOfCells();
    
      Object[][] object = new Object[totalRows-1][totalcolumns];
      
      for(int i =1; i<totalRows ;i++) 
        {
   	   for(int j=0; j<totalcolumns;j++)
   	   {
   		// String value = sheet.getRow(i).getCell(j).getStringCellValue(); 
   		// System.out.print(value+" ");
   		 
   		   Cell cell = sheet.getRow(i).getCell(j);
   		   
   		   CellType celltype = cell.getCellType();
   		   
   		   if(celltype.equals(celltype.STRING))
   		   {
   			  object[i-1][j] =cell.getStringCellValue();
   		   }
   		   else if(celltype.equals(celltype.NUMERIC))
   		   {
   			object[i-1][j]=cell.getNumericCellValue(); 
   		   }
   		   else if(celltype.equals(celltype.BLANK))
   		   {
   			 System.out.print("Blank value"); 
   			object[i-1][j]=null;
   		   }
   		   
   	      }
   	  
        }
       workbook.close();
       inputstream.close();
       return object;
      }
	
	catch(IOException e) 
	{
		throw new RuntimeException(e);
	}
	
      }
    
}

	


