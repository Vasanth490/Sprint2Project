package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
public WebDriver driver;
	
	By loginlink = By.xpath("//*[@id=\"responsive\"]/li[3]/a");
	
	public LandingPage(WebDriver driver)
	{
		this.driver = driver;
	}

	public WebElement getLoginlink() {
		return driver.findElement(loginlink);
	}


}
