package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public static WebDriver driver;
	
	By Usernamefield=By.name("username");
	By Usernamefieldie=By.xpath("//input[@class='form-control' and @name='username' and @type='text']");
	By Passwordfield=By.name("password");
	By Passwordfieldie=By.xpath("//input[@class='form-control' and @name='password' and @type='password']");
	By Loginbtn=By.xpath("//input[@value='Login']");
	By Loginbtnie=By.xpath("//input[@class='login-btn btn-primary' and @type='submit' and @value='Login']");
	
	
	public LoginPage(WebDriver driver ) {
		// TODO Auto-generated constructor stub
		LoginPage.driver=driver;
	}

	public WebElement getusernameie()
	{
		return driver.findElement(Usernamefieldie);
		
	}
	
	public WebElement getusername()
	{
		return driver.findElement(Usernamefield);
		
	}
	
	public WebElement getpasswordie()
	{
		return driver.findElement(Passwordfieldie);
	}

	public WebElement getpassword()
	{
		return driver.findElement(Passwordfield);
	}
	
	public WebElement getloginbtn()
	{
		return driver.findElement(Loginbtn);
	}
	
	public WebElement getloginbtnie()
	{
		return driver.findElement(Loginbtnie);
	}
		
		
}
