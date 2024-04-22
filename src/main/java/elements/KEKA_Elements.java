package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KEKA_Elements {

 WebDriver driver;

 @FindBy(xpath="//p[text()='Login to Keka']")
 public WebElement verifyLoginPage;
 @FindBy(xpath = "//input[@name='UserName']")
 public WebElement login_email;

 @FindBy(xpath = "//button[text()='Continue']")
 public WebElement continueBtn;

 @FindBy(xpath = "//p[text()='Microsoft']")
 public WebElement microsoftBtn;

 @FindBy(xpath = "//input[@type='password']")
 public WebElement mspwd;

 @FindBy(xpath = "//input[@data-report-value='Submit']")
 public WebElement subtn;

 @FindBy(xpath = "//a[text()=' Adaps IT Private Limited ']")
 public WebElement verifyhomepage;

 @FindBy(xpath = "//li/a/span[text()='My Team']")
 public WebElement myteam;

 @FindBy(xpath="//div/ul[@class='nav topnav']")
 public WebElement summarypage;

 @FindBy(xpath = "//a[text()='View Employees']")
 public WebElement viewemp;

 @FindBy(xpath="//h5[text()='View Employees']")
 public WebElement viewemployeepage;

 @FindBy(xpath = "//div/a/span[@class='ki-download ki']")
 public WebElement download;

 @FindBy(xpath = "//a[text()='Download Pdf']")
 public WebElement downloadpdf;

 @FindBy(xpath = "//span[@class='ki-close align-self-center']")
 public WebElement closebtn;

  public KEKA_Elements(WebDriver driver) {
  this.driver = driver;
  PageFactory.initElements(driver, this);
}
}
