package co.com.choucair.certification.pruebaTecnica.tasks;

import co.com.choucair.certification.pruebaTecnica.userinterface.ChoucairJoinPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Jointoday implements Task {

    public static Jointoday OnThePage()
    {
        return Tasks.instrumented(Jointoday.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ChoucairJoinPage.LOGIN_BUTTON)
        );
    }
}
