package co.com.choucair.certification.pruebaTecnica.userinterface;

import cucumber.api.java.eo.Se;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;

import java.beans.Transient;


public class ChoucairStepOne extends PageObject {


    public static final Target INPUT_FIRSTNAME = Target.the("where do we write the user").located(By.id("firstName"));
    public static final Target INPUT_LASTNAME = Target.the("where do we write the user").located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("where do we write the user").located(By.id("email"));
    public static final Target MONTH_BUTTON = Target.the("Button to confirm login").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[4]/div[2]/div/div[1]/select"));
    public static final Target DAY_BUTTON = Target.the("Button to confirm login").located(By.id("birthDay"));
    public static final Target YEAR_BUTTON = Target.the("Button to confirm login").located(By.id("birthYear"));
    public static final Target NEXT_BUTTON = Target.the("Button to confirm login").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a/span"));
    public static final Target INPUT_CITY = Target.the("where do we write the user").located(By.id("city"));
    public static final Target INPUT_POSTALCODE = Target.the("where do we write the user").located(By.id("zip"));
    public static final Target COUNTRY_BUTTON = Target.the("Button to confirm login").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]/span/span[2]"));
    public static final Target COUNTRY_BUTTON2 = Target.the("Caja de texto").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
    public static final Target NEXT_BUTTON2 = Target.the("Button to confirm login").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a"));
    public static final Target BUTTON_COMPUTER = Target.the("locate field to write computer s.o").located(By.xpath("//div[@class='ui-select-match' and @placeholder='Select OS']"));
    public static final Target INPUT_COMPUTER = Target.the("locate field to write computer s.o").located(By.xpath("//input[@type='search' and @placeholder='Select OS']"));
    public static final Target BUTTON_VERSION = Target.the("locate field to write computer s.o").located(By.xpath("//div[@class='ui-select-match' and @placeholder='Select a Version']"));
    public static final Target INPUT_VERSION = Target.the("locate field to write version s.o").located(By.xpath("//input[@type='search' and @placeholder='Select a Version']"));
    public static final Target BUTTON_LANGUAGE_PC = Target.the("locate field to write language PC").located(By.xpath("//div[@class='ui-select-match' and @placeholder='Select OS language']"));
    public static final Target INPUT_LANGUAGE_PC = Target.the("locate field to write Language PC").located(By.xpath("//input[@type='search' and @placeholder='Select OS language']"));
    public static final Target BUTTON_MOBILE_DEVICE = Target.the("locate field to write mobile device").located(By.xpath("//div[@class='ui-select-match' and @placeholder='Select Brand']"));
    public static final Target INPUT_MOBILE_DEVICE = Target.the("locate field to write mobile device").located(By.xpath("//input[@type='search' and @placeholder='Select Brand']"));
    public static final Target BUTTON_MODEL = Target.the("locate field to write model device").located(By.xpath("//div[@class='ui-select-match' and @placeholder='Select a Model']"));
    public static final Target INPUT_MODEL = Target.the("locate field to write model device").located(By.xpath("//input[@type='search' and @placeholder='Select a Model']"));
    public static final Target BUTTON_OS = Target.the("locate field to write mobile device os").located(By.name("handsetOSId"));
    public static final Target INPUT_OS = Target.the("locate field to write mobile device os").located(By.xpath("//div[@name='handsetOSId']//input[@type='search' and @placeholder='Select OS']"));
    public static final Target BUTTON_LAST_STEP = Target.the("locate button to next stepFour, last step").located(By.xpath("//div[@class='pull-right next-step']//span[contains(text(),'Next: Last Step')]"));
    public static final Target INPUT_PASSWORD = Target.the("locate input to write password").located(By.id("password"));
    public static final Target INPUT_CONFIRM_PASSWORD = Target.the("locate input to write confirm password").located(By.id("confirmPassword"));
    public static final Target CHECKBOX_INFORMED = Target.the("locate checkbox to accept receive info").located(By.name("newsletterOptIn"));
    public static final Target CHECKBOX_TERM_USE = Target.the("locate checkbox to accept terms use").located(By.name("termOfUse"));
    public static final Target CHECKBOX_PRIVACY_SECURITY = Target.the("locate checkbox to accept privacy and security policy").located(By.name("privacySetting"));
    public static final Target BUTTON_COMPLETE_SETUP = Target.the("locate button finish signup process").located(By.xpath("//div[@class='pull-right next-step']//a[@aria-label='Complete Setup']"));
    public static final Target EMAIL_EXISTS = Target.the("locate span to validate email warningEmail already registered error").located(By.xpath("//span[@id='emailError']"));
    public static final Target SUCCESSFULLY_SIGNUP = Target.the("locate H1 to confirm successfully signup").located(By.id("mainContent"));
}
