package browser.testcases;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotPartial {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		
		// full page screen shot
		File screenshotfull = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(screenshotfull, new File("D:\\Images\\GoogleLogo_screenshotfullpage.png"));
		
		
		
		// Element screen shot new way of implentation
		WebElement element = driver.findElement(By.id("hplogo"));
		File screenshotelement = element.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(screenshotelement, new File("D:\\Images\\GoogleLogo_screenshotelementnew.png"));
		

		//Element screen shot old way of implementation
		// Get entire page screenshot
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		BufferedImage fullImg = ImageIO.read(screenshot);

		// Get the location of element on the page
		Point point = element.getLocation();

		// Get width and height of the element
		int eleWidth = element.getSize().getWidth();
		int eleHeight = element.getSize().getHeight();

		// Crop the entire page screenshot to get only element screenshot
		BufferedImage eleScreenshot = fullImg.getSubimage(point.getX(), point.getY(), eleWidth, eleHeight);

		ImageIO.write(eleScreenshot, "png", screenshot);

		// Copy the element screenshot to disk
		File screenshotLocation = new File("D:\\Images\\GoogleLogo_screenshotelementold.png");

		FileHandler.copy(screenshot, screenshotLocation);
		
		driver.quit();

		// FileHandler.copy(screenshot, screenshotLocation);

	}

}
