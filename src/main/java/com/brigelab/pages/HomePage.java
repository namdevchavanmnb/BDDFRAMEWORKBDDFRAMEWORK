package com.brigelab.pages;

import com.brigelab.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends BaseClass {

        private By profilepage = By.xpath("//div[contains(text(),'Profile')]");



        public void gotoProfilePage() {
            driver.findElement(profilepage).click();


        }

        public String getHomePageTitle() {
            return driver.getTitle();
        }

        public void closeDriver() {
            driver.close();
        }

    }

