package com.tka1;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class DataproviderExample {
  @Test(dataProvider = "logindata")
  public void f(String u, String p) {
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://javabykiran.com/selenium/login.html");
	  
	  driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(u);
	  driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(p);
	  driver.findElement(By.xpath("//*[@id=\"login-form\"]/button")).click();
	  
	  String txt = driver.getTitle();
	  
	  Assert.assertEquals(txt, "Admin Panel - Manage Categories");
	  
	  
  }

  @DataProvider
  public Object[][] logindata() {
    return new Object[][] {
      new Object[] { "admin", "password123" },
      new Object[] { "admin1", "password" },
    };
  }
}
