package com.ice_hrm_automation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHandlingReadData {

	public static void main(String[] args) 
	{
       String filepath = "E:\\Test data.xlsx";	
       
       String extension = filepath.substring(filepath.indexOf(".")+1);
       
       System.out.println(extension);
       
       Workbook workbook = null;
       
       
       try
       {
    	   // here comes FileNotFoundException in FileInputStream Thats why this taken in try catch block
    	   
       FileInputStream inputstream = new FileInputStream(filepath); 
       
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
       Sheet sheet = workbook.getSheet("Creditials");
       
       //to get total number of rows & columns
       
       int totalRows = sheet.getPhysicalNumberOfRows();
       
       System.out.println(totalRows);
       int totalcolumns = sheet.getRow(0).getPhysicalNumberOfCells();
       System.out.println(totalcolumns);
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
    			  System.out.print(cell.getStringCellValue()+ " "); 
    		   }
    		   else if(celltype.equals(celltype.NUMERIC))
    		   {
    			  System.out.print(cell.getNumericCellValue()+" "); 
    		   }
//    		   else if(celltype.equals(celltype.BLANK)|| celltype.equals(celltype._NONE))
//    		   {
//    			 System.out.print(" ");  
//    		   }
    		   
    	   }
    	   System.out.println();
         }
        workbook.close();
       }
	
	catch(FileNotFoundException e) 
	{
		
	}
	catch(IOException e)
	{
		
	}
      
	}
}

