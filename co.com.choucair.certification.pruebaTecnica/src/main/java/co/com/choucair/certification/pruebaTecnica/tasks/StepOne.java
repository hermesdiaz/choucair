package co.com.choucair.certification.pruebaTecnica.tasks;

import co.com.choucair.certification.pruebaTecnica.userinterface.ChoucairStepOne;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;


public class StepOne implements Task {
    private String strNombre;
    private String strApellido;
    private String strEmail;
    private String strMes;
    private String strDia;
    private String strAno;
    //------------------------------
    private String strCiudad;
    private String strCodigoPostal;
    private String strPais;
    //------------------------------
    private String strComputer;
    private String strVersion;
    private String strLanguagePc;
    private String strMobileDevice;
    private String strModel;
    private String strOS;
    private String strPassword;

    public StepOne(String strNombre, String strApellido, String strEmail, String strMes, String strDia, String strAno,String strCiudad, String strCodigoPostal, String strPais, String strComputer,String strVersion,String strLanguagePc, String strMobileDevice, String strModel,String strOS, String strPassword) {
        this.strNombre = strNombre;
        this.strApellido = strApellido;
        this.strEmail = strEmail;
        this.strMes = strMes;
        this.strDia = strDia;
        this.strAno = strAno;
        this.strCiudad = strCiudad;
        this.strCodigoPostal = strCodigoPostal;
        this.strPais = strPais;
        this.strComputer = strComputer;
        this.strVersion = strVersion;
        this.strLanguagePc = strLanguagePc;
        this.strMobileDevice = strMobileDevice;
        this.strModel = strModel;
        this.strOS = strOS;
        this.strPassword = strPassword;
    }

    public static StepOne the(String strNombre, String strApellido, String strEmail, String strMes, String strDia, String strAno,String strCiudad, String strCodigoPostal, String strPais,String strComputer,String strVersion,String strLanguagePc, String strMobileDevice, String strModel,String strOS, String strPassword){
        return Tasks.instrumented(StepOne.class,strNombre, strApellido, strEmail,strMes, strDia,strAno,strCiudad, strCodigoPostal, strPais,strComputer,strVersion,strLanguagePc,strMobileDevice,strModel,strOS,strPassword);
    }



    @Override
    public <T extends Actor> void performAs(T actor) {
       actor.attemptsTo(
               Enter.theValue(strNombre).into(ChoucairStepOne.INPUT_FIRSTNAME),
               Enter.theValue(strApellido).into(ChoucairStepOne.INPUT_LASTNAME),
               Enter.theValue(strEmail).into(ChoucairStepOne.INPUT_EMAIL),
               SelectFromOptions.byIndex(Integer.parseInt(strMes)).from(ChoucairStepOne.MONTH_BUTTON),
               SelectFromOptions.byIndex(Integer.parseInt(strDia)).from(ChoucairStepOne.DAY_BUTTON),
               SelectFromOptions.byVisibleText("1997").from(ChoucairStepOne.YEAR_BUTTON),
               Click.on(ChoucairStepOne.NEXT_BUTTON),
               Enter.theValue(strCiudad).into(ChoucairStepOne.INPUT_CITY),
               Hit.the(Keys.DOWN).keyIn(ChoucairStepOne.INPUT_CITY),
               Hit.the(Keys.ENTER).keyIn(ChoucairStepOne.INPUT_CITY),
               Enter.theValue(strCodigoPostal).into(ChoucairStepOne.INPUT_POSTALCODE),
               Click.on(ChoucairStepOne.COUNTRY_BUTTON),
               Enter.theValue(strPais).into(ChoucairStepOne.COUNTRY_BUTTON2),
               Hit.the(Keys.ENTER).keyIn(ChoucairStepOne.COUNTRY_BUTTON2),
               Click.on(ChoucairStepOne.NEXT_BUTTON2),

               Click.on(ChoucairStepOne.BUTTON_COMPUTER),
               Enter.theValue(strComputer).into(ChoucairStepOne.INPUT_COMPUTER),
               Hit.the(Keys.DOWN).keyIn(ChoucairStepOne.INPUT_COMPUTER),
               Hit.the(Keys.ENTER).keyIn(ChoucairStepOne.INPUT_COMPUTER),
               Click.on(ChoucairStepOne.BUTTON_VERSION),
               Enter.theValue(strVersion).into(ChoucairStepOne.INPUT_VERSION),
               Hit.the(Keys.DOWN).keyIn(ChoucairStepOne.INPUT_VERSION),
               Hit.the(Keys.ENTER).keyIn(ChoucairStepOne.INPUT_VERSION),
               Click.on(ChoucairStepOne.BUTTON_LANGUAGE_PC),
               Enter.theValue(strLanguagePc).into(ChoucairStepOne.INPUT_LANGUAGE_PC),
               Hit.the(Keys.DOWN).keyIn(ChoucairStepOne.INPUT_LANGUAGE_PC),
               Hit.the(Keys.ENTER).keyIn(ChoucairStepOne.INPUT_LANGUAGE_PC),
               Click.on(ChoucairStepOne.BUTTON_MOBILE_DEVICE),
               Enter.theValue(strMobileDevice).into(ChoucairStepOne.INPUT_MOBILE_DEVICE),
               Hit.the(Keys.DOWN).keyIn(ChoucairStepOne.INPUT_MOBILE_DEVICE),
               Hit.the(Keys.ENTER).keyIn(ChoucairStepOne.INPUT_MOBILE_DEVICE),
               Click.on(ChoucairStepOne.BUTTON_MODEL),
               Enter.theValue(strModel).into(ChoucairStepOne.INPUT_MODEL),
               Hit.the(Keys.DOWN).keyIn(ChoucairStepOne.INPUT_MODEL),
               Hit.the(Keys.ENTER).keyIn(ChoucairStepOne.INPUT_MODEL),
               Click.on(ChoucairStepOne.BUTTON_OS),
               Enter.theValue(strOS).into(ChoucairStepOne.INPUT_OS),
               Hit.the(Keys.DOWN).keyIn(ChoucairStepOne.INPUT_OS),
               Hit.the(Keys.ENTER).keyIn(ChoucairStepOne.INPUT_OS),
               Click.on(ChoucairStepOne.BUTTON_LAST_STEP),

               Enter.theValue(strPassword).into(ChoucairStepOne.INPUT_PASSWORD),
               Enter.theValue(strPassword).into(ChoucairStepOne.INPUT_CONFIRM_PASSWORD),
               Click.on(ChoucairStepOne.CHECKBOX_INFORMED),
               Click.on(ChoucairStepOne.CHECKBOX_TERM_USE),
               Click.on(ChoucairStepOne.CHECKBOX_PRIVACY_SECURITY),
               Click.on(ChoucairStepOne.BUTTON_COMPLETE_SETUP),

               WaitUntil.the(ChoucairStepOne.SUCCESSFULLY_SIGNUP, WebElementStateMatchers.isVisible()).forNoMoreThan(120).seconds()


       );
    }
}
