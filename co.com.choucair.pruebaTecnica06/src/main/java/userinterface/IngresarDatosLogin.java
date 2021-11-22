package userinterface;

import net.serenitybdd.core.pages.PageObject;
import cucumber.api.java.eo.Se;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import java.beans.Transient;

public class IngresarDatosLogin extends PageObject {
    public static final Target INPUT_USER = Target.the("Se escribe el usuario").located(By.id("StartSharp_Membership_LoginPanel0_Username"));
    public static final Target INPUT_PASSWORD = Target.the("Se escribe la contraseña").located(By.id("StartSharp_Membership_LoginPanel0_Password"));
    public static final Target NEXT_BUTTON2 = Target.the("Boton que confirma el login").located(By.id("StartSharp_Membership_LoginPanel0_LoginButton"));
}
