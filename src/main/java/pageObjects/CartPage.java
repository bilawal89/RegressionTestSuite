package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
	
	public WebDriver driver;

	public CartPage(WebDriver driver ) 
	{
		// TODO Auto-generated constructor stub
		this.driver=driver;

	}

	By CheckoutBtnFF=By.xpath("//a[@class='btn btn-primary proceed-checkout ']");
	By CheckoutBtn=By.linkText("Proceed to Checkout");
	By CartSubtotal=By.xpath("//h2[@class='sub-total sub-total-heading']");
	By ItemsCount=By.xpath("//span[@class='items-total']");
	By Subtotal=By.xpath("//span[@class='right sub-total']");
	By EstimatedTax=By.xpath("//span[@class='right estimated-tax']");
	By EstimatedShipping=By.xpath("//span[@class='right estimated-shipping']");
	By EstimatedTotal=By.xpath("//span[@class='right estimated-total']");
	By RemoveAll=By.linkText("Remove all");
	//By Remove1=By.xpath("(//a[@class='btn text-color cart-remove'])[1]");
	//9march/By Remove1=By.xpath("//a[@id='remove-item-12577638']");
	
	By Remove1=By.xpath("(//a[@class='btn text-color cart-remove'])[1]");
	By Remove1Count=By.xpath("//a[@id='remove-item-12577638']");

	
	public WebElement getCheckoutBtnFF()
	{
		return driver.findElement(CheckoutBtnFF);
	}
	
	
	public List<WebElement> getRemove1Count()
	{
		return driver.findElements(Remove1Count);
	}
	
	public WebElement getRemove1()
	{
		return driver.findElement(Remove1);
	}

public WebElement getCheckoutBtn()
{
	return driver.findElement(CheckoutBtn);
}

public WebElement getCartSubtotal()
{
	return driver.findElement(CartSubtotal);
}

public WebElement getItemsCount()
{
	return driver.findElement(ItemsCount);
}

public WebElement getSubtotal()
{
	return driver.findElement(Subtotal);
}
public WebElement getEstimatedTax()
{
	return driver.findElement(EstimatedTax);
}
public WebElement getEstimatedShipping()
{
	return driver.findElement(EstimatedShipping);
}
public WebElement getEstimatedTotal()
{
	return driver.findElement(EstimatedTotal);
}
public WebElement getRemoveAll()
{
	return driver.findElement(RemoveAll);
}

}