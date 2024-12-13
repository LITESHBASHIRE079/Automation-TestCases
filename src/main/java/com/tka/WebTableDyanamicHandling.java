package com.tka;

import java.io.FileInputStream;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class WebTableDyanamicHandling {

	WebDriver driver = null;

	@BeforeClass
	public void openwebsite() {
		driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/admin.html");
	}

	
	
	@Test
	public void tablehading() {
		SoftAssert softAssert = new SoftAssert();
		ArrayList<String> Expc = new ArrayList<String>();
		Expc.add("Category ID");
		Expc.add("Category Name1");
		Expc.add("Created At");
		Expc.add("Modified At");
		Expc.add("Actions");

		ArrayList<String> Act = new ArrayList<String>();

		for (int i = 1; i <= 5; i++) {
			String txt = driver.findElement(By.xpath("//*[@id=\"categories-table\"]/thead/tr/th[" + i + "]")).getText();
			Act.add(txt);
		}
		for (int i = 0; i < Expc.size(); i++) {
			softAssert.assertEquals(Expc.get(i), Act.get(i));
		}

		softAssert.assertAll();
	}

	
	@Test
	public void tableData() {
		ArrayList<String> exp = new ArrayList<String>();
		exp.add("1");
		exp.add("Mathematics");
		exp.add("2");
		exp.add("Science");

		ArrayList<String> act = new ArrayList<String>();

		for (int i = 1; i <= 2; i++) {
			for (int j = 1; j <= 2; j++) {
				String txt = driver.findElement(By.xpath("//*[@id=\"categories-table\"]/tbody/tr[" + i + "]/td[" + j + "]")).getText();
				act.add(txt);
			}
		}

		Assert.assertEquals(exp, act);

	}

	
	
	@Test
	public void tableDataExcel() throws Exception {
		FileInputStream fis = new FileInputStream("C:\\Users\\Lenovo\\Documents\\Manual Testing\\Book1.xls");

		Workbook workbook = Workbook.getWorkbook(fis);

		Sheet sheet = workbook.getSheet(0);
		int rows = sheet.getRows();
		int cols = sheet.getColumns();

		ArrayList<String> Exp = new ArrayList<String>();

		for (int i = 1; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				Cell cell = sheet.getCell(j, i);
				String data = cell.getContents();
				Exp.add(data);
			}
		}

		ArrayList<String> Act = new ArrayList<String>();

		for (int i = 1; i <= 2; i++) {
			for (int j = 1; j <= 5; j++) {
				String txt = driver.findElement(By.xpath("//*[@id=\"categories-table\"]/tbody/tr["+i+"]/td["+j+"]")).getText();
				Act.add(txt);
			}
		}
		
		Assert.assertEquals(Act, Exp);
	}
	

	
	
	
	  @AfterClass 
	  public void close() { 
		  driver.quit(); 
	 }
	 
}
