package actions;

import elements.KEKA_Elements;
import framework.Configuration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import steps.Driver_Steps;

import java.io.IOException;

public class Keka_Actions {

    WebDriver driver;
    KEKA_Elements keka_elements;
    public Keka_Actions(Driver_Steps driver_steps) {

        this.driver = driver_steps.getDriver();
        keka_elements = new KEKA_Elements(driver);
    }
    public void loginPage() throws Exception {

        GlobalWait.wait.until(ExpectedConditions.visibilityOf(keka_elements.verifyLoginPage));
    }
    public void signIn() throws IOException {

        String email=Configuration.get("emailid");
        keka_elements.login_email.sendKeys(email);
        keka_elements.continueBtn.click();
        keka_elements.microsoftBtn.click();
        String password = Configuration.get("password");
        GlobalWait.wait.until(ExpectedConditions.visibilityOf(keka_elements.mspwd)).sendKeys(password);
        keka_elements.subtn.click();

    }


    public void homePage(){

        GlobalWait.wait.until(ExpectedConditions.visibilityOf(keka_elements.verifyhomepage));
    }
    public void myTeam(){

        GlobalWait.wait.until(ExpectedConditions.visibilityOf(keka_elements.myteam)).click();
    }

    public void summaryPage(){

        GlobalWait.wait.until(ExpectedConditions.visibilityOf(keka_elements.summarypage));

    }

    public void viewEmployees(){

        GlobalWait.wait.until(ExpectedConditions.visibilityOf(keka_elements.viewemp)).click();
    }

    public void viewEmployeePage(){

        GlobalWait.wait.until(ExpectedConditions.visibilityOf(keka_elements.viewemployeepage));
    }

    public void empDownload() throws InterruptedException {

        GlobalWait.wait.until(ExpectedConditions.visibilityOf(keka_elements.download)).click();
        Thread.sleep(1000);
    }

    public void EmpDownloadPDF(){

        GlobalWait.wait.until(ExpectedConditions.visibilityOf(keka_elements.downloadpdf)).click();
    }

    public void CloseButton(){

        GlobalWait.wait.until(ExpectedConditions.visibilityOf(keka_elements.closebtn)).click();
    }

    public void sampleMethod1(){
        System.out.println("Method1");
    }
    public void sampleMethod2(){
        System.out.println("Method2");
    }
    public void sampleMethod3(){
        System.out.println("Method3");
    }


}


