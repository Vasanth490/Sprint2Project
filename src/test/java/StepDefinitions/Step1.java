package StepDefinitions;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import PageObjects.DashBoardPage;
import PageObjects.HomePage;
import PageObjects.LandingPage;
import PageObjects.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import resources.Base;

public class Step1 extends Base{
	public WebDriver driver;
	
	@Given("^initilaize with chrome browser$")
	public void initilaize_with_chrome_browser() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
	  driver=initializeDriver();
	}

	@Given("^navigate to url \"([^\"]*)\"$")
	public void navigate_to_url(String url) {
	    // Write code here that turns the phrase above into concrete actions
	    driver.get(url);
	}

	@When("^user clicks on login/register link$")
	public void user_clicks_on_login_register_link() {
	    // Write code here that turns the phrase above into concrete actions
	    LandingPage lp= new LandingPage(driver);
	    lp.getLoginlink().click();
	}

	@Then("^user enters the Username as \"([^\"]*)\" and Password as \"([^\"]*)\"$")
	public void user_enters_the_Username_as_and_Password_as(String username, String password) {
	    // Write code here that turns the phrase above into concrete actions
	    LoginPage lp1=new LoginPage(driver);
	    lp1.getUsername().sendKeys(username);
	    lp1.getPassword().sendKeys(password);
	    
	}

	@Then("^user clicked on login button$")
	public void user_clicked_on_login_button(){
	    // Write code here that turns the phrase above into concrete actions
	   LoginPage lp1= new LoginPage(driver);
	   lp1.getSignin().click();;
	}

	@Then("^verify user is successfully logged in$")
	public void verify_user_is_successfully_logged_in()  {
	    // Write code here that turns the phrase above into concrete actions
	   HomePage hp = new HomePage(driver);
	   Assert.assertTrue(hp.getText().isDisplayed());
	}


	@Then("^close the browser$")
	public void close_the_browser()  {
	    // Write code here that turns the phrase above into concrete actions
		driver.close();
	    
	}
	
	//Properties step definitions----------------------------------------------
	
	@Then("user can see the dashboard")
	public void user_can_see_the_dashboard() {
	    // Write code here that turns the phrase above into concrete actions
	   HomePage hp = new HomePage(driver);
	   Assert.assertTrue(hp.getText().isDisplayed());
	}

	@Then("mousehover to properties and click on properties module")
	public void mousehover_to_properties_and_click_on_properties_module() {
	    // Write code here that turns the phrase above into concrete actions
		DashBoardPage dsp= new DashBoardPage(driver);
		Actions a= new Actions(driver);
		a.moveToElement(dsp.getProperties()).click().perform();
	}

	@Then("click on add new")
	public void click_on_add_new() {
	    // Write code here that turns the phrase above into concrete actions
		DashBoardPage dsp= new DashBoardPage(driver);
		Actions a= new Actions(driver);
		a.moveToElement(dsp.getAddNew()).click().perform();
	}

	@Then("enter the Title as {string} and price as {string}")
	public void enter_the_title_as_and_price_as(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		DashBoardPage dsp= new DashBoardPage(driver);
		dsp.getEnterTitle().sendKeys(string);
		dsp.getPrice().sendKeys(string2);
	}

	

	@Then("click on publish")
	public void click_on_publish() {
	    // Write code here that turns the phrase above into concrete actions
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy(0,500)","");
	    DashBoardPage dsp= new DashBoardPage(driver);
	    dsp.getPublish().click();
	}

	@Then("click on all properties")
	public void click_on_all_properties() {
	    // Write code here that turns the phrase above into concrete actions
		DashBoardPage dsp= new DashBoardPage(driver);
		dsp.getAllProperties().click();
	}

	//DeleteProperty StepDefinitions------------------------

@Then("mousehover to properties and click")
public void mousehover_to_properties_and_click() {
    // Write code here that turns the phrase above into concrete actions
	DashBoardPage dsp= new DashBoardPage(driver);
	Actions a= new Actions(driver);
	a.moveToElement(dsp.getProperties()).click().perform();
}
@Then("mousehover to property checkbox and click on that")
public void mousehover_to_property_checkbox_and_click_on_that() {
    // Write code here that turns the phrase above into concrete actions
	DashBoardPage dsp= new DashBoardPage(driver);
	Actions a= new Actions(driver);
	a.moveToElement(dsp.getAllProperties()).click().perform();
	a.moveToElement(dsp.getCheckBox()).click().perform();
	
}

@Then("select move to trash from the dropdown")
public void select_move_to_trash_from_the_dropdown() {
    // Write code here that turns the phrase above into concrete actions
	DashBoardPage dsp= new DashBoardPage(driver);
	Select s= new Select(dsp.getTrashDropDown());
	Actions a= new Actions(driver);
	s.selectByValue("trash");;
	a.moveToElement(dsp.getApply()).click().perform();
}

@Then("mousehover to trash tab and click the link")
public void mousehover_to_trash_tab_and_click_the_link() {
    // Write code here that turns the phrase above into concrete actions
	DashBoardPage dsp= new DashBoardPage(driver);
	Actions a= new Actions(driver);
	a.moveToElement(dsp.getTrashBin()).click().perform();
}


@Then("check whether the property is moved to trash")
public void check_whether_the_property_is_moved_to_trash() {
    // Write code here that turns the phrase above into concrete actions
	DashBoardPage dsp= new DashBoardPage(driver);
	Assert.assertTrue(dsp.getRegion().isDisplayed());
}

//RestoreProperty StepDefinitions-------------------------------



@Then("select restore from the dropdown")
public void select_restore_from_the_dropdown() {
    // Write code here that turns the phrase above into concrete actions
	DashBoardPage dsp= new DashBoardPage(driver);
	Select s= new Select(dsp.getTrashDropDown());
	Actions a= new Actions(driver);
	s.selectByValue("untrash");;
	a.moveToElement(dsp.getApply()).click().perform();
}

@Then("check whether the property is restord")
public void check_whether_the_property_is_restord() {
    // Write code here that turns the phrase above into concrete actions
	DashBoardPage dsp= new DashBoardPage(driver);
	Actions a= new Actions(driver);
	a.moveToElement(dsp.getAllProperties()).click().perform();
	Assert.assertTrue(dsp.getRegion2().isDisplayed());
}


}
