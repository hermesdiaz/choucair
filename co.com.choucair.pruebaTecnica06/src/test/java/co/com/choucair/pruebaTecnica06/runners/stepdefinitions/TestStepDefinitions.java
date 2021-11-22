package co.com.choucair.pruebaTecnica06.runners.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.DatosUsuario;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.AbrirFormulario;
import tasks.AbrirPagina;
import userinterface.IngresarDatosLogin;

import static net.serenitybdd.screenplay.actors.OnStage.*;
import java.util.List;

public class TestStepDefinitions {
    @Before
    public void setStage() {
        setTheStage(new OnlineCast());
    }

    @Given("^un usuario ingresa un nombre de usuario en el campo usuario and que ha introducido un password en el campo contrasena$")
    public void unUsuarioIngresaUnNombreDeUsuarioEnElCampoUsuarioAndQueHaIntroducidoUnPasswordEnElCampoContrasena() throws Exception {
        theActorCalled("usuario").wasAbleTo(AbrirPagina.thePage()
                );

    }


    @When("^se hace click en el boton$")
    public void seHaceClickEnElBoton(List<DatosUsuario> DatosUsuario) throws Exception {
        theActorInTheSpotlight().attemptsTo(
                AbrirFormulario.the(DatosUsuario.get(0))



        );
    }

    @Then("^deberia cargarse la pagina$")
    public void deberiaCargarseLaPagina() throws Exception{

    }


}
