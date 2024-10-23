package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AddEmployeePage;
import pages.LoginPage;
import utils.CommonMethods;
import utils.ConfigReader;

import java.io.IOException;
import java.sql.SQLOutput;

public class AddEmployeeSteps extends CommonMethods {

    @When("user clicks on PIM option")
    public void user_clicks_on_pim_option() {
    click(addEmployeePage.pimOption);
    }

    @When("user clicks on add employee option")
    public void user_clicks_on_add_employee_option() {
        click(addEmployeePage.addEmployeeOption);
    }

    @When("user clicks on save button")
    public void user_clicks_on_save_button() {
        click(addEmployeePage.saveButton);
    }

    @Then("employee is added successfully and {string} is displayed")
    public void employee_is_added_successfully_and_is_displayed(String expectedTxt) {
        Assert.assertEquals(expectedTxt,addEmployeePage.personalDetailsLocator.getText());
    }

    @When("user enters unique employee ID")
    public void user_enters_unique_employee_id() {
        String randomID = String.valueOf((int)(Math.random() * 1000000 - Math.random()*3 + Math.random()));
        sendText(randomID, addEmployeePage.employeeIDLocator);
    }

    @Given("user adds {string}, {string}, {string} and {string}")
    public void user_adds_and(String fn, String mn, String ln, String eID) {
        sendText(fn, addEmployeePage.firstNameLocator);
        sendText(mn, addEmployeePage.middleNameLocator);
        sendText(ln, addEmployeePage.lastNameLocator);
        sendText(eID, addEmployeePage.employeeIDLocator);
    }

    @When("user enters {string},{string} and {string}")
    public void user_enters_and(String fn, String mn, String ln) {
        sendText(fn, addEmployeePage.firstNameLocator);
        sendText(mn, addEmployeePage.middleNameLocator);
        sendText(ln, addEmployeePage.lastNameLocator);
    }

    @When("user enters {string} in existing employee ID")
    public void user_enters_in_existing_employee_id(String existingEmpID) {
       sendText(existingEmpID, addEmployeePage.employeeIDLocator);
    }

    @Then("user can see error message {string}")
    public void user_can_see_error_message(String errorMsg) {
        Assert.assertEquals(errorMsg,addEmployeePage.emptyFirstNameErrorMsg.getText());
    }

    @Then("user can see {string} error message in last name")
    public void user_can_see_error_message_in_last_name(String errorMsg) {
        Assert.assertEquals(errorMsg, addEmployeePage.emptyLastNameErrorMsg.getText());
    }

    @Then("user can see the {string} error message")
    public void user_can_see_the_error_message(String errorMsg) {
        String str=addEmployeePage.employeeIDExistsErrorMsg.getText();
        String newstr=str.substring(0,14);
        //System.out.println("************************************");
       // System.out.println(newstr);
        //System.out.println("************************************");
        Assert.assertEquals(errorMsg,newstr);

    }
}

