package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
public WebDriver driver;
	
	//By Usernamefield=By.name("username");
	By Searchbox=By.xpath("//input[@id='x_main-search']");
	//By SearchboxFF=By.xpath("//input[@id='x_main-search' and @class='main-search']");
	//By SearchboxFF=By.id("x_main-search");
	
	By SearchboxFF=By.xpath("//form[@id='predictiveSearchBarForm']");
	By StandardCatalogBtn=By.linkText("Shop Standards Catalog");
	By ShopAllProductBtn=By.linkText("Shop All Products");
	By AllMyfavrtsLinks=By.linkText("See all my favorites");
	By RecentlyViewedLink=By.xpath("//a[text()='See all recently viewed']");
	//By FavrtsBckBtn=By.className("#slick-prev.slick-arrow");
	By FavrtsBckBtn=By.xpath("//button[@class='slick-prev slick-arrow']");
	
	//By FavrtsFrwrdBtn=By.className("#slick-next.slick-arrow");
	By FavrtsFrwrdBtn=By.xpath("//button[@class='slick-next slick-arrow']");
	//By Passwordfield=By.name("password");
	//By Loginbtn=By.xpath("//input[@value='Login']");
	
	By FavoriteLink=By.xpath("//a[@class='my-lists']");
	By SoftwareLink=By.xpath("//h2[text()='Software']");
	
	public WebElement getSoftwareLink()
	{
		return driver.findElement(SoftwareLink);
		
	}
	
	public WebElement getFavoriteLink()
	{
		return driver.findElement(FavoriteLink);
		
	}

	public HomePage(WebDriver driver) 
	{
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement getsearchboxFF()
	{
		return driver.findElement(SearchboxFF);
	}
	
	public WebElement getsearchbox()
	{
		return driver.findElement(Searchbox);
	}

	public WebElement getStandardCatalogBtn()
	{
		return driver.findElement(StandardCatalogBtn);
	}
	
	public WebElement getShopAllProductBtn()
	{
		return driver.findElement(ShopAllProductBtn);
	}
	
	public WebElement getAllMyfavrtsLinks()
	{
		return driver.findElement(AllMyfavrtsLinks);
	}

	public WebElement getRecentlyViewedLink()
	{
		return driver.findElement(RecentlyViewedLink);
		
	}
	
	public WebElement getFavrtsFrwrdBtn()
	{
		return driver.findElement(FavrtsFrwrdBtn);
		
	}
	
	public WebElement getFavrtsBckBtn()
	{
		return driver.findElement(FavrtsBckBtn);
		
	}
	

	

}
