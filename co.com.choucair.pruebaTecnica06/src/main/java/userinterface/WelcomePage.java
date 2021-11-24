package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
public class WelcomePage extends PageObject {
    public static final Target WELCOME_MESSAGE = Target.the("where you should see the welcome message")
            .located(By.xpath("//div[@class='image-box-header']/h1"));
}
