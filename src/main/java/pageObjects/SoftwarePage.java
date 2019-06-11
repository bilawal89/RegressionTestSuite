package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SoftwarePage {
	public WebDriver driver;
	public SoftwarePage(WebDriver driver) 
	{
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	By favorate1 = By.xpath("(//a[text()='Add to Favorites'])[1]");
	By Added2favrt=By.xpath("//a[text()='Added to favorites']");
	By Add2Cart1=By.xpath("(//a[contains(@id,'add_to_cart_')])[1]");
	By LstvwId=By.id("bt-products-list");
	By LstVwCount=By.xpath("//a[@class='grid-control-icon icon-list active']");
	By GridVwCount=By.xpath("//a[@class='grid-control-icon icon-grid active']");
	By GridvwId=By.id("bt-products-grid");
	By SortDropDown=By.xpath("//select[@id='sort']");
	By Sizedd=By.xpath("//select[@id='size']");
	By Category1=By.xpath("//label[contains(text(),'Application Subscriptions')]");
	By PageNum2=By.xpath("(//a[@class='page-link'])[1]");
	By ApplyCat=By.xpath("(//a[text()='Apply'])[2]");
	By Page2Count=By.xpath("//span[@class='current' and text()='2']");
	By ProductCount=By.xpath("//h2[contains(@id,'product-name')]");
	By PageNumCount=By.xpath("//strong[contains(text(),'49')]");
	By CategorySelectionCount=By.xpath("//span[@class='selection' and text()='Application Subscriptions ']");
	By ProductName1=By.xpath("(//h2[contains(@id,'product-name-')])[1]");
	
	
	public WebElement getProductName1()
	{
		return driver.findElement(ProductName1);
	}
	
	public List<WebElement> getCategorySelectionCount()
	{
		return driver.findElements(CategorySelectionCount);
	}
	
	public List<WebElement> getPageNumCount()
	{
		return driver.findElements(PageNumCount);
	}
	
	public List<WebElement> getProductCount()
	{
		return driver.findElements(ProductCount);
	}
	
	public List<WebElement> getPage2Count()
	{
		return driver.findElements(Page2Count);
	}
	
	public WebElement getApplyCat()
	{
		return driver.findElement(ApplyCat);
	}
	
	public WebElement getPageNum2()
	{
		return driver.findElement(PageNum2);
	}
	
	
	public WebElement getCategory1()
	{
		return driver.findElement(Category1);
	}
	
	public WebElement getSizedd()
	{
		return driver.findElement(Sizedd);
	}
	
	public WebElement getSortDropDown()
	{
		return driver.findElement(SortDropDown);
	}
	
	
	public WebElement getGridvwId()
	{
		return driver.findElement(GridvwId);
	}
	
	
	public List<WebElement> getGridVwCount()
	{
		return driver.findElements(GridVwCount);
	}
	
	
	public List<WebElement> getLstVwCount()
	{
		return driver.findElements(LstVwCount);
	}
	
	public WebElement getLstvwId()
	{
		return driver.findElement(LstvwId);
	}
	
	
	public List<WebElement> getfavorate1Count()
	{
		return driver.findElements(favorate1);
	}
	
	public WebElement getAdd2Cart1()
	{
		return driver.findElement(Add2Cart1);
	}
	
	
	public List<WebElement> getAdded2favrtCount()
	{
		return driver.findElements(Added2favrt);
	}
	
	public WebElement getAdded2favrt()
	{
		return driver.findElement(Added2favrt);
	}
	
	

	public WebElement getfavorate1()
	{
		return driver.findElement(favorate1);
	}
	
}

