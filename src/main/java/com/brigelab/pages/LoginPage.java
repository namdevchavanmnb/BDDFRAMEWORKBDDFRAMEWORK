package com.brigelab.pages;

import com.brigelab.base.BaseClass;
import org.openqa.selenium.By;

public class LoginPage extends BaseClass {

private By username = By.xpath("//input[@name='username']");
private By password = By.xpath("//input[@name='password']");
private By login = By.xpath("//div[contains(text(),'Log in')]");

    public LoginPage() {
        BaseClass baseClass = new BaseClass();
        baseClass.initialization();
    }

    public void launchURL(String url){
        driver.get(url);
    }
    public void setLogin(String User, String pass){
        driver.findElement(username).sendKeys(User);
        driver.findElement(password).sendKeys(pass);


    }
    public HomePage login (){
        driver.findElement(login).click();
        return new HomePage();
    }
    public HomePage initialLogin(String url, String uname, String pwd){
        driver.get(url);
        driver.findElement(username).sendKeys(uname);
        driver.findElement(password).sendKeys(pwd);
        driver.findElement(login).click();
        return new HomePage();

    }
    public String getLoginPageTitle(){
        return driver.getTitle();
    }

    public void closeDriver(){
        driver.close();
    }
}

