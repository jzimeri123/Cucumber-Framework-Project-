package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utils.CommonMethods;

public class DashboardSteps extends CommonMethods {
    @Then("user is navigated to dashboard page")
    public void user_is_navigated_to_dashboard_page() {
       Assert.assertEquals("Dashboard", dashboardPage.dashboardField.getText());
    }


    }

