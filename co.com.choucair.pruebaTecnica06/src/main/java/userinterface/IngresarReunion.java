package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class IngresarReunion extends PageObject {
    public static final Target SELECCIONAR_REUNION = Target.the("Se selecciona reunion").located(By.xpath("//*[@id=\"SidebarMenu\"]/li[5]/a"));
    public static final Target SELECCIONAR_REUNIONES = Target.the("Se selecciona reuniones").located(By.xpath("//*[@id=\"SidebarMenu\"]/li[5]/ul/li[1]/a"));
    public static final Target CREAR_REUNION = Target.the("Se crea reunion").located(By.xpath("//*[@id=\"GridDiv\"]/div[2]/div[2]/div/div/div[1]/div/span"));
    public static final Target INGRESAR_NOMBRE_REUNION = Target.the("Se ingresa el nombre de la reunion").located(By.id("StartSharp_Meeting_MeetingDialog14_MeetingName"));

    public static final Target LOCALIZACION = Target.the("Seleccionar localizacion").located(By.xpath("//*[@id=\"StartSharp_Meeting_MeetingDialog14_PropertyGrid\"]/div/div/div[6]/a/b"));
    public static final Target LOCALIZACION_NOMBRE = Target.the("se ingresa el nombre de localizacion").located(By.id("StartSharp_Meeting_MeetingLocationDialog37_Name"));
    public static final Target LOCALIZACION_DIRECCION = Target.the("se ingresa direccion de localizacion").located(By.id("StartSharp_Meeting_MeetingLocationDialog37_Address"));
    public static final Target LOCALIZACION_GUARDAR= Target.the("se guarda la informacion de localizacion").located(By.xpath("//*[@id=\"StartSharp_Meeting_MeetingLocationDialog37_Toolbar\"]/div/div/div/div[1]/div/span"));

    public static final Target ORGANIZADO= Target.the("seleccionar organizado").located(By.xpath("//*[@id=\"StartSharp_Meeting_MeetingDialog14_PropertyGrid\"]/div/div/div[8]/a/b"));
    public static final Target ORGANIZADO_TITULO = Target.the("se ingresa el titulo de organizado").located(By.name("Title"));
    public static final Target ORGANIZADO_PRIMERNOMBRE = Target.the("se ingresa el nombre de organizado").located(By.name("FirstName"));
    public static final Target ORGANIZADO_SEGUNDONOMBRE = Target.the("se ingresa el apellido de organizado").located(By.name("LastName"));
    public static final Target ORGANIZADO_CORREO = Target.the("se ingresa el correo").located(By.name("Email"));
    public static final Target ORGANIZADO_CORREO_DOMINIO = Target.the("se ingresa el dominio del correo").located(By.className("emaildomain"));
    public static final Target ORGANIZADO_GUARDAR= Target.the("se guarda la informacion de organizado").located(By.xpath(" //div[@class='s-TemplatedDialog ui-dialog-content ui-widget-content']//span[text()=' Save']"));


    public static final Target ATENDIDO= Target.the("seleccionar atendido").located(By.xpath("//*[@id=\"StartSharp_Meeting_MeetingDialog14_AttendeeList\"]/div[1]/a/b"));
    public static final Target ATENDIDO_TITULO =Target.the("se ingresa el titulo de atendido").located(By.name("Title"));
    public static final Target ATENDIDO_PRIMERNOMBRE = Target.the("se ingresa el nombre de atendido").located(By.name("FirstName"));
    public static final Target ATENDIDO_SEGUNDONOMBRE = Target.the("se ingresa el apellido de atendido").located(By.name("LastName"));
    public static final Target ATENDIDO_CORREO = Target.the("se ingresa el correo").located(By.name("Email"));
    public static final Target ATENDIDO_CORREO_DOMINIO = Target.the("se ingresa el dominio del correo").located(By.className("emaildomain"));
    public static final Target ATENDIDO_GUARDAR= Target.the("se guarda la informacion de atendido").located(By.xpath("//*[@id=\"StartSharp_Organization_ContactDialog152_Toolbar\"]/div/div/div/div[1]/div"));

    public static final Target NUMERO_REUNION = Target.the("se ingresa el numero de reunion").located(By.name("MeetingNumber"));

    public static final Target SELECCIONAR_UNIT = Target.the("se selecciona el init").located(By.id("select2-chosen-8"));
    public static final Target ESCRIBIR_UNIT = Target.the("se ingresa el input").located(By.id("s2id_autogen8_search"));


    public static final Target REPORTERO= Target.the("seleccionar reportero").located(By.xpath("//*[@id=\"StartSharp_Meeting_MeetingDialog14_PropertyGrid\"]/div/div/div[9]/a/b"));
    public static final Target REPORTERO_TITULO = Target.the("se ingresa el titulo de reportero").located(By.name("Title"));
    public static final Target REPORTERO_PRIMERNOMBRE = Target.the("se ingresa el nombre de reportero").located(By.name("FirstName"));
    public static final Target REPORTERO_SEGUNDONOMBRE = Target.the("se ingresa el apellido de reportero").located(By.name("LastName"));
    public static final Target REPORTERO_CORREO = Target.the("se ingresa el correo").located(By.name("Email"));
    public static final Target REPORTERO_CORREO_DOMINIO = Target.the("se ingresa el dominio del correo").located(By.className("emaildomain"));
    public static final Target REPORTERO_GUARDAR= Target.the("se guarda la informacion de reportero").located(By.xpath("//div[@class='ui-dialog ui-corner-all ui-widget ui-widget-content ui-front s-Dialog s-ContactDialog s-Organization-ContactDialog ui-draggable ui-resizable flex-layout']/div/div/div/div/div/div/div/div"));

    public static final Target GUARDAR_REUNION= Target.the("se guarda la informacion de la reunion").located(By.xpath("//span[text()=' Save'][1]"));

}




