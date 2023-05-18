package stepdefinition;

import com.brigelab.pages.HomePage;
import com.brigelab.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class HomePageStepsDef {
    LoginPage loginPage=new LoginPage();
    HomePage homePage=new HomePage();

    @Given("launch url {string} and login using username {string} and password {string}")
    public void launch_url_and_login_using_username_and_password(String string, String string2, String string3) {
        loginPage.initialLogin(string, string2, string3);
    }
    @When("click on profile")
    public void click_on_profile() {
        homePage.gotoProfilePage();
    }
    @And("Verify Home page Title {string}")
    public void verify_home_page_title(String string) throws InterruptedException {
        Thread.sleep(3000);
        String homePageTitle=homePage.getHomePageTitle();
        Assert.assertEquals(string,homePageTitle);
    }
    @Then("home page close driver")
    public void home_page_close_driver() {
     homePage.closeDriver();
    }
}
