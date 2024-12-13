package com.tka.waitexample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Waitexample1 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//implicit wait 
		//it waits before every actions
		
		
		driver.get("https://javabykiran.com/selenium/admin.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(100));
		driver.findElement(By.xpath("//*[@id=\"add-category\"]")).click();

	}
}
