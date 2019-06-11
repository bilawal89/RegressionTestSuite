package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SavedReports {
	
	WebDriver driver;

	public SavedReports(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By DownloadBtn=By.xpath("(//button[@class='saved-download'])[1]");
	By ScheduleBtn=By.xpath("(//a[@title='Schedule'])[1]");
	By ScheduleCancel=By.xpath("(//button[text()='Cancel'])[1]");
	By SchedulePopup=By.xpath("(//div[@class='modal-content'])[1]");
	By AllOrdersLink=By.xpath("//a[text()='All Orders']");
			
	public WebElement getAllOrdersLink()
	
	{
		return driver.findElement(AllOrdersLink);
	}


	public WebElement getSchedulePopup()
	
	{
		return driver.findElement(SchedulePopup);
	}
	
	
	
	public WebElement getScheduleCancel()
	{
		return driver.findElement(ScheduleCancel);
	}
	
	
	public WebElement getDownloadBtn()
	{
		return driver.findElement(DownloadBtn);
	}
	
	public WebElement getScheduleBtn()
	{
		return driver.findElement(ScheduleBtn);
	}

}
