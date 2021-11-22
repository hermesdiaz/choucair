package tasks;

import model.DatosUsuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;
import userinterface.IngresarReunion;

import static net.serenitybdd.screenplay.actions.Click.*;

public class CrearReunion implements Task {
    private DatosUsuario DatosUsuario;

    public CrearReunion(DatosUsuario DatosUsuario){ this.DatosUsuario=DatosUsuario; }
    public static CrearReunion the(DatosUsuario DatosUsuario){
        return Tasks.instrumented(CrearReunion.class,DatosUsuario);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(IngresarReunion.SELECCIONAR_REUNION),
                Click.on(IngresarReunion.SELECCIONAR_REUNIONES),
                Click.on(IngresarReunion.CREAR_REUNION),
                Enter.theValue(DatosUsuario.getNombrereunion()).into(IngresarReunion.INGRESAR_NOMBRE_REUNION),

                Click.on(IngresarReunion.LOCALIZACION),
                Enter.theValue(DatosUsuario.getNombrelocalizacion()).into(IngresarReunion.LOCALIZACION_NOMBRE),
                Enter.theValue(DatosUsuario.getDireccionlocalizacion()).into(IngresarReunion.LOCALIZACION_DIRECCION),
                Click.on(IngresarReunion.LOCALIZACION_GUARDAR),

                Click.on(IngresarReunion.ORGANIZADO),
                Enter.theValue(DatosUsuario.getTituloorganizado()).into(IngresarReunion.ORGANIZADO_TITULO),
                Enter.theValue(DatosUsuario.getNombreorganizado()).into(IngresarReunion.ORGANIZADO_PRIMERNOMBRE),
                Enter.theValue(DatosUsuario.getSegundonombreorganizado()).into(IngresarReunion.ORGANIZADO_SEGUNDONOMBRE),
                Enter.theValue(DatosUsuario.getCorreo()).into(IngresarReunion.ORGANIZADO_CORREO),
                Enter.theValue(DatosUsuario.getDominio()).into(IngresarReunion.ORGANIZADO_CORREO_DOMINIO),
                Click.on(IngresarReunion.ORGANIZADO_GUARDAR),

                /*Click.on(IngresarReunion.ATENDIDO),
                Enter.theValue(DatosUsuario.getTituloatendido()).into(IngresarReunion.ATENDIDO_TITULO),
                Enter.theValue(DatosUsuario.getNombreatendido()).into(IngresarReunion.ATENDIDO_PRIMERNOMBRE),
                Enter.theValue(DatosUsuario.getSegundonombreatendido()).into(IngresarReunion.ATENDIDO_SEGUNDONOMBRE),
                Enter.theValue(DatosUsuario.getCorreo()).into(IngresarReunion.ATENDIDO_CORREO),
                Enter.theValue(DatosUsuario.getDominio()).into(IngresarReunion.ATENDIDO_CORREO_DOMINIO),
                Click.on(IngresarReunion.ATENDIDO_GUARDAR),
*/
                Enter.theValue(DatosUsuario.getNumerodereunion()).into(IngresarReunion.NUMERO_REUNION),

                Click.on(IngresarReunion.SELECCIONAR_UNIT),
                Enter.theValue(DatosUsuario.getBussinesName()).into(IngresarReunion.ESCRIBIR_UNIT).thenHit(Keys.ENTER),
                //Hit.the(Keys.ENTER).into(IngresarReunion.SELECCIONAR_UNIT),

                Click.on(IngresarReunion.REPORTERO),
                Enter.theValue(DatosUsuario.getTituloreportero()).into(IngresarReunion.REPORTERO_TITULO),
                Enter.theValue(DatosUsuario.getNombrereportero()).into(IngresarReunion.REPORTERO_PRIMERNOMBRE),
                Enter.theValue(DatosUsuario.getSegundonombrereportero()).into(IngresarReunion.REPORTERO_SEGUNDONOMBRE),
                Enter.theValue(DatosUsuario.getCorreo()).into(IngresarReunion.REPORTERO_CORREO),
                Enter.theValue(DatosUsuario.getDominio()).into(IngresarReunion.REPORTERO_CORREO_DOMINIO),
                Click.on(IngresarReunion.REPORTERO_GUARDAR),

                Click.on(IngresarReunion.GUARDAR_REUNION)




        );

    }
}
