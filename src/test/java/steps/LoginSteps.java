package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginPage;
import utils.CommonMethods;
import utils.ConfigReader;

import java.io.IOException;

public class LoginSteps extends CommonMethods {

    @When("user enters empty username and admin password")
    public void user_enters_empty_username_and_admin_password() throws IOException {
        sendText(ConfigReader.read("password"), loginPage.passwordField);
    }

    @When("user enters {string} in username")
    public void user_enters_in_username(String username) {
        sendText(username, loginPage.usernameField);
    }
    @When("when user enters {string} in password")
    public void when_user_enters_in_password(String password) {
        sendText(password, loginPage.passwordField);
    }

    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        click(loginPage.loginButton);
    }


    @Then("user can see the error message {string}")
    public void user_can_see_the_error_message(String errorMsg) {
        Assert.assertEquals(errorMsg,loginPage.errorMessage.getText());
    }

    @When("user enters admin username and empty password")
    public void user_enters_admin_username_and_empty_password() throws IOException {
        sendText(ConfigReader.read("userName"), loginPage.usernameField);
    }

    @Then("user can see password error message {string}")
    public void user_can_see_password_error_message(String errorMsg) {
        Assert.assertEquals(errorMsg,loginPage.errorMessage.getText());
    }

    @When("user enters incorrect username and admin password")
    public void user_enters_incorrect_username_and_admin_password() throws IOException {
        sendText("Administrator", loginPage.usernameField);
        sendText(ConfigReader.read("password"), loginPage.passwordField);
    }


    @Then("user can see invalid error message {string}")
    public void user_can_see_invalid_error_message(String errorMsg) {
        Assert.assertEquals(errorMsg,loginPage.errorMessage.getText());
    }


    @Then("user enters admin username and admin password")
    public void user_enters_admin_username_and_admin_password() throws IOException {
        sendText(ConfigReader.read("userName"), LoginPage.loginPage.usernameField);
        sendText(ConfigReader.read("password"), LoginPage.loginPage.passwordField);
    }


}
