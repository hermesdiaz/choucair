package co.com.choucair.certification.pruebaTecnica.userinterface;

import net.serenitybdd.core.pages.PageObject;
import cucumber.api.java.eo.Se;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;

import java.beans.Transient;

public class ChoucairOpenPasswordForm extends PageObject {

    public static final Target INPUT_PASSWORD = Target.the("locate input to write password").located(By.id("password"));
    public static final Target INPUT_CONFIRM_PASSWORD = Target.the("locate input to write confirm password").located(By.id("confirmPassword"));
    public static final Target CHECKBOX_INFORMED = Target.the("locate checkbox to accept receive info").located(By.name("newsletterOptIn"));
    public static final Target CHECKBOX_TERM_USE = Target.the("locate checkbox to accept terms use").located(By.name("termOfUse"));
    public static final Target CHECKBOX_PRIVACY_SECURITY = Target.the("locate checkbox to accept privacy and security policy").located(By.name("privacySetting"));
    public static final Target BUTTON_COMPLETE_SETUP = Target.the("locate button finish signup process").located(By.xpath("//div[@class='pull-right next-step']//a[@aria-label='Complete Setup']"));
    public static final Target EMAIL_EXISTS = Target.the("locate span to validate email warningEmail already registered error").located(By.xpath("//span[@id='emailError']"));
    public static final Target SUCCESSFULLY_SIGNUP = Target.the("locate H1 to confirm successfully signup").located(By.id("mainContent"));
}
