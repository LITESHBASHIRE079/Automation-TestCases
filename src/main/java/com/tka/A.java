package com.tka;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
	public static void main(String[] args) {

		String text = null;
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/admin.html");

		/*
		 * driver.findElement(By.xpath(
		 * "//*[@id=\"categories-table\"]/tbody/tr[1]/td[5]/button[2]")).click();
		 * driver.switchTo().alert().accept();
		 */

		List<WebElement> rowele = driver.findElements(By.xpath("//table[@id='categories-table']//tr"));
		int rows = rowele.size();

		List<WebElement> colele = driver.findElements(By.xpath("//table[@id='categories-table']//tr/th"));
		int cols = colele.size();

		for (int i = 1; i < rows; i++) {
			for (int j = 1; j <= cols; j++) {

				text = driver.findElement(By.xpath("//*[@id=\"categories-table\"]/tbody/tr[" + i + "]/td[" + j + "]"))
						.getText();
				System.out.print(text + "||");

			}

			System.out.println();
		}

		boolean deleted = true;
		for (WebElement elements : rowele) {
			if (elements.getText().contains("Mathematics")) {
				deleted = false;
				break;
			}

		}

		System.out.println(deleted);

		driver.quit();
	}
}
