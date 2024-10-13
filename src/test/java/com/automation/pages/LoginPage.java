package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(id = "login-button")
    WebElement loginButton;

    @FindBy(id = "user-name")
    WebElement usernameInput;

    @FindBy(id = "password")
    WebElement passwordInput;


    public void openWebsite(){
        driver.get(ConfigReader.getConfig("application.url"));
    }

    public Boolean isLoginPageDisplayed(){
        return loginButton.isDisplayed();
    }

    public void doLogin(String username, String password){
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();
    }


}
