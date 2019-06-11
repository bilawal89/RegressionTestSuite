package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ComparePage {
	public WebDriver driver ;
	
	public ComparePage(WebDriver driver) 
	{
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
		
		By EmailLink=By.xpath("//a[@class='action-icon icon-mail']");
		By EmailTxtbox=By.xpath("//input[@name='email_addresses']");
		By Sendbtn=By.xpath("//button[@class='btn btn-primary']");
		By Sendingbtn=By.xpath("//button[text()='Sending...']");
		//By favLink=By.xpath("(//a[text()='Add to Favorites'])[1]");
		By favlink=By.xpath("(//a[contains(@id,'fav_btn_')])[1]");
		By favlink2=By.xpath("(//*[contains(@id,'fav_btn')])[2]");
		By Add2Cart=By.xpath("(//a[@class='add_to_cart btn btn-primary tt-wrapper'])[2]");
		By removelink=By.xpath("(//a[@class='x'])[1]");
		By Closelink=By.xpath("(//button[@class='mfp-close'])[1]");
		By Compare1stImage=By.xpath("(//img[contains(@src,'http://cdn.cnetcontent.com/')])[1]");
		
		public List<WebElement> getCompare1stImageCount()
		{
			return driver.findElements(Compare1stImage);
		}
		
		public WebElement getfavlink2()
		{
			return driver.findElement(favlink2);
		}
		
		public WebElement getCloselink()
		{
			return driver.findElement(Closelink);
		}
		
		public WebElement getremovelink()
		{
			return driver.findElement(removelink);
		}
	
		public WebElement getAdd2Cart()
		{
			return driver.findElement(Add2Cart);
		}
		
		public WebElement getfavLink()
		{
			return driver.findElement(favlink);
		}
		
		public WebElement getSendbtn()
		{
			return driver.findElement(Sendbtn);
		}
		
		
		
		public WebElement getEmailLink()
		{
			return driver.findElement(EmailLink);
		}
		
		
		public WebElement getEmailTxtbox()
		{
			return driver.findElement(EmailTxtbox);
		}
		
		public WebElement getSendingbtn()
		{
			return driver.findElement(Sendingbtn);
		}
		
		
	}	
			
		
		

	
