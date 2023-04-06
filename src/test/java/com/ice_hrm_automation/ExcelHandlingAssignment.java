package com.ice_hrm_automation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelHandlingAssignment 
{
	public static void main(String [] args)
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		
		driver.findElement(By.xpath("//div[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[2]")).click();
		
		driver.findElement(By.xpath("//div[@class='oxd-layout-context']/div/div/div[1]/div[2]/div[3]/button")).click();
		
		//List<WebElement> Columns = driver.findElements(By.xpath("//div[@class='oxd-table orangehrm-employee-list']/div[1]/div/div"));
		List<WebElement> Columns = driver.findElements(By.xpath("//div[@class='oxd-table-header']/div/div"));
		
		int totalColumns= Columns.size();
	    System.out.println(totalColumns);
   
	    for(int i = 1; i<=Columns.size() ; i++)
    {
         String ColumnXpath ="//div[@class='oxd-table-header']/div/div["+i+"]";
	    	
	    	String ColumnName = driver.findElement(By.xpath(ColumnXpath)).getText();
	    	
	    	System.out.print(ColumnName+" ");
	    }
	   
	    
		List<WebElement> Rows = driver.findElements(By.xpath("//div[@class='oxd-table-body']/div"));//56
		
		int totalRow = Rows.size();
		System.out.println(totalRow);
		
		for(int i= 1 ; i<Rows.size(); i++)
		{
			String RowXpath= "//div[@class='oxd-table-body']/div["+i+"]/div/div";//9
			
			List<WebElement> rowsize =driver.findElements(By.xpath(RowXpath));
			
			//String RowName = rowsize.getText();
			
			//System.out.print(RowName);
			
			for(int j=1 ; j<rowsize.size();j++)
			{
				WebElement row=rowsize.get(j);
				String rowText=row.getText();
				//System.out.print(rowText);
				//String ColumnXpath ="//div[@class='oxd-table-card']/div[i]/div/div["+j+"]";
				
				
				
				//String columnName =driver.findElement(By.xpath(ColumnXpath)).getText();
				
				//System.out.print(columnName+" ");
			}
			System.out.println();
		}
		
		String filepath= "D:\\Test data.xlsx";
		
		String extension = filepath.substring(filepath.indexOf(".")+1);
		
		Workbook workbook=null;
		
		try
		{
			FileInputStream inputstream = new FileInputStream(filepath);
			
			if(extension.equals("xlsx"))
			{
				workbook = new XSSFWorkbook(inputstream);
			}
			
			else if(extension.equals("xlx"))
			{
				workbook = new HSSFWorkbook(inputstream);
			}
			
			Sheet sheet = workbook.getSheet("EmployeeRecords");
			
			if(sheet== null)
			{
				sheet = workbook.createSheet("EmployeeRecords");
			}
			
//			for(int i = 1; i<=50;i++)
//			{
//				Row row= sheet.createRow(i-1);
//				
//				for(int j= 2; j<=9;j++)
//				{
//					String xpath= "//div[@role='row']["+i+"]/div["+j+"]";
//					WebElement value = driver.findElement(By.xpath(xpath));
//					
//					Cell cell = row.createCell(j-2);
//					cell.setCellValue(value.getText());
//					
//				}
//			}
//			
//			FileOutputStream outputStream = new FileOutputStream(filepath);
//			
//			workbook.write(outputStream);
			 Columns = driver.findElements(By.xpath("//div[@class='oxd-table-header']/div/div"));
			
			for(int i=1; i<2; i++)
			{
				System.out.println("row created");
				Row row = sheet.createRow(0);
				
				for(int j = 1; j< Columns.size(); j++)
				{
					String xpath = "//div[@class='oxd-table-header']/div["+i+"]/div["+j+"]" ;
					
				    WebElement rowvalue= driver.findElement(By.xpath(xpath));
				    
				    String headerRow = rowvalue.getText();
				    
				    Cell cell = row.createCell(j-1);
				    
				    cell.setCellValue(headerRow);
				    
				    FileOutputStream outputstream = new FileOutputStream(filepath);
				    
				    workbook.write(outputstream);
				}
			}
			
			 Rows = driver.findElements(By.xpath("//div[@class='oxd-table-body']/div"));//35
			
			for(int i=2; i<Rows.size(); i++)
			{
				Row row = sheet.createRow(i-1);
				
				String RowXpath= "//div[@class='oxd-table-body']/div[1]/div/div";//9
				
				List<WebElement> rowsize =driver.findElements(By.xpath(RowXpath));
				
				for(int j = 1; j< rowsize.size(); j++)
				{
					
					
					String xpath = "div[@class='oxd-table-body']/div["+i+"]/div/div["+j+"]" ;
					
				    WebElement rowvalue= driver.findElement(By.xpath(xpath));
				    
				    String RowInside = rowvalue.getText();
				    
				    Cell cell = row.createCell(j-1);
				    
				    cell.setCellValue(RowInside);
				    
				    FileOutputStream outputstream = new FileOutputStream(filepath);
				    
				    workbook.write(outputstream);
				}
			}
			
			
			
		}
		catch(FileNotFoundException e)
		{

		}
		catch(IOException e)
		{
			
   	}
		
		
	}

}
//Incomplete