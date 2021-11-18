package co.com.choucair.certification.pruebaTecnica.tasks;
import co.com.choucair.certification.pruebaTecnica.model.AcademyChoucairData;
import co.com.choucair.certification.pruebaTecnica.userinterface.ChoucairOpenDeviceForm;
import co.com.choucair.certification.pruebaTecnica.userinterface.ChoucairOpenPasswordForm;
import co.com.choucair.certification.pruebaTecnica.userinterface.ChoucairOpenPersonalForm;
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
public class OpenPasswordForm implements Task {
    private  AcademyChoucairData AcademyChoucairData;

    public OpenPasswordForm(AcademyChoucairData AcademyChoucairData) {
        this.AcademyChoucairData=AcademyChoucairData;
    }

    public static OpenPasswordForm the(AcademyChoucairData AcademyChoucairData){
        return Tasks.instrumented(OpenPasswordForm.class,AcademyChoucairData);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo( Enter.theValue(AcademyChoucairData.getStrPassword()).into(ChoucairOpenPasswordForm.INPUT_PASSWORD),
                Enter.theValue(AcademyChoucairData.getStrPassword()).into(ChoucairOpenPasswordForm.INPUT_CONFIRM_PASSWORD),
                Click.on(ChoucairOpenPasswordForm.CHECKBOX_INFORMED),
                Click.on(ChoucairOpenPasswordForm.CHECKBOX_TERM_USE),
                Click.on(ChoucairOpenPasswordForm.CHECKBOX_PRIVACY_SECURITY),
                Click.on(ChoucairOpenPasswordForm.BUTTON_COMPLETE_SETUP),

                WaitUntil.the(ChoucairOpenPasswordForm.SUCCESSFULLY_SIGNUP, WebElementStateMatchers.isVisible()).forNoMoreThan(120).seconds()


        );
    }
}
