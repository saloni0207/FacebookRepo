package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class FacebookLoginPage {
	
	 WebDriver driver;

	    private By usernameField = By.xpath("//input[@id='email']");
	    private By passwordField = By.xpath("//input[@id='pass']");
	    private By loginButton = By.xpath("//button[text()='Log in']");
	    private By Message = By.xpath("//div/a[text()='Find your account and log in.']");

	    public FacebookLoginPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    public void enterUsername(String username) {
	        driver.findElement(usernameField).sendKeys(username);
	    }

	    public void enterPassword(String password) {
	        driver.findElement(passwordField).sendKeys(password);
	    }

	    public void clickLogin() {
	        driver.findElement(loginButton).click();
	    }

	    public String verifyLogin() {
	       return driver.findElement(Message).getText();
	    	
	    }
	
	

}
