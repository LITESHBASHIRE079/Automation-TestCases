package com.tka;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonTestNg {

	@Test
	public void testtitle() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		String txt = driver.getTitle();
		driver.quit();
		Assert.assertEquals(txt, "amazon");
	}

	@Test
	public void testheading1() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.com/");

		String txt = driver.findElement(By.xpath("//*[@id=\"nav-logo-sprites\"]")).getText();
		driver.quit();

		Assert.assertEquals(txt, "amazon");

	}

	@Test
	public void testloginpage() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in");

		driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).click();
		String txt = driver.getTitle();
		driver.quit();

		Assert.assertEquals(txt, "Amazon Sign-In");
	}

	@Test
	public void testsearchbar() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in");

		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("iphone");
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-text\"]")).click();
		String txt = driver.getTitle();
		driver.quit();

		Assert.assertEquals(txt, "Amazon.com : iphone");
	}

	@Test
	public void testaddress() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in");

		String txt = driver.findElement(By.xpath("//*[@id=\"glow-ingress-line1\"]")).getText();
		driver.quit();

		Assert.assertEquals(txt, "Pune");
	}

	@Test
	public void testmobilecategory() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in");

		driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[6]")).click();
		String txt = driver.getTitle();
		driver.quit();

		Assert.assertEquals(txt, "Mobile Phone");
	}

	@Test
	public void testbestsellers() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in");

		driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[4]")).click();
		String txt = driver.findElement(By.xpath("//*[@id=\"zg_banner_text\"]")).getText();
		driver.close();

		Assert.assertEquals(txt, "Amazon Bestsellers");
	}

	@Test
	public void testcart() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in");

		driver.findElement(By.xpath("//*[@id=\"nav-cart\"]")).click();
		String txt = driver.getTitle();
		driver.close();

		Assert.assertEquals(txt, "Cart");
	}

	@Test
	public void testpincode() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in");

		driver.findElement(By.xpath("//*[@id=\"glow-ingress-block\"]")).click();
		
		driver.getWindowHandle();
		//driver.switchTo().window("//*[@id=\"a-popover-1\"]");
		driver.findElement(By.xpath("//*[@id=\"GLUXZipUpdateInput\"]")).sendKeys("411038");

		driver.findElement(By.xpath("//*[@id=\"GLUXZipUpdate\"]/span/input")).click();

		String txt = driver.findElement(By.xpath("//span[@class='nav-line-2 nav-progressive-content']")).getText();

		driver.quit();
		Assert.assertEquals(txt, "411038");
	}

}
