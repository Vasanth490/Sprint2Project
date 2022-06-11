package testngStepDefinitions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

import PageObjects.DashBoardPage;
import PageObjects.LandingPage;
import PageObjects.LoginPage;
import junit.framework.Assert;
import resources.Base;

public class AddProperty extends Base {
	public static Logger log =LogManager.getLogger(Base.class.getName());
	public int amount=6000;
	public String s1="MyFirstProperty";
	@BeforeTest
	public void addProperty() throws IOException, InterruptedException
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
			a.moveToElement(dsp.getProperties()).click().perform();
			a.moveToElement(dsp.getAddNew()).click().perform();
			dsp.getEnterTitle().sendKeys(s1);
			dsp.getPrice().click();
			dsp.getPricePerSqrft().sendKeys("400");
			if(amount >=0 && amount <=9 || amount !='$' && amount !=',' )
			{
			dsp.getPriceTextArea().sendKeys("60000");
			}
			else
			{
				System.out.println(dsp.getErrormsg().getText());
			}
			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("window.ScrollBy(0,700))");
			Thread.sleep(5000);
			a.moveToElement(dsp.getPublish()).click().perform();
			Thread.sleep(5000);
			a.moveToElement(dsp.getAllProperties()).click().perform();
			
			
			
		}
		driver.close();
		driver=null;
		}
}

