package com.tka;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindAll;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGLoginAuto {

	@Test
	public void testheading1() {

		WebDriver d = new ChromeDriver();
		d.get("https://javabykiran.com/selenium/login.html");

		String txt = d.findElement(By.xpath("//h1")).getText();
		d.quit();
		Assert.assertEquals(txt, "Welcome Back");

	}

	@Test
	public void testheading2() {
		WebDriver d = new ChromeDriver();
		d.get("https://javabykiran.com/selenium/login.html");

		String txt = d.findElement(By.xpath("//p[@class='subtitle']")).getText();
		d.quit();
		Assert.assertEquals(txt, "Login to manage your tests and categories");

	}

	@Test
	public void testusernametext() {
		WebDriver d = new ChromeDriver();
		d.get("https://javabykiran.com/selenium/login.html");

		String txt = d.findElement(By.xpath("//label[@for='username']")).getText();
		d.quit();
		Assert.assertEquals(txt, "username");
	}

	@Test
	public void testpasswdtext() {
		WebDriver d = new ChromeDriver();
		d.get("https://javabykiran.com/selenium/login.html");

		String txt = d.findElement(By.xpath("//label[@for='password']")).getText();
		d.quit();
		Assert.assertEquals(txt, "Password");
	}

	@Test
	public void testloginbuttontext() {
		WebDriver d = new ChromeDriver();
		d.get("https://javabykiran.com/selenium/login.html");

		String txt = d.findElement(By.xpath("//button[@type='submit']")).getText();
		d.quit();
		Assert.assertEquals(txt, "Login");
	}

	@Test
	public void testlogininvalidError() {
		WebDriver d = new ChromeDriver();
		d.get("https://javabykiran.com/selenium/login.html");
		d.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		d.findElement(By.xpath("//input[@id='password']")).sendKeys("password123");
		d.findElement(By.xpath("//button[@type='submit']")).click();
		

		String txt = d.findElement(By.xpath("//p[@id='error-message']")).getText();
		d.quit();
		Assert.assertEquals(txt, "Invalid username or password");
	}

	@Test
	public void testcolorofloginbutton() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/login.html");

		String txt = driver.findElement(By.xpath("//button[@type='submit']")).getCssValue("background-color");

		driver.close();

		Assert.assertEquals(txt, "blue");// [rgba(0, 86, 168, 1)]

	}

	@Test
	public void testtologinintosysytem() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/login.html");

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		

		String txt = driver.getTitle();

		driver.close();

		Assert.assertEquals(txt, "Admin Panel - Manage Categories");

	}

	@Test
	public void testcatagory() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/login.html");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		String txt = driver.findElement(By.xpath("//h2")).getText();
		System.out.println(txt);
		driver.close();

		Assert.assertEquals(txt, "Categories");

	}

	@Test
	public void testHeadingAdminPage() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/login.html");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		String txt = driver.findElement(By.xpath("//h1")).getText();

		driver.close();

		Assert.assertEquals(txt, "Admin Panel");

	}

	@Test
	public void testaddcatagory() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/login.html");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("//button[@id='add-category']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Java");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		String txt = driver.findElement(By.xpath("//td[text()='Java']")).getText();

		driver.close();
//EXCEL 
		//Assert.assertEquals(txt, ZERO ROW AND FIRST COLUMN (1));

	}

	@Test
	public void testaddcatagory1() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/login.html");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		String txt = driver.findElement(By.xpath("//td[text()='Java']")).getText();

		driver.close();

		Assert.assertEquals(txt, "Java");

	}

	@Test
	public void testaddcategoryID() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/login.html");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		String txt = driver.findElement(By.xpath("//th[text()='Category ID']")).getText();

		driver.close();

		Assert.assertEquals(txt, "category ID");

	}

	@Test
	public void testaddcategoryname() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/login.html");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		

		String txt = driver.findElement(By.xpath("//th[text()='Category Name']")).getText();

		driver.close();

		Assert.assertEquals(txt, "category Name");

	}

	@Test
	public void testsubcategoryID() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/login.html");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.linkText("Subcategories")).click();

		String txt = driver.findElement(By.xpath("//h2")).getText();
		
		driver.close();

		Assert.assertEquals(txt, "subcategories");

	}

	@Test
	public void testsubcategoryname() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/login.html");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.linkText("Subcategories")).click();

		String txt = driver.findElement(By.xpath("//th[text()='Subcategory Name']")).getText();

		driver.close();

		Assert.assertEquals(txt, "Subcategories name");

	}

	@Test
	public void testsubParentcategory() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/login.html");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.linkText("Subcategories")).click();

		String txt = driver.findElement(By.xpath("//th[text()='Parent Category']")).getText();
		driver.close();

		Assert.assertEquals(txt, "subcategories name");

	}

	@Test
	public void testaddsubcatagory() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/login.html");
		driver.get("https://javabykiran.com/selenium/login.html");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.linkText("Subcategories")).click();
		
		driver.findElement(By.xpath("//button[@id='add-subcategory']")).click();
		driver.findElement(By.xpath("//input[@id='subcategory-name']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//select[@id='parent-category']")).click();
		driver.findElement(By.xpath("//select[@id='parent-category']/option[3]")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		String txt = driver.findElement(By.xpath("//td[text()='Selenium']")).getText();
		driver.close();

		Assert.assertEquals(txt, "Selenium");

	}
	
	@Test
	public void testcdeletebutton() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/login.html");
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password123");
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/button")).click();
		
		driver.findElement(By.xpath("//*[@id=\"categories-table\"]/tbody/tr[1]/td[5]/button[2]")).click();
		driver.switchTo().alert().accept();

		String txt = driver.findElement(By.xpath("//*[@id=\"categories-table\"]/tbody/tr[1]/td[5]/button[2]")).getText();
		driver.close();

		Assert.assertEquals(txt, "Delete");

	}
	
	@Test
	public void testcdeletebuttoncolor() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/login.html");
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password123");
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/button")).click();

		String txt = driver.findElement(By.xpath("//*[@id=\"categories-table\"]/tbody/tr[1]/td[5]/button[2]")).getCssValue("background-color");

		driver.close();

		Assert.assertEquals(txt, "red");// [rgba(0, 86, 168, 1)]

	}

	@Test
	public void testloginbutton() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/login.html");
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password123");
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/button")).click();
		driver.findElement(By.xpath("/html/body/header/nav/a[3]")).click();

		String txt = driver.getTitle();
		driver.close();

		Assert.assertEquals(txt, "Login");

	}
	
	@Test
	public void testcdeletebutton1() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/login.html");
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password123");
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/button")).click();
		
		ArrayList<String> a = new ArrayList<String>();
		
		String catname = driver.findElement(By.xpath("//*[@id=\"categories-table\"]/tbody/tr[1]/td[2]")).getText();
		String catname1 = driver.findElement(By.xpath("//*[@id=\"categories-table\"]/tbody/tr[2]/td[2]")).getText();
		a.add(catname);
		a.add(catname1);
		
		
		String txt = driver.findElement(By.xpath("//*[@id=\"categories-table\"]/tbody/tr[1]/td[5]/button[2]")).getText();
		driver.close();

		Assert.assertEquals(txt, "Delete");

	}

}
