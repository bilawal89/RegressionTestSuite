package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResultPage {
	public WebDriver driver ;
	
	public SearchResultPage(WebDriver driver) 
	{
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	By ClosePopup=By.xpath("//button[@data-dismiss='modal']");
	By prod4fav1 = By.xpath("(//a[contains(@id,'fav_btn_')])[1]");
	By tooltip=By.xpath("//div[@class='tooltip tt-text']");
	
	By prod4fav = By.xpath("(//a[contains(@id,'fav_btn_')])[1]");
	By Allfavrtlinks=By.xpath("//div[@class='compare-container clearfix']");
	By Compare1 = By.xpath("(//div[@class='control__indicator'])[1]");
	By Compare2 = By.xpath("(//div[@class='control__indicator'])[2]");
	
	By Compare3 = By.xpath("(//div[@class='control__indicator'])[6]");
	
	By CompareBtn=By.linkText("Compare");
	
	By ProductCart4=By.xpath("(//a[@class='product-name'])[4]");
	By Products = By.xpath("//div[@class='product-list-grid clearfix print-product-list grid']");
	By Product4Cart=By.xpath("//a[@id='add_to_cart_11273675']");
	By fav1Product = By.xpath("//*[@id='fav_btn_10886231']");
	By Favdialog = By.xpath("//*[@id='products-content']/div/div[2]/div/div/div[1]/h4");
	By Product1Name = By.xpath("//*[@id='product-name-10886231']");
	By Product1Cart = By.xpath("//*[@id='add_to_cart_10886231']");
	By Product5Cart= By.xpath("(//a[@data-product-type='PRODUCT'])[3]");
	//*[@id='add_to_cart_10886231']
	//By Product2Cart = By.xpath("//*[@id='add_to_cart_9707434']");
	By Product2Cart = By.xpath("//a[@id='add_to_cart_9707434']");
	By CloseIcon = By.xpath("//*[@id='cart-dialog']/div[1]/div[1]/div/div/div/button");

	By Product3Cart = By.xpath("//*[@id='add_to_cart_11224916']");
	By AddToCartCLose = By.xpath("//button[@class='mfp-close']");
	By favClose= By.xpath("//div[@class='modal-footer']//button[@class='btn btn-default' and text()='Close'][1]");
	By prod1name=By.xpath("//h2[@id='product-name-10886231']");
	
	
	public WebElement gettooltip()
	{
		return driver.findElement(tooltip);
	}
	
	
	public WebElement getClosePopup()
	{
		return driver.findElement(ClosePopup);
	}
	
	public WebElement getprod4fav1()
	{
		return driver.findElement(prod4fav1);
	}
	
	public WebElement getprod4fav()
	{
		return driver.findElement(prod4fav);
	}
	
	public WebElement getProductCart4()
	{
		return driver.findElement(ProductCart4);
	}
	
	public List<WebElement> getAllfavrtlinks()
	{
		return driver.findElements(Allfavrtlinks);
	}
	public WebElement getProduct5Cart()
	{
		return driver.findElement(Product5Cart);
	}
	
	public WebElement getCompare1()
	{
		return driver.findElement(Compare1);
	}
	
	public WebElement getCompare2()
	{
		return driver.findElement(Compare2);
	}
	
	public WebElement getCompare3()
	{
		return driver.findElement(Compare3);
	}
	
	
	public WebElement getCompareBtn()
	{
		return driver.findElement(CompareBtn);
	}
	
	public WebElement getProduct4Cart()
	{
		return driver.findElement(Product4Cart);
	}
	
	public WebElement getprod1name()
	{
		return driver.findElement(prod1name);
	}
	
	public WebElement getfavClose()
	{
		return driver.findElement(favClose);
	}
	public WebElement getCloseIcon()
	{
		return driver.findElement(CloseIcon);
	}
	public WebElement getAddToCartCLose()
	{
		return driver.findElement(AddToCartCLose);
	}
	
	public WebElement getProduct3Cart()
	{
		return driver.findElement(Product3Cart);
	}
	
	
	public WebElement getProduct1Cart()
	{
		return driver.findElement(Product1Cart);
	}
	
	public WebElement getProduct2Cart()
	{
		return driver.findElement(Product2Cart);
	}
	
	public WebElement getAllProducts()
	{
		return driver.findElement(Products);
	}
	public WebElement getFav1Product()
	{
		return driver.findElement(fav1Product);
	}
	public WebElement getFavdialog()
	{
		return driver.findElement(Favdialog);
	}
	public WebElement getProduct1Name()
	{
		return driver.findElement(prod1name);
	}
	

}
