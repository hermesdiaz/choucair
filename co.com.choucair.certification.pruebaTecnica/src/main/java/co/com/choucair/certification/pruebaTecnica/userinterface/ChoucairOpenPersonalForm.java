package co.com.choucair.certification.pruebaTecnica.userinterface;
import cucumber.api.java.eo.Se;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;

import java.beans.Transient;

public class ChoucairOpenPersonalForm extends PageObject{
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
}
