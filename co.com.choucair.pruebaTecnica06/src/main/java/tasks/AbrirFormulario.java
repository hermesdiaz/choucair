package tasks;

import model.DatosUsuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.IngresarDatosLogin;
import userinterface.PaginaStarSharpUrl;

public class AbrirFormulario implements Task {

    private DatosUsuario DatosUsuario;

    public AbrirFormulario(DatosUsuario DatosUsuario) {
        this.DatosUsuario=DatosUsuario;
    }

    public static AbrirFormulario the(DatosUsuario DatosUsuario) {
        return Tasks.instrumented(AbrirFormulario.class,DatosUsuario);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(DatosUsuario.getUsser()).into(IngresarDatosLogin.INPUT_USER),
                Enter.theValue(DatosUsuario.getPassword()).into(IngresarDatosLogin.INPUT_PASSWORD),
                Click.on(IngresarDatosLogin.NEXT_BUTTON2)
        );
    }
}
