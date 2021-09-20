package listner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listner.Listners.class)

public class TestCase {

	public static WebDriver driver;

	@BeforeMethod
	public void launch() {

		String URL = System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\52089263\\Downloads\\software\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();

	}

	@Test
	public void match() {

		String Actual = driver.getTitle();
		String Expected = "Welcome: Mercury Tours1";
		Assert.assertEquals(Actual, Expected);

	}

	@AfterMethod
	public void close() {
		driver.quit();
	}

}
