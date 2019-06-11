package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage {
public WebDriver driver;
	
	public CheckoutPage(WebDriver driver) 
	{
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	By Newbtn=By.xpath("//a[text()='Use This Address']");
	By PO = By.xpath("//input[@id='tbPO']");
	By BillingDropdown=By.xpath("//div[@class='predictive-dropdown-arrow']");
	By Listvalue=By.xpath("//li[@value='[object Object]']");
	By SaveBtn1=By.xpath("//a[@class='btn btn-primary btn-save']");
	By ShippingAddValue=By.xpath("(//li[@value='[object Object]'])[1]");
	By PlaceOrderBtn=By.xpath("(//a[@class='btn btn-primary btn-save placeOrderBtn'])[1]");
	By PlaceOrderBtn2=By.xpath("(//a[@class='btn btn-primary btn-save placeOrderBtn'])[2]");
	By EmailConfirm=By.xpath("//input[@id='tbEmailConfirmation']");
	By JavaClose=By.xpath("//button[@class='btn btn-default']");
	
	public WebElement getNewbtn()
	{
		return driver.findElement(Newbtn);
	}
	
	
	public WebElement getJavaClose()
	{
		return driver.findElement(JavaClose);
	}
	
	public WebElement getEmailConfirm()
	{
		return driver.findElement(EmailConfirm);
	}
	
	public WebElement PlaceOrderBtn2()
	{
		return driver.findElement(PlaceOrderBtn2);
	}
	
	public WebElement getPO()
	{
		return driver.findElement(PO);
	}
	public WebElement getBillingDropdown()
	{
		return driver.findElement(BillingDropdown);
	}

	public WebElement getListvalue()
	{
		return driver.findElement(Listvalue);
	}
	
	public WebElement getSaveBtn1()
	{
		return driver.findElement(SaveBtn1);
	}
	
	public WebElement getShippingAddValue()
	{
		return driver.findElement(ShippingAddValue);
		
	}
	
	public WebElement getPlaceOrderBtn()
	{
		return driver.findElement(PlaceOrderBtn);
	}
	
	
	
	//input[@id='tbPO']

}
