package questions;

import model.DatosUsuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static userinterface.IngresarReunion.CREATED_MEETING_NAME_DIV;
import static userinterface.IngresarReunion.SELECCIONAR_ERROR;

public class ErrorNombreReunion implements Question<Boolean> {

    private DatosUsuario data;

    public ErrorNombreReunion(DatosUsuario data) {
        this.data = data;
    }

    public static ErrorNombreReunion severificaelerror (DatosUsuario data){
        return new ErrorNombreReunion(data);
    }


    @Override
    public Boolean answeredBy(Actor actor) {
        String nombreError = Text.of(SELECCIONAR_ERROR).viewedBy(actor).asString();
        String nombreesperadoerror = "This field is required.";
        System.out.println(nombreError);
        System.out.println(nombreesperadoerror);
        return nombreError.equals(nombreesperadoerror);
    }
}
