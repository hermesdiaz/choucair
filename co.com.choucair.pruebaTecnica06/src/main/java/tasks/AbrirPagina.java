package tasks;
import model.DatosUsuario;
import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import userinterface.PaginaStarSharpUrl;

public class AbrirPagina implements Task{

    private PaginaStarSharpUrl Pagina;
    public static AbrirPagina thePage() {
        return Tasks.instrumented(AbrirPagina.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(Pagina));

    }
}
