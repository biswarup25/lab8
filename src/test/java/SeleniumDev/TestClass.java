package SeleniumDev;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass {

//	@Test
//	public static void testMethod1() {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BISWARUPCHAKRAVARTY\\Downloads\\chromedriver_win32\\chromodriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("http://www.google.com");
//		System.out.println(driver.getTitle());		
//
//	}
	@Test
	public static void testMethod1() {
		int expectedValue = 1;
		int actualValue = 1;
		Assert.assertEquals(actualValue, expectedValue,"Expected value :" + expectedValue + " Not Matched With Actual Value, Actual Value Is : " + actualValue );

	}
	
//	@Test
	public static void testMethod2() {
		int expectedValue = 1;
		int actualValue = 2;
		Assert.assertEquals(actualValue, expectedValue ,"Expected value :" + expectedValue + " Not Matched With Actual Value, Actual Value Is : " + actualValue );

	}
}
