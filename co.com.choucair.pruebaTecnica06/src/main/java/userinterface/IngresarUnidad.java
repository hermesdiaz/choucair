package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class IngresarUnidad extends PageObject {

    public static final Target SELECCIONAR_ORGANIZACION = Target.the("Se selecciona organizacion").located(By.xpath("//*[@id=\"SidebarMenu\"]/li[6]/a"));
    public static final Target SELECCIONAR_BUSSINES_INIT = Target.the("Se selecciona bussines units").located(By.xpath("//*[@id=\"SidebarMenu\"]/li[6]/ul/li[1]"));
    public static final Target CREAR_BUSSINES_INIT = Target.the("Se crea un bussines units").located(By.xpath("//*[@id=\"GridDiv\"]/div[2]/div[2]/div/div/div[1]/div/span"));
    public static final Target NOMBRE_BUSSINES_INIT = Target.the("Se escribe el nombre del nuevo bussines unit").located(By.xpath("//*[@id=\"StartSharp_Organization_BusinessUnitDialog7_Name\"]"));
    public static final Target SELECCIONAR_PARENT = Target.the("Se selecciona un parent").located(By.id("select2-chosen-1"));
    public static final Target BOTON_CREAR = Target.the("se crea el unit").located(By.xpath("//span[text()=\" Save\"]"));
}
