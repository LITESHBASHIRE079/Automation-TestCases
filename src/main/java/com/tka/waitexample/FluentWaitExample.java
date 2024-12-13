package com.tka.waitexample;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitExample {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/admin.html");
		//fluent wait use polling frequency were it will check every 2 seconds for wait time of 10 seconds
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).
				withTimeout(Duration.ofSeconds(10)).
				pollingEvery(Duration.ofSeconds(2)).
				ignoring(NoSuchElementException.class);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("add-category"))).click();
				
	}

}
