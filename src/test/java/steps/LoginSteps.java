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
    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
       click(loginPage.loginButton);
    }

    @Then("user can see error message Username cannot be empty")
    public void user_can_see_error_message_username_cannot_be_empty() {
        String actualMessage= loginPage.errorMessage.getText();
        Assert.assertEquals("Username cannot be empty",actualMessage);
    }

    @When("user enters admin username and empty password")
    public void user_enters_admin_username_and_empty_password() throws IOException {
       sendText(ConfigReader.read("userName"), loginPage.usernameField);
    }
    @Then("user can see error message Password is empty")
    public void user_can_see_error_message_password_is_empty() {
        String actualMessage=loginPage.errorMessage.getText();
        Assert.assertEquals("Password is Empty",actualMessage);
    }

    @When("user enters incorrect username and admin password")
    public void user_enters_incorrect_username_and_admin_password() throws IOException {
       sendText("Administrator", loginPage.usernameField);
       sendText(ConfigReader.read("password"), loginPage.passwordField);

    }
    @Then("user can see error message Invalid credentials")
    public void user_can_see_error_message_invalid_credentials() {
        String actualMessage=loginPage.errorMessage.getText();
       Assert.assertEquals("Invalid credentials",actualMessage);
    }

    @When("user enters admin username and incorrect password")
    public void user_enters_admin_username_and_incorrect_password() throws IOException {
       sendText(ConfigReader.read("userName"), loginPage.usernameField);
       sendText("Humanhrm123", loginPage.passwordField);
    }


    @Then("user enters admin username and admin password")
    public void user_enters_admin_username_and_admin_password() throws IOException {
        sendText(ConfigReader.read("userName"),LoginPage.loginPage.usernameField);
        sendText(ConfigReader.read("password"),LoginPage.loginPage.passwordField);
    }
}
