package sikuli.demo;

import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class SikuliMethods {

	static WebDriver driver;
	static String strPath = System.getProperty("user.dir");
	public static void main(String[] args) throws InterruptedException, FindFailed
	{
		System.setProperty("webdriver.chrome.driver", strPath + "\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver(); // Launch
		driver.manage().window().maximize(); // Maximize the browser window 
		driver.get("https://www.amazon.com/");
		Thread.sleep(5000);
		Screen s1 = new Screen(); // Created an object for Screen class
		Pattern Search = new Pattern(strPath + "/images/txtSEARCH.PNG");
		Thread.sleep(2000);
		s1.type(Search, "iPhone");
		
	}
	
	@Test
	public void TextboxMethods() throws FindFailed, InterruptedException 
	{
		Thread.sleep(5000);
		Screen s1 = new Screen(); // Created an object for Screen class
		Pattern Search = new Pattern(strPath + "/images/txtSEARCH.PNG");
		Thread.sleep(2000);
		s1.type(Search, "iPhone");
	}

	@BeforeClass
	public void AccessSite() 
	{
		System.setProperty("webdriver.chrome.driver", strPath + "\\browsers\\chromedriver.exe");
		driver = new ChromeDriver(); // Launch
		driver.manage().window().maximize(); // Maximize the browser window 
		driver.get("https://www.amazon.com/");
	}

	@AfterClass
	public void CloseBrowser() 
	{
		System.out.println("Executing CloseBrowser method..!"); 
		driver.quit();
		//driver.close();
	}

}
