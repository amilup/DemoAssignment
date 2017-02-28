package com.vodafone.nav;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestSteps {
	
public static WebDriver driver;
	
	@Given("^the vidafone site is launched$")
	public void the_vidafone_site_is_launched() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://vodafone.co.nz/");
	}

	@When("^I click on Login button$")
	public void i_click_on_Login_button() throws Throwable {
	    driver.findElement(By.xpath(".//*[@id='menu']/li[6]/a")).click();
		driver.findElement(By.xpath(".//div[@class='richText']/p/a[@title='Login']")).click();
	}

	@And("^click on Login button$")
	public void click_on_Login_button() throws Throwable {
	    driver.findElement(By.id("sign-in-button")).click();
	}
	
	@When("^enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_Amila_and_TestPassword(String un, String pw) throws Throwable {
		driver.findElement(By.id("myvfLoginOnlineId")).sendKeys(un);
		driver.findElement(By.id("myvfLoginPassword")).sendKeys(pw);
	}

	@Then("^I verify error message is displayed$")
	public void i_verify_error_message_is_displayed() throws Throwable {
	    String errorMsg = driver.findElement(By.xpath(".//*[@id='loginHandler']/label[@class='submitError']")).getText();
		Assert.assertEquals(errorMsg, "Your email address is not registered for My Vodafone.");
	}

}
