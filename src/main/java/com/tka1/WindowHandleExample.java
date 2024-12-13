package com.tka1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandleExample {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		
		WebElement webele = driver.findElement(By.linkText("Myntra"));
		webele.click();
		
		Set<String> windIds = driver.getWindowHandles();
		Iterator<String> ids = windIds.iterator();
		String pid = ids.next();
		String cid = ids.next();
		
		driver.switchTo().window(cid);
		String cidTitle = driver.getTitle();
		
		System.out.println(cidTitle);
		
	}

}
