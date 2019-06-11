package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccessDeniedPage {

	
	public WebDriver driver;

	public AccessDeniedPage(WebDriver driver ) 
	{
		// TODO Auto-generated constructor stub
		this.driver=driver;

	}
	

	By backBtn=By.linkText("BACK");
	
	public WebElement getbackBtn()
	{
		return driver.findElement(backBtn);
	}

}


