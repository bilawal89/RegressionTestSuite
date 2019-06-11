package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AudioCablesPage {
	
	public WebDriver driver;

	public AudioCablesPage(WebDriver driver ) 
	{
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

By AddToCartBtn=By.xpath("//*[@id='add_to_cart_5545360']");
By AddToCartBtnDisablebtn=By.xpath("//*[@class='add_to_cart btn btn-primary disabled tt-wrapper']");
By AddTofavrtLink=By.xpath("//a[@id='fav_btn_5545360']");
	
	public WebElement getAddToCartBtn()
	{
		return driver.findElement(AddToCartBtn);
	}
	public WebElement getAddToCartBtnDisablebtn()
	{
		return driver.findElement(AddToCartBtnDisablebtn);
	}
	public WebElement getAddTofavrtLink()
	{
		return driver.findElement(AddTofavrtLink);
	}
	
}
