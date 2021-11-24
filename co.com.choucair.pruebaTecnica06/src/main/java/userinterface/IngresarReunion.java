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
    public static final Target ORGANIZADO_TITULO = Target.the("se ingresa el nombre de localizacion").located(By.id("StartSharp_Meeting_MeetingLocationDialog37_Name"));

}


organizado por //*[@id="StartSharp_Meeting_MeetingDialog14_PropertyGrid"]/div/div/div[8]/a/b
titulo StartSharp_Organization_ContactDialog44_Title
primernombre StartSharp_Organization_ContactDialog44_FirstName
segundonombre StartSharp_Organization_ContactDialog44_LastName
guardarorganizado //*[@id="StartSharp_Organization_ContactDialog44_Toolbar"]/div/div/div/div[1]/div/span

<<<<<<< HEAD
<<<<<<< HEAD
    public static final Target ORDER_BY_ID_BUTTON = Target.the("where you click to save the meeting").located(By.xpath("//span[text()='ID']"));
    public static final Target CREATED_MEETING_NAME_DIV = Target.the("where you click to save the meeting").located(By.xpath("//div[contains(@class,'ui-widget-content slick-row ')][last()]//div[@class='slick-cell l1 r1']//a"));
    public static final Target SELECCIONAR_ERROR = Target.the("se selecciona el error de nombre nulo de reunion").located(By.xpath("//label[@class=\"error\"]"));


=======
>>>>>>> parent of 5d9a0ec (Proyecto .bad)
    public static final Target GUARDAR_REUNION= Target.the("se guarda la informacion de la reunion").located(By.xpath("//span[text()=' Save'][1]"));
=======
atendido //*[@id="StartSharp_Meeting_MeetingDialog14_AttendeeList"]/div[1]/a/b
titulo StartSharp_Organization_ContactDialog62_Title
nombre StartSharp_Organization_ContactDialog62_FirstName
apellido StartSharp_Organization_ContactDialog62_LastName
guardar //*[@id="StartSharp_Organization_ContactDialog62_Toolbar"]/div/div/div/div[1]/div/span
>>>>>>> parent of 117a8eb (Ejercicio finalizado)

numero de reunion StartSharp_Meeting_MeetingDialog14_MeetingNumber

seleccionarunit select2-chosen-8

reportero //*[@id="StartSharp_Meeting_MeetingDialog14_PropertyGrid"]/div/div/div[9]/a/b
titulo StartSharp_Organization_ContactDialog80_Title
nombre StartSharp_Organization_ContactDialog80_FirstName
apellido StartSharp_Organization_ContactDialog80_LastName
guardar //*[@id="StartSharp_Organization_ContactDialog80_Toolbar"]/div/div/div/div[1]/div/span


guardar reunion //*[@id="StartSharp_Meeting_MeetingDialog14_Toolbar"]/div/div/div/div[1]/div/span