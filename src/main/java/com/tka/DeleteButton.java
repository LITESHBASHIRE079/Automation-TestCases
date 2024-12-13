package com.tka;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DeleteButton {
	@Test
	public void delete() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/admin.html");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[@id=\"categories-table\"]/tbody/tr[2]/td[5]/button[2]")).click();
		driver.switchTo().alert().accept();
		

		List<WebElement> rowele = driver.findElements(By.xpath("//table[@id='categories-table']//tr"));

		boolean isdeleted = true;
		for (WebElement elements : rowele) {
			if (elements.getText().contains("Science")) {
				isdeleted = false;
				break;
			}
		}
		driver.quit();

		System.out.println(isdeleted);

		Assert.assertEquals(isdeleted, true);
	}
	
	@Test
	public void delete1() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/admin.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"add-category\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"category-name\"]")).sendKeys("java");
		driver.findElement(By.xpath("//*[@id=\"category-form\"]/div/button[1]")).click();
		
		/*
		 * driver.findElement(By.xpath(
		 * "//*[@id=\"categories-table\"]/tbody/tr[3]/td[5]/button[2]")).click();
		 * driver.switchTo().alert().accept();
		 */
		
		List<WebElement> list = driver.findElements(By.xpath("//table[@id='categories-table']//tr"));
		
		boolean isdelete = true;
		for (WebElement webElement : list) {
			if(webElement.getText().contains("java")) {
			isdelete = false;
			break;	
			}
		}
		
		driver.quit();
		
		Assert.assertEquals(isdelete, true); 
	}
	
	@Test
	public void delete2() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/admin.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).sendKeys("selenium");
		driver.findElement(By.xpath("")).click();
		
	}

}
