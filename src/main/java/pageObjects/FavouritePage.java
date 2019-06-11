package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FavouritePage {
	
	public WebDriver driver ;
	
	
	public FavouritePage(WebDriver driver) 
	{
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	By ProductName=By.xpath("//a[@class='product-name']/h2");
	By InactiveSelectedBtn=By.xpath("//a[@class='btn btn-primary addAllToCart inactive']");
	By ActiveSelectedBtn=By.xpath("//a[@class='btn btn-primary addAllToCart']");
	
	By InactiveDelBtn=By.xpath("//a[@class='btn inactive']");
	By ActiveDelBtn=By.xpath("//a[@class='btn' and text()='Delete']");
	By Selectbox1=By.xpath("(//span[@class='control__indicator list-item-checkbox'])[1]");
	By ShoppingCartIcon=By.xpath("//span[@alt='Shopping Cart']");
	By Add2Cart=By.xpath("//a[@data-availability-id]");
	By DeleteAllFav=By.xpath("//a[text()='Delete']");
	
	By SelectCart=By.xpath("//a[@id='addAllToCart']");
	By Selectall = By.xpath("(//span[@class='control__indicator'])[2]");
	By DeleteAll = By.xpath("(//a[@class='btn'])[2]");
	By YesBtn=By.xpath("(//button[@class='btn btn-primary'])[2]");
	By RecentlyViewed = By.linkText("See all recently viewed");
	By CompactViewCheck= By.xpath("\\span[@class='control__indicator']");
	By SelectAllCheck=By.xpath("//*[@id='shop-favorites']/div/section/section[1]/div[4]/div[2]/div/div[1]/label/span");
	By AddAllCartBtn=By.id("addAllToCart");
	By AddAllCartDisableBtn=By.xpath("//*[@id='shop-favorites']/div/section/section[1]/div[4]/div[2]/div/div[2]/a[1]");
	By DeleteBtn=By.linkText("Delete");
	By QtyBox = By.id("qty_3628118");
	//By AddCartBtn=By.id("3628118");
	By AddCartBtn=By.xpath("//a[@class='add_to_cart btn btn-primary']");
	By AddCartDisableBtn=By.xpath("//*[@id='shop-favorites']/div/section/section[2]/div[2]/ul/div/li/div[2]/div[2]/div/a[1]");
	By checkbox=By.xpath("//span[@class='control__indicator list-item-checkbox']");
	By CloseCartModel=By.xpath("(//button[@class='mfp-close'])[4]");
	By SortBy=By.xpath("//select[@id='sort-by']");
	By ProdQuantity=By.xpath("//span[@class='qty']");
	By PartNum=By.xpath("//span[@class='part-number']");
	By AddedDateCount=By.xpath("//p[@class='added']");
	By CompactView=By.xpath("(//span[@class='control__indicator'])[1]");
	By ImageLink=By.xpath("//a[@class='image-link' and contains(@href,'http')]");
	By EmailIcon = By.xpath("//a[text()='Email']");
	By EmailTextBox=By.xpath("//input[@name='email_addresses']");
	By EmailSndBtn=By.xpath("//button[text()='Send']");
	By SendingText=By.xpath("//button[text()='Sending...']");
	By DeleteDiagYes=By.xpath("//button[text()='Yes']");
	By NoRsltTxt=By.xpath("//div[text()='No Result Found']");
	
	public WebElement getNoRsltTxt()
	{
		return driver.findElement(NoRsltTxt);
	}
	
	public WebElement getDeleteDiagYes()
	{
		return driver.findElement(DeleteDiagYes);
	}
	
	public List<WebElement> getSendingTextCount()
	{
		return driver.findElements(SendingText);
	}
	
	public WebElement getEmailSndBtn()
	{
		return driver.findElement(EmailSndBtn);
	}
	
	public WebElement getEmailIcon()
	{
		return driver.findElement(EmailIcon);
	}
	
	public WebElement getEmailTextBox()
	{
		return driver.findElement(EmailTextBox);
	}
	
	
	public List<WebElement> getImageLinkCount()
	{
		return driver.findElements(ImageLink);
	}
	
	public WebElement getCompactView()
	{
		return driver.findElement(CompactView);
	}
	
	
	public List<WebElement> getAddedDateCount()
	{
		return driver.findElements(AddedDateCount);
	}
	
	public List<WebElement> getPartNumCount()
	{
		return driver.findElements(PartNum);
	}
	
	public WebElement getProdQuantity()
	{
		return driver.findElement(ProdQuantity);
	}
	public List<WebElement> getProdQuantityCount()
	{
		return driver.findElements(ProdQuantity);
	}
	
	public List<WebElement> getProductCount()
	{
		return driver.findElements(ProductName);
	}
	
	public WebElement getProductName()
	{
		return driver.findElement(ProductName);
	}
	
	
	public List<WebElement> getInactiveDelBtn()
	{
		return driver.findElements(InactiveDelBtn);
		
	}
	
	public List<WebElement> getActiveDelBtn()
	{
		return driver.findElements(ActiveDelBtn);
		
	}
	
	
	public List<WebElement> getInactiveSelectedBtn()
	{
		return driver.findElements(InactiveSelectedBtn);
	}
	public List<WebElement> getActiveSelectedBtn()
	{
		return driver.findElements(ActiveSelectedBtn);
	}
	
	public WebElement getSortBy()
	{
		return driver.findElement(SortBy);
	}
	
	public WebElement getSelectbox1()
	{
		return driver.findElement(Selectbox1);
		
	}
	
		public WebElement getShoppingCartIcon()
	{
		return driver.findElement(ShoppingCartIcon);
		
	}
	
	public WebElement getCloseCartModel()
	{
		return driver.findElement(CloseCartModel);
		
	}
	
	public WebElement getAdd2Cart()
	{
		return driver.findElement(Add2Cart);
		
	}
	
	
	public WebElement getDeleteAllFav()
	{
		return driver.findElement(DeleteAllFav);
		
	}
	
	
	public WebElement getSelectCart()
	{
		return driver.findElement(SelectCart);
		
	}
	
	
	public WebElement getYesBtn()
	{
		return driver.findElement(YesBtn);
		
	}
	
	
	public WebElement getDeleteAll()
	{
		return driver.findElement(DeleteAll);
		
	}
	
	
	
	public WebElement getSelectall()
	{
		return driver.findElement(Selectall);
		
	}
	
	public WebElement getRecentlyViewed()
	{
		return driver.findElement(RecentlyViewed);
		
	}
	
public WebElement getFavoriteLink()
{
	return driver.findElement(CompactViewCheck);
	
}

public WebElement getSelectAllCheck()
{
	return driver.findElement(SelectAllCheck);
	
}

public WebElement getAddAllCartBtn()
{
	return driver.findElement(AddAllCartBtn);
	
}

public WebElement getDeleteBtn()
{
	return driver.findElement(DeleteBtn);
	
}

public WebElement getQtyBox()
{
	return driver.findElement(QtyBox);
	
}
	
public WebElement getAddCartBtn()
{
	return driver.findElement(AddCartBtn);
	}
	
public WebElement getcheckbox()
{
	return driver.findElement(checkbox);
	}

public WebElement getAddCartDisableBtn()
{
	return driver.findElement(AddCartDisableBtn);
	}

public WebElement getAddAllCartDisableBtn()
{
	return driver.findElement(AddAllCartDisableBtn);
	}
}
