package stepDefinitions;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.FacebookLoginPage;

public class loginPage {
	
	WebDriver driver;
    FacebookLoginPage loginPage;
	@Given("^The user is on the login page$")
	public void user_on_fb_login_page() {
		WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        loginPage = new FacebookLoginPage(driver);
		
		
	}
	
	@When("^User enters username$")
	public void user_enters_username() {
		
        loginPage.enterUsername("XXXXXXX");
		
		
	}
	
	@And("^User enters password$")
public void user_enters_password() {
		
		loginPage.enterPassword("XXXXXX");

		
	}
	
	@And("^User clicks on login button$")
	public void user_clicks_login_btn() {
			
		loginPage.clickLogin();

			
		}
	
	@Then("^User should not be able to login to FB$")
	public void user_not_able_to_logdin() throws InterruptedException {
		
		Thread.sleep(50000);
		
		String login= loginPage.verifyLogin();
		
		Assertions.assertTrue(login.contains("Facebook") || login.contains("Find your account and log in."),
                "Home page title mismatch!");
		
		//Assert.assertEquals(login, "Find your account and log in.");
		
		
		
	}

}
