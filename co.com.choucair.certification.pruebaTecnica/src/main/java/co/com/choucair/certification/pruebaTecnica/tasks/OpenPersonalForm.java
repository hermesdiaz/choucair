package co.com.choucair.certification.pruebaTecnica.tasks;
import co.com.choucair.certification.pruebaTecnica.model.AcademyChoucairData;
import co.com.choucair.certification.pruebaTecnica.userinterface.ChoucairOpenPersonalForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;
public class OpenPersonalForm implements Task {
    private AcademyChoucairData AcademyChoucairData;

    public OpenPersonalForm(AcademyChoucairData AcademyChoucairData) {
        this.AcademyChoucairData=AcademyChoucairData;
    }

    public static OpenPersonalForm the(AcademyChoucairData AcademyChoucairData){
        return Tasks.instrumented(OpenPersonalForm.class,AcademyChoucairData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(AcademyChoucairData.getStrNombre()).into(ChoucairOpenPersonalForm.INPUT_FIRSTNAME),
                Enter.theValue(AcademyChoucairData.getStrApellido()).into(ChoucairOpenPersonalForm.INPUT_LASTNAME),
                Enter.theValue(AcademyChoucairData.getStrEmail()).into(ChoucairOpenPersonalForm.INPUT_EMAIL),
                SelectFromOptions.byIndex(Integer.parseInt(AcademyChoucairData.getStrMes())).from(ChoucairOpenPersonalForm.MONTH_BUTTON),
                SelectFromOptions.byIndex(Integer.parseInt(AcademyChoucairData.getStrDia())).from(ChoucairOpenPersonalForm.DAY_BUTTON),
                SelectFromOptions.byVisibleText("1997").from(ChoucairOpenPersonalForm.YEAR_BUTTON),
                Click.on(ChoucairOpenPersonalForm.NEXT_BUTTON),
                Enter.theValue(AcademyChoucairData.getCiudad()).into(ChoucairOpenPersonalForm.INPUT_CITY),
                Hit.the(Keys.DOWN).keyIn(ChoucairOpenPersonalForm.INPUT_CITY),
                Hit.the(Keys.ENTER).keyIn(ChoucairOpenPersonalForm.INPUT_CITY),
                Enter.theValue(AcademyChoucairData.getCodigopostal()).into(ChoucairOpenPersonalForm.INPUT_POSTALCODE),
                Click.on(ChoucairOpenPersonalForm.COUNTRY_BUTTON),
                Enter.theValue(AcademyChoucairData.getPais()).into(ChoucairOpenPersonalForm.COUNTRY_BUTTON2),
                Hit.the(Keys.ENTER).keyIn(ChoucairOpenPersonalForm.COUNTRY_BUTTON2),
                Click.on(ChoucairOpenPersonalForm.NEXT_BUTTON2)
        );
    }
}
