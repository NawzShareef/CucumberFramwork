package steps;

import actions.Keka_Actions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class Keka_Steps {
    Keka_Actions keka_actions;
    Driver_Steps driver_steps;

    public Keka_Steps(Driver_Steps driver_steps, Keka_Actions keka_actions) {
        this.keka_actions = keka_actions;
        this.driver_steps = driver_steps;
    }

    @Given("I am on the {string} of Keka Portal")
    public void keka_login_page(String loginPage) throws Exception {
        keka_actions.loginPage();
    }

    @When("I login through Microsoft Account by providing valid {string} and {string}")
    public void microsoft_account(String username, String password) throws IOException {
        keka_actions.signIn();
    }

    @Then("I am on {string} of Keka Portal")
    public void homePage(String homepage) {
        keka_actions.homePage();
    }

    @When("I click on {string}")
    public void click_on_myteam(String myTeam) throws InterruptedException {
        Thread.sleep(3000);
        keka_actions.myTeam();
    }

    @Then("I should be on {string}")
    public void summary_Page(String summarypage) {
        keka_actions.summaryPage();
    }

    @Then("I click on {string} list")
    public void view_Employee(String viewemployee) {
        keka_actions.viewEmployees();
    }

    @Then("I should be navigated to {string}")
    public void employee_Page(String emplyeepage) {

    }

    @When("I click on the {string}")
    public void iClickOnThe(String downloadIcon) throws InterruptedException {
        keka_actions.empDownload();
    }

    @Then("I should view {string} in {string}")
    public void i_should_view_in(String string, String string2) {

    }


    @Then("I should be able to view and click on {string}")
    public void iShouldBeAbleToViewAndClickOn(String empdownloadpdf) {
        keka_actions.EmpDownloadPDF();

    }
}