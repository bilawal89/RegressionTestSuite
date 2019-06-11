package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InvoicePage {
	public WebDriver driver ;
	
	public InvoicePage(WebDriver driver) 
	{
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	By Download= By.xpath("//a[@class='action-icon icon-download']");
	By EmailIcon=By.xpath("//a[@class='action-icon icon-mail']");
	By EmailTextbox=By.xpath("//input[@name='email_addresses']");
	By EmailSend=By.xpath("//button[@class='btn btn-primary']");
	By EmailPopupInvoice=By.xpath("(//div[@class='modal-content'])[4]");
	
	
	public WebElement getEmailPopupInvoice()
	{
		return driver.findElement(EmailPopupInvoice);
		
	}
	public WebElement getEmailSend()
	{
		return driver.findElement(EmailSend);
		
	}
	
	public WebElement getEmailTextbox()
	{
		return driver.findElement(EmailTextbox);
		
	}
	
	public WebElement getEmailIcon()
	{
		return driver.findElement(EmailIcon);
		
	}
	
	public WebElement getdownload()
	{
		return driver.findElement(Download);
		
	}
	

	
	
	
	
}
	
