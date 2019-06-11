package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AssetPage {
	
	public WebDriver driver;
	
	public AssetPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By Pagination2 = By.xpath("(//a[@class='page-link'])[1]");
	By VwDropDown=By.id("reportViewSelect");
	By Column1stDropdown=By.xpath("(//div[@class='filter-search-drop-arrow'])[1]");
	By APCRow=By.xpath("(//span[@class='control__indicator'])[1]");
	By ApplyBtn=By.xpath("(//a[text()='Apply'])[1]");
	By RowRecord1st=By.xpath("//td[@label-data='Mfg']");
	By SaveBtn=By.id("save");
	By NameTextBox=By.id("report_name");
	By SaveDefaultCheck=By.id("save_default_view");
	By SaveRpt=By.xpath("//button[text()='Save']");
	
	
	
	public WebElement getSaveRpt()
	{
		return driver.findElement(SaveRpt);
	}
	
	public WebElement getSaveDefaultCheck()
	{
		return driver.findElement(SaveDefaultCheck);
	}
	
	public WebElement getNameTextBox()
	{
		return driver.findElement(NameTextBox);
	}
	
	public WebElement getSaveBtn()
	{
		return driver.findElement(SaveBtn);
	}
	
	public WebElement getRowRecord1st()
	{
		return driver.findElement(RowRecord1st);
	}
	
	public WebElement getApplyBtn()
	{
		return driver.findElement(ApplyBtn);
	}
	
	
	public WebElement getAPCRow()
	{
		return driver.findElement(APCRow);
	}
	
	public WebElement getColumn1stDropdown()
	{
		return driver.findElement(Column1stDropdown);
	}
	
	public WebElement getVwDropDown()
	{
		return driver.findElement(VwDropDown);
	}
	
	public WebElement get2ndPagination()
	{
		return driver.findElement(Pagination2);
	}
	

}
