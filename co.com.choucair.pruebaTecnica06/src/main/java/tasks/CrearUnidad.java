package tasks;

import model.DatosUsuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;
import userinterface.IngresarUnidad;

public class CrearUnidad implements Task {
    private DatosUsuario DatosUsuario;

    public CrearUnidad(DatosUsuario DatosUsuario) {
        this.DatosUsuario = DatosUsuario;
    }

    public static CrearUnidad the(DatosUsuario DatosUsuario ) {
        return Tasks.instrumented(CrearUnidad.class,DatosUsuario);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Click.on(IngresarUnidad.SELECCIONAR_ORGANIZACION),
            Click.on(IngresarUnidad.SELECCIONAR_BUSSINES_INIT),
            Click.on(IngresarUnidad.CREAR_BUSSINES_INIT),

            Enter.theValue(DatosUsuario.getBussinesName()).into(IngresarUnidad.NOMBRE_BUSSINES_INIT),

            Click.on(IngresarUnidad.BOTON_CREAR)

    );
    }
}
