package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashBoardPage {
	public WebDriver driver;

	By properties= By.xpath("//*[@id=\"menu-posts-property\"]/a/div[3]");
	
	By addNew= By.xpath("//*[@id=\"wpbody-content\"]/div[3]/a");
	By enterTitle= By.xpath("//*[@id=\"title\"]");
	By trashProperty= By.xpath("//*[@id=\"post-14490\"]/td[1]/strong");
	By existingTitle= By.xpath("//*[@id=\"post-14489\"]/td[1]/strong/a");
	By trash = By.xpath("//*[@id=\"post-14489\"]/td[1]/div[3]/span[3]/a");
	By trashbin = By.xpath("//*[@id=\"wpbody-content\"]/div[3]/ul/li[6]/a");
	By price= By.xpath("//*[@id=\"ui-id-1\"]");
	By priceTextArea= By.xpath("//*[@id=\"_price\"]");
	By errormsg = By.xpath("//*[@id=\"price_tab\"]/div[1]/div[2]/p");
	By offerType= By.xpath("//*[@id=\"_property_type\"]");
	By pricePerSqrft= By.xpath("//*[@id=\"_property_type\"]");
	By publish= By.xpath("//*[@id=\"publish\"]");
	By AllProperties= By.xpath("//*[@id=\"menu-posts-property\"]/ul/li[2]/a");
	By location= By.xpath("//*[@id=\"ui-id-3\"]");
	By region = By.xpath("//*[@id=\"post-14497\"]/td[6]/a");
	By checkBox = By.xpath("//*[@id=\"cb-select-14497\"]");
	By trashDropDown = By.xpath("//*[@id=\"bulk-action-selector-top\"]");
	By checkBox2 = By.xpath("//*[@id=\"cb-select-14497\"]");
	By region2 = By.xpath("//*[@id=\"post-14497\"]/td[6]/a");

	By apply = By.xpath("//*[@id=\"doaction\"]");
	 public DashBoardPage(WebDriver driver)
	 {
		 this.driver=driver;
	 }
	public WebElement getProperties() {
		return driver.findElement(properties);
	}
	public WebElement getRegion2() {
		return driver.findElement(region2);
	}
	public WebElement getCheckBox2() {
		return driver.findElement(checkBox2);
	}
		public WebElement getApply() {
		return driver.findElement(apply);
	}
	public WebElement getTrashDropDown() {
		return driver.findElement(trashDropDown);
	}
	public WebElement getCheckBox() {
		return driver.findElement(checkBox);
	}
	public WebElement getRegion() {
		return driver.findElement(region);
	}
	public WebElement getTrashProperty() {
		return driver.findElement(trashProperty);
	}
	public WebElement getExistingTitle() {
		return driver.findElement(existingTitle);
	}
	public WebElement getAddNew() {
		return driver.findElement(addNew);
	}
	public WebElement getTrash() {
		return driver.findElement(trash);
	}
	public WebElement getTrashBin() {
		return driver.findElement(trashbin);
	}
	
	public WebElement getEnterTitle() {
		return driver.findElement(enterTitle);
	}
	public WebElement getPrice() {
		return driver.findElement(price);
	}
	public WebElement getErrormsg() {
		return driver.findElement(errormsg);
	}
	public WebElement getPriceTextArea() {
		return driver.findElement(priceTextArea);
	}
	public WebElement getOfferType() {
		return driver.findElement(offerType);
	}
	public WebElement getPricePerSqrft() {
		return driver.findElement(pricePerSqrft);
	}
	public WebElement getPublish() {
		return driver.findElement(publish);
	}
	public WebElement getAllProperties() {
		return driver.findElement(AllProperties);
	}
	public WebElement getLocation() {
		return driver.findElement(location);
	}
	 
	

}
