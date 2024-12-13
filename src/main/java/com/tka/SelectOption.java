package com.tka;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class SelectOption {

	WebDriver driver = null;

	@BeforeClass
	public void openurl() {
		driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/subcategories.html");
		driver.findElement(By.xpath("//*[@id=\"add-subcategory\"]")).click();
	}

	
	
	@Test
	public void selectdropdown() {

		WebElement wb = driver.findElement(By.xpath("//*[@id=\"parent-category\"]"));

		Select select = new Select(wb);
		List<WebElement> list = select.getOptions();

		ArrayList<String> Act = new ArrayList<String>();

		for (WebElement webElement : list) {
			String text = webElement.getText();
			Act.add(text);
		}
		
		Assert.assertTrue(Act.contains("Technology"));

	}

	
	
	@Test
	public void countdropdown() {

		WebElement wb = driver.findElement(By.xpath("//*[@id=\"parent-category\"]"));

		Select select = new Select(wb);
		List<WebElement> list = select.getOptions();

		Assert.assertEquals(list.size(), 4);

	}

	
	
	@Test
	public void squeancedropdown() throws Exception {
		
		  FileInputStream fis = new FileInputStream("C:\\Users\\Lenovo\\Documents\\Manual Testing\\Book1.xls");
		  
		  Workbook workbook = Workbook.getWorkbook(fis);
		  
		  Sheet sheet = workbook.getSheet("Sheet2"); 
		  int rows = sheet.getRows(); 
		  int cols =sheet.getColumns();
		  
		  List<String> exp = new ArrayList<String>();
		  
		  for (int i = 0; i <cols; i++) { 
			  for (int j = 0; j < rows; j++) { 
				  Cell cell =sheet.getCell(i,j); 
				  String data = cell.getContents(); 
				  exp.add(data); 
				  } 
			  }

		WebElement wb = driver.findElement(By.xpath("//*[@id=\"parent-category\"]"));
		SoftAssert softAssert = new SoftAssert();
		
		
		Select select = new Select(wb);
		List<WebElement> list = select.getOptions();

		for (int i = 0; i<list.size(); i++) {
			softAssert.assertEquals(list.get(i).getText(), exp.get(i));
		}
		softAssert.assertAll();

	}

	
	@Test
	public void checkIndex() {
		WebElement wb = driver.findElement(By.xpath("//*[@id=\"parent-category\"]"));
		ArrayList<String> act = new ArrayList<String>();
		
		Select select = new Select(wb);
		List<WebElement> list = select.getOptions();
		
		for (WebElement webElement : list) {
			String data = webElement.getText();
			act.add(data);
			
		}
		int indexnum =act.indexOf("Technology");
		Assert.assertEquals(indexnum, 2);
		
	}
	
	@Test
	public void checkIndex1() {
		WebElement wb = driver.findElement(By.xpath("//*[@id=\"parent-category\"]"));
		ArrayList<String> act = new ArrayList<String>();
		
		Select select = new Select(wb);
		List<WebElement> list = select.getOptions();
		
		for (WebElement webElement : list) {
			String data = webElement.getText();
			act.add(data);
			
		}
		int indexnum =act.indexOf("Science");
		Assert.assertEquals(indexnum, 2);
		
	}
	
	
	@AfterClass
	public void closewindow() {
		driver.quit();
	}
}
