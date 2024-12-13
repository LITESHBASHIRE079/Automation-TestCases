package com.tka1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");
		
		driver.findElement(By.id("first_name")).sendKeys("litesh");
		
		Actions ac = new Actions(driver);
		
		ac.keyDown(Keys.CONTROL);
		ac.sendKeys("A");
		
	}

}
