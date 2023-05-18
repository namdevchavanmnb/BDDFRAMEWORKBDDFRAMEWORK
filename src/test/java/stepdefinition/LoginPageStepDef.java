package stepdefinition;

import com.brigelab.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginPageStepDef {
    LoginPage loginPage=new LoginPage();

    @Given("launch url {string}")
    public void launch_url(String string) {
        loginPage.launchURL(string);

    }

    @When("Enter User Name {string} and password {string}")
    public void enter_user_name_and_password(String string, String string2) {
        loginPage.setLogin(string,string2);

    }
    @And("Verify Login page Title {string}")
    public void verify_login_page_title(String string) throws InterruptedException {
        Thread.sleep(3000);
        String loginPageTitle=loginPage.getLoginPageTitle();
        Assert.assertEquals(string,loginPageTitle);
    }
    @Then("login and redirect to homepage")
    public void login_and_redirect_to_homepage() {
        loginPage.login();
    }
    @Then("login page close driver")
    public void login_page_close_driver() {
        loginPage.closeDriver();
    }
}
