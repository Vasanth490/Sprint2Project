package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	public WebDriver driver;

	By Username= By.xpath("//*[@id=\"user_login\"]");
	By Password = By.xpath("//*[@id=\"user_pass\"]");
	By signin = By.xpath("//input[@type='submit']");

	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}

	public WebElement getPassword() {
		return driver.findElement(Password);
	}


	public WebElement getSignin() {
		return driver.findElement(signin);
	}

	public WebElement getUsername() {
		return driver.findElement(Username);
	}

}
