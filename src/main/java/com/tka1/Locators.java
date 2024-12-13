package com.tka1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/login.html");
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("password123");
		driver.findElement(By.className("btn-primary")).click();
		
		driver.findElement(By.id("add-category")).click();
		driver.findElement(By.name("categoryName")).sendKeys("Java");
		driver.findElement(By.xpath("//*[@id=\"category-form\"]/div/button[1]")).click();
		driver.findElement(By.cssSelector("delete-btn"));
		driver.switchTo().alert().accept();
		//driver.quit();
		
		
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://thekiranacademy.com/tutorials/selenium/synchronizing-test-with-wait-in-selenium.php#gsc.tab=0");
		
		driver1.findElement(By.linkText("Explicit Wait")).click();
		
		
		driver1.findElement(By.partialLinkText("Fluent")).click();
	}

}
