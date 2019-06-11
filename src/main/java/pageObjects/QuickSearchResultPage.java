package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class QuickSearchResultPage {
	
	public WebDriver driver ;
	//public Select Se1;
	
	
	public QuickSearchResultPage(WebDriver driver) 
	{
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	
	By OrdersTab= By.xpath("//*[@id='order-top']/div/div/div[2]/div/span[1]");
	By QuotesTab= By.xpath("//*[@id='order-top']/div/div/div[2]/div/span[2]");
	By AssetsTab= By.xpath("//*[@id='order-top']/div/div/div[2]/div/span[3]");
	By LoadMoreButton=By.xpath("//button[@class='btn load-more-link order-load-more']");
	
	public WebElement getOrdersTab()
	{
		return driver.findElement(OrdersTab);
	}
	
	public WebElement getQuotesTab()
	{
		return driver.findElement(QuotesTab);
	}
	
	public WebElement getAssetsTab()
	{
		return driver.findElement(AssetsTab);
	}
	
	public WebElement getLoadMoreButton()
	{
		return driver.findElement(LoadMoreButton);
	}
}
