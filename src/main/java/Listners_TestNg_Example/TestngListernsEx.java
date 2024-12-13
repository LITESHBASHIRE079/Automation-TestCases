package Listners_TestNg_Example;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestngListernsEx  {
	
	@Test
	public void test1() {
		System.out.println("test1");
		Assert.assertEquals(2, 2);
	}
	
	@Test
	public void test2() {
		System.out.println("test2");
		Assert.assertEquals(1, 3);
	}

}
