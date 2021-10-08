package co.com.choucair.certification.pruebaTecnica.tasks;

import net.serenitybdd.screenplay.Actor;
import co.com.choucair.certification.pruebaTecnica.userinterface.ChoucairUtestPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;


public class OpenUp implements Task {
    private ChoucairUtestPage choucairUtestPage;
    public static OpenUp thePage() {
        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(choucairUtestPage));
    }
}
