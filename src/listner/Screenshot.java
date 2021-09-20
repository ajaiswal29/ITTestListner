package listner;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot extends TestCase{

	public static void capture(String screen) {

		try {
			TakesScreenshot ts = (TakesScreenshot) driver;

			File source = ts.getScreenshotAs(OutputType.FILE);

			FileHandler.copy(source, new File("./screenshot/" + screen + ".png"));
		} catch (Exception e) {

			System.out.println("Exception while taking screesnhot" + e.getMessage());

		}

	}

}
