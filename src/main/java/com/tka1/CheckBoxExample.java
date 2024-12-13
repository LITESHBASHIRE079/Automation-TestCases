package com.tka1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CheckBoxExample {
	
	@Test
	public void validateCheckbox() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://total-qa.com/checkbox-example/");
		
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"post-3261\"]/div/p/input[1]"));
		ele.click();
		boolean b = ele.isSelected();
		
		Assert.assertTrue(b);
	}
	
	@Test
	public void validateCheckbox1() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://total-qa.com/checkbox-example/");
		
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"post-3261\"]/div/p/input[1]"));
		WebElement ele1 = driver.findElement(By.xpath("//*[@id=\"post-3261\"]/div/p/input[3]"));
		ele.click();
		
		boolean b1 = ele.isSelected();
		SoftAssert softassert =new SoftAssert();
		softassert.assertTrue(b1);
		
		boolean b2 = ele1.isSelected();
		softassert.assertTrue(b2);
		
		softassert.assertAll();
		
	}
	

}
