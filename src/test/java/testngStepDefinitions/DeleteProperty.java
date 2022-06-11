package testngStepDefinitions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

import PageObjects.DashBoardPage;
import PageObjects.LandingPage;
import PageObjects.LoginPage;

import resources.Base;

public class DeleteProperty extends Base {
	public static Logger log =LogManager.getLogger(Base.class.getName());
	@BeforeTest
	public void deleteProperty() throws IOException, InterruptedException
	{
		driver= initializeDriver();
		{
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
			driver.get(prop.getProperty("url"));
			LandingPage lp = new LandingPage(driver);
			lp.getLoginlink().click();
			LoginPage lp1= new LoginPage(driver);
			lp1.getUsername().sendKeys("mohankrishna176@gmail.com");
			lp1.getPassword().sendKeys("Secret@123&&");
			lp1.getSignin().click();
			Thread.sleep(5000);
			DashBoardPage dsp= new DashBoardPage(driver);
			Actions a= new Actions(driver);
			Thread.sleep(5000);
			a.moveToElement(dsp.getProperties()).click().perform();
			Thread.sleep(5000);
			a.moveToElement(dsp.getAllProperties()).click().perform();
			Thread.sleep(5000);
			a.moveToElement(dsp.getCheckBox()).click().perform();
			Thread.sleep(5000);
			Select s= new Select(dsp.getTrashDropDown());
			s.selectByValue("trash");;
			a.moveToElement(dsp.getApply()).click().perform();
			a.moveToElement(dsp.getTrashBin()).click().perform();
			Assert.assertTrue(dsp.getRegion().isDisplayed());
		}
		
		driver.close();
		driver=null;
		}
}