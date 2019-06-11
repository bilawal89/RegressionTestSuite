package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AllProducts {
	
	public WebDriver driver;

	public AllProducts(WebDriver driver ) 
	{
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	By AudioCables = By.linkText("Audio Cables");
	
	By AudioCablesFF=By.xpath("(//a[text()='Audio Cables'])[2]");
	
	
	public WebElement getAudioCables()
	{
		return driver.findElement(AudioCables);
	}
	
	public WebElement getAudioCablesFF()
	{
		return driver.findElement(AudioCablesFF);
	}


}
