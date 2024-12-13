package Listeners_Driver_Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;

public class DriverListnerEx {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		WebdriverListners wd = new WebdriverListners();
		
		WebDriver driverWatch = new EventFiringDecorator(wd).decorate(driver);
		
		driverWatch.get("https://javabykiran.com/selenium/admin.html");
		driverWatch.manage().window().maximize();
		
		driverWatch.findElement(By.xpath("//*[@id=\"categories-table\"]/tbody/tr[1]/td[5]/button[2]")).click();
		driverWatch.switchTo().alert().accept();
		driverWatch.close();
		  
	}

}
