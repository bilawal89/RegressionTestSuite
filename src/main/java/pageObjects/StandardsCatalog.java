package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StandardsCatalog {
	public WebDriver driver;
	
	public StandardsCatalog(WebDriver driver) 
	{
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	By Product1 = By.xpath("//img[@alt='10032.']");
	
	By Product1New=By.xpath("//img[@alt='Miraca monitor']");
	//By Add2cartbtn=By.xpath("//a[@class='add_to_cart btn btn-primary show-for-tablet modal-btn hide-for-print']");
	By Add2cartbtn=By.xpath("//a[@class='add_to_cart btn btn-primary show-for-tablet modal-btn hide-for-print']");
	By Closeicon=By.xpath("(//button[@title='Close (Esc)'])[2]");
	By Product2New=By.xpath("(//a[@class='image-link hitProductForDetail'])[1]");
	By ListView=By.xpath("//a[@id='bt-products-list']");
	By ListViewDsp=By.xpath("//a[@class='grid-control-icon icon-grid active']");
	By GridView=By.xpath("//a[@id='bt-products-grid']");
	By Qtybox=By.xpath("(//*[contains(@id,'product_qty_')])[1]");
	By CartBtn=By.xpath("(//*[contains(@id,'cart_btn_')])[1]");
	By favrtBtn=By.xpath("(//*[contains(@id,'fav_btn_')])[1]");
	//By Add2favReg=By.xpath("");
	By tablet=By.xpath("//a[text()='TABLETS']");
	
	public List<WebElement> getListViewDspCount()
	{
		return driver.findElements(ListViewDsp);
	}
	
	public WebElement gettablet()
	{
		return driver.findElement(tablet);
	}
	
	
	public WebElement getfavrtBtn()
	{
		return driver.findElement(favrtBtn);
	}
	
	
	public WebElement getCartBtn()
	{
		return driver.findElement(CartBtn);
	}
	
	
	
	public WebElement getQtybox()
	{
		return driver.findElement(Qtybox);
	}
	
	
	public WebElement getGridView()
	{
		return driver.findElement(GridView);
	}
	
	public WebElement getListView()
	{
		return driver.findElement(ListView);
	}
	
	public WebElement getProduct2New()
	{
		return driver.findElement(Product2New);
	}
	
	public WebElement getCloseicon()
	{
		return driver.findElement(Closeicon);
	}
	
	public WebElement getAdd2cartbtn()
	{
		return driver.findElement(Add2cartbtn);
	}
	
	
	public WebElement getProduct1()
	{
		return driver.findElement(Product1);
	}
	
	public List<WebElement> getProduct1Count()
	{
		return driver.findElements(Product1);
	}
	
	public WebElement getProduct1New()
	{
		return driver.findElement(Product1New);
	}
	
	public List<WebElement> getProduct1CountNew()
	{
		return driver.findElements(Product1New);
	}

}
