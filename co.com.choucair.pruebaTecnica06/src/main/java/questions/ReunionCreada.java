package questions;
import model.DatosUsuario;
import model.DatosUsuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userinterface.IngresarReunion;

import java.util.List;

import static userinterface.IngresarReunion.*;
import static userinterface.WelcomePage.WELCOME_MESSAGE;

public class ReunionCreada implements Question<Boolean> {

    private DatosUsuario data;

        public ReunionCreada(DatosUsuario data) {
            this.data = data;
        }

        public static ReunionCreada secreareunion (DatosUsuario data){
            return new ReunionCreada(data);
        }



        @Override
        public Boolean answeredBy(Actor actor) {
            actor.attemptsTo(Click.on(ORDER_BY_ID_BUTTON)
            );
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            String nombreReunion = Text.of(CREATED_MEETING_NAME_DIV).viewedBy(actor).asString();
            String nombreesperadoReunion = data.getNombrereunionesperado();
            System.out.println(nombreReunion);
            System.out.println(nombreesperadoReunion);
            return nombreesperadoReunion.equals(nombreesperadoReunion);

        }

}
