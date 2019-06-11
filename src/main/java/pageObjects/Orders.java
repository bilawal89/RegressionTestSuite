package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Orders {
	
	public WebDriver driver ;
	
	By Downloads = By.xpath("//a[@class='action-icon icon-download']");
	By email = By.xpath("//*[@id=\"track-orders\"]/section/div/div/div[1]/span/a[2]");
	By emailtxtbox=By.xpath("//input[@name='email_addresses']");
	By SndBtn=By.xpath("//button[@class='btn btn-primary']");
	By emailDialog=By.xpath("(//div[@class='modal-content'])[7]");
	By RequestReturnBtn = By.xpath("//a[@id='returnRequestlBtn']");
	By ReturnPopup=By.xpath("(//div[@role='document'])[2]");
	By ReturnTextbox=By.xpath("//textarea[@id='requestDetail']");
	By SubmitReturn=By.xpath("//a[@id='submit-return-btn']");
	By ReturnConfirmClose=By.xpath("(//button[@class='btn btn-default close-mdl'])[3]");
	By ReturnConfirmPopup=By.xpath("(//div[@class='modal-dialog'])[3]");
	By BuyItemAgainBtn=By.xpath("//a[@data-order-id='10359164']");
	By BuyItemAgainPopupClose=By.xpath("(//button[@class='mfp-close'])[1]");
	By BuyItemAgainPopup=By.xpath("(//div[@class='modal-content'])[4]");
	By ViewInvoiceBtn = By.xpath("(//a[@class='btn view-orders hide-for-print'])[1]");
	By DaysDropDown=By.xpath("//select[@title='Select Time Period']");
	By Plus1st=By.xpath("(//a[@class='btn-expand-content'])[1]");
	By ReqReturn1st=By.xpath("(//a[@class='btn rma-btn'])[1]");
	By ReturnTextBox1=By.xpath("//textarea[@id='_requestDetail']");
	By ReqReturnSubmitBtn=By.id("submit-return-btn");
	By RmaCloseBtn=By.xpath("//button[text()='Submit Return Request']");
	By RmaCloseBtn1=By.xpath("(//button[text()='Close'])[1]");
	By BuyItemAgain1=By.xpath("(//a[contains(text(),'Buy Item(s) Again')])[1]");
	By BuyItemClose=By.xpath("(//button[@title='Close (Esc)'])[4]");
	By LoadMoreBtn=By.xpath("//button[text()='Load More']");
	By RowRecord=By.xpath("//a[@class='btn-expand-content']");
	By DateRecord=By.xpath("//div[@class='title-row']/div[1]/div[2]/p");
	By BuyAgainBtn=By.xpath("//a[@class='btn buy-again']");
	
	public WebElement getBuyAgainBtn()
	{
		return driver.findElement(BuyAgainBtn);
	}
	
	public List<WebElement> getDateRecordCount()
	{
		return driver.findElements(DateRecord);
	}
		
	public List<WebElement> getRowRecordCount()
	{
		return driver.findElements(RowRecord);
	}
		
	public WebElement getLoadMoreBtn()
	{
		return driver.findElement(LoadMoreBtn);
	}
	
	public WebElement getBuyItemClose()
	{
		return driver.findElement(BuyItemClose);
	}
	public WebElement getBuyItemAgain1()
	{
		return driver.findElement(BuyItemAgain1);
	}
	public WebElement getRmaCloseBtn()
	{
		return driver.findElement(RmaCloseBtn);
	}
	public WebElement getRmaCloseBtn1()
	{
		return driver.findElement(RmaCloseBtn1);
	}
	public WebElement getReqReturnSubmitBtn()
	{
	return driver.findElement(ReqReturnSubmitBtn);
	}
	public WebElement getReturnTextBox1()
	{
		return driver.findElement(ReturnTextBox1);
	}
	
	public WebElement getReqReturn1st()
	{
		return driver.findElement(ReqReturn1st);
	}
	
	public WebElement getPlus1st()
	{
		return driver.findElement(Plus1st);
	}
	
	public WebElement getDaysDropDown()
	{
		return driver.findElement(DaysDropDown);
	}
	
	public WebElement getReturnConfirmPopup()
	{
		return driver.findElement(ReturnConfirmPopup);
	}
	
	public WebElement getViewInvoiceBtn()
	{
		return driver.findElement(ViewInvoiceBtn);
	}
	
	public WebElement getBuyItemAgainPopup()
	{
		return driver.findElement(BuyItemAgainPopup);
	}
	public WebElement getBuyItemAgainPopupClose()
	{
		return driver.findElement(BuyItemAgainPopupClose);
	}
	
	public WebElement getBuyItemAgainBtn()
	{
		return driver.findElement(BuyItemAgainBtn);
	}
	
	public WebElement getReturnConfirmClose()
	{
		return driver.findElement(ReturnConfirmClose);
	}
	
	
	public WebElement getSubmitReturn()
	{
		return driver.findElement(SubmitReturn);
	}
	
	
	public WebElement getReturnTextbox()
	{
		return driver.findElement(ReturnTextbox);
	}
	
	
	public WebElement getReturnPopup()
	{
		return driver.findElement(ReturnPopup);
	}
	
	
	public WebElement getRequestReturnBtn()
	{
		return driver.findElement(RequestReturnBtn);
	}
	
	public WebElement getemailDialog()
	{
		return driver.findElement(emailDialog);
	}
	
	public Orders(WebDriver driver) 
	{
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	public WebElement getDownloads()
	{
		return driver.findElement(Downloads);
	}
	
	public WebElement getemail()
	{
		return driver.findElement(email);
	}
	
	public WebElement getemailtxtbox()
	{
		return driver.findElement(emailtxtbox);
	}
	
	public WebElement getSndBtn()
	{
		return driver.findElement(SndBtn);
	}
}