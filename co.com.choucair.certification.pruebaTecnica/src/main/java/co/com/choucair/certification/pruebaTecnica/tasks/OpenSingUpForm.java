package co.com.choucair.certification.pruebaTecnica.tasks;

import co.com.choucair.certification.pruebaTecnica.userinterface.ChoucairJoinPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import static net.serenitybdd.screenplay.actions.Click.on;

public class OpenSingUpForm implements Task {

    public static OpenSingUpForm OnThePage()
    {
        return Tasks.instrumented(OpenSingUpForm.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(on(ChoucairJoinPage.LOGIN_BUTTON)
        );
    }
}
