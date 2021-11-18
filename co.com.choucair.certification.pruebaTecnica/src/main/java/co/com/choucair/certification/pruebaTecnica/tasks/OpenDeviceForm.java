package co.com.choucair.certification.pruebaTecnica.tasks;

import co.com.choucair.certification.pruebaTecnica.model.AcademyChoucairData;
import co.com.choucair.certification.pruebaTecnica.userinterface.ChoucairOpenDeviceForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

public class OpenDeviceForm implements Task {
    private  AcademyChoucairData AcademyChoucairData;

    public OpenDeviceForm(AcademyChoucairData AcademyChoucairData) {
        this.AcademyChoucairData=AcademyChoucairData;
    }

    public static OpenDeviceForm the(AcademyChoucairData AcademyChoucairData){
        return Tasks.instrumented(OpenDeviceForm.class,AcademyChoucairData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ChoucairOpenDeviceForm.BUTTON_COMPUTER),
                Enter.theValue(AcademyChoucairData.getStrComputer()).into(ChoucairOpenDeviceForm.INPUT_COMPUTER),
                Hit.the(Keys.DOWN).keyIn(ChoucairOpenDeviceForm.INPUT_COMPUTER),
                Hit.the(Keys.ENTER).keyIn(ChoucairOpenDeviceForm.INPUT_COMPUTER),
                Click.on(ChoucairOpenDeviceForm.BUTTON_VERSION),
                Enter.theValue(AcademyChoucairData.getStrVersion()).into(ChoucairOpenDeviceForm.INPUT_VERSION),
                Hit.the(Keys.DOWN).keyIn(ChoucairOpenDeviceForm.INPUT_VERSION),
                Hit.the(Keys.ENTER).keyIn(ChoucairOpenDeviceForm.INPUT_VERSION),
                Click.on(ChoucairOpenDeviceForm.BUTTON_LANGUAGE_PC),
                Enter.theValue(AcademyChoucairData.getStrLanguagePc()).into(ChoucairOpenDeviceForm.INPUT_LANGUAGE_PC),
                Hit.the(Keys.DOWN).keyIn(ChoucairOpenDeviceForm.INPUT_LANGUAGE_PC),
                Hit.the(Keys.ENTER).keyIn(ChoucairOpenDeviceForm.INPUT_LANGUAGE_PC),
                Click.on(ChoucairOpenDeviceForm.BUTTON_MOBILE_DEVICE),
                Enter.theValue(AcademyChoucairData.getStrMobileDevice()).into(ChoucairOpenDeviceForm.INPUT_MOBILE_DEVICE),
                Hit.the(Keys.DOWN).keyIn(ChoucairOpenDeviceForm.INPUT_MOBILE_DEVICE),
                Hit.the(Keys.ENTER).keyIn(ChoucairOpenDeviceForm.INPUT_MOBILE_DEVICE),
                Click.on(ChoucairOpenDeviceForm.BUTTON_MODEL),
                Enter.theValue(AcademyChoucairData.getStrModel()).into(ChoucairOpenDeviceForm.INPUT_MODEL),
                Hit.the(Keys.DOWN).keyIn(ChoucairOpenDeviceForm.INPUT_MODEL),
                Hit.the(Keys.ENTER).keyIn(ChoucairOpenDeviceForm.INPUT_MODEL),
                Click.on(ChoucairOpenDeviceForm.BUTTON_OS),
                Enter.theValue(AcademyChoucairData.getStrOS()).into(ChoucairOpenDeviceForm.INPUT_OS),
                Hit.the(Keys.DOWN).keyIn(ChoucairOpenDeviceForm.INPUT_OS),
                Hit.the(Keys.ENTER).keyIn(ChoucairOpenDeviceForm.INPUT_OS),
                Click.on(ChoucairOpenDeviceForm.BUTTON_LAST_STEP)
        );
    }
}

