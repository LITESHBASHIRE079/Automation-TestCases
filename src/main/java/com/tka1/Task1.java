package com.tka1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task1 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		WebElement webEle =  driver.findElement(By.xpath("//*[@id=\"country\"]"));
		
		Select select = new Select(webEle);
		List<WebElement> list = select.getOptions();
		
		ArrayList<String> al = new ArrayList<String>();
		
		for (WebElement webElement : list) {
			String text = webElement.getText();
			al.add(text);
		}
		int num = list.size()-2;
		System.out.println(al.get(num));
		
		driver.quit();
		
		
		
	}

}
