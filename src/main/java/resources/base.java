package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import pageObjects.LoginPage;

	public class base {
		public static Logger Log = LogManager.getLogger(base.class.getName());
	public static WebDriver driver;
	public static String url;
	public static Properties prop;
	public static FileInputStream fis;
	public LoginPage lp;
	
	public WebDriver initializeDriver() throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\bilaw\\.jenkins\\workspace\\RegressionTestSuite\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		url = prop.getProperty("url");
		
		System.out.println("Browser selected is "+browserName);
		
		
		
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
			 driver = new ChromeDriver();
		}
		else if(browserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browserName.equals("ie"))
		{
			DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
			capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			System.setProperty("webdriver.ie.driver", "C:\\driver\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		driver.get(url);
		driver.manage().window().maximize();
		LoginPage lp = new LoginPage(driver);
		lp.getusername().sendKeys(prop.getProperty("username"));
		lp.getpassword().sendKeys(prop.getProperty("pswd"));
		lp.getloginbtn().click();	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
	}
	
	
	public WebDriver initializeDriverWithoutCredentials() throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Program Files (x86)\\Jenkins\\workspace\\SmokeTestJobChrome\\TestEcommerce1\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		url = prop.getProperty("url");
		
		System.out.println("Browser selected is "+browserName);
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
			 driver = new ChromeDriver();
		}
		else if(browserName.equals("firefox"))
		{
			System.setProperty("webdriver.firefox.driver", "C:\\driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browserName.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver", "C:\\driver\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
	}
	
	
	
	
	
	
	
	
	
	public void getScreenshot(String result) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFileToDirectory(src, new File("C:\\Automation-Snapshots\\"+result+" screenshot.png"));
	}

}
