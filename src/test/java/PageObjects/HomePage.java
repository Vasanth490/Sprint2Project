package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	public WebDriver driver;

	By text= By.xpath("//*[@id=\"wpbody-content\"]/div[3]/h1");
	 public HomePage(WebDriver driver)
	 {
		 this.driver=driver;
	 }
	 
	
	public WebElement getText()
	 {
		 return driver.findElement(text);
	 }
}
