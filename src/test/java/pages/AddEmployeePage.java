package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class AddEmployeePage extends CommonMethods {

@FindBy(xpath = "//b[text()='PIM']")
public WebElement pimOption;

@FindBy(xpath = "//a[text()='Add Employee']")
public WebElement addEmployeeOption;

@FindBy(name = "firstName")
public WebElement firstNameLocator;

@FindBy(name = "middleName")
public WebElement middleNameLocator;

@FindBy(name = "lastName")
public WebElement lastNameLocator;

@FindBy(id = "btnSave")
public WebElement saveButton;

@FindBy(xpath = "//h1[text()='Personal Details']")
public WebElement personalDetailsLocator;

@FindBy(id = "employeeId")
public WebElement employeeIDLocator;

@FindBy(xpath = "//span[@for='firstName']")
public WebElement emptyFirstNameErrorMsg;

@FindBy(xpath = "//span[@for='lastName']")
public WebElement emptyLastNameErrorMsg;

@FindBy(xpath = "//div[contains(text(),'Failed To Save: Employee Id Exists')]" )
public WebElement employeeIDExistsErrorMsg;


public AddEmployeePage(){
    PageFactory.initElements(driver,this);
}

}
