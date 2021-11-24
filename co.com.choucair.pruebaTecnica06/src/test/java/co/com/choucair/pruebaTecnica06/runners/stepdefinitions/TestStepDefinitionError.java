package co.com.choucair.pruebaTecnica06.runners.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.DatosUsuario;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.ErrorNombreReunion;
import questions.ReunionCreada;
import tasks.AbrirFormulario;
import tasks.AbrirPagina;
import tasks.CrearReunion;
import tasks.CrearUnidad;
import userinterface.IngresarDatosLogin;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import java.util.List;
public class TestStepDefinitionError {



    @Then("^deberia mostrar un error que dice This field is required\\.$")
    public void deberiaMostrarUnErrorQueDiceThisFieldIsRequired(List<DatosUsuario> DatosUsuario) throws Exception{
        theActorInTheSpotlight().should(seeThat(ErrorNombreReunion.severificaelerror(DatosUsuario.get(0))));
    }

}
