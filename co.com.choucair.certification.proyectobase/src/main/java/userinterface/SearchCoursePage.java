package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {
    public static final Target BUTTON_UC = Target.the("Se busca cursos y certificaciones").located(By.xpath("//*[@id=\"certificaciones\"]/a/img"));
    public static final Target INPUT_CURSE = Target.the("Se escribe el curso Foundation Level").located(By.id("coursesearchbox"));
    public static final Target BUTTON_BUSCAR = Target.the("Boton para buscar el curso").located(By.xpath("//*[@id=\"coursesearch\"]/fieldset/button"));
    public static final Target ACCION_SELECCIONAR_CURSO = Target.the("Se selecciona el curso").located(By.xpath("/html/body/div[2]/div[2]/div/div/div/section/div/div/div[1]/h4/a"));
}

