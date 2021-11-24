package co.com.choucair.pruebaTecnica06.runners.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.DatosUsuario;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.AbrirFormulario;
import tasks.AbrirPagina;
import tasks.CrearUnidad;
import userinterface.IngresarDatosLogin;

import static net.serenitybdd.screenplay.actors.OnStage.*;
import java.util.List;

public class TestStepDefinitions {
    @Before
    public void setStage() {
        setTheStage(new OnlineCast());
    }

    @Given("^un usuario se ha loggeado con la credenciales correctas$")
    public void unUsuarioSeHaLoggeadoConLaCredencialesCorrectas() throws Exception {
        theActorCalled("usuario").wasAbleTo(AbrirPagina.thePage()

                );

    }

    @When("^se crea una nueva unidad y se se asigna a una nueva reunion$")
    public void seCreaUnaNuevaUnidadYSeSeAsignaAUnaNuevaReunion(List<DatosUsuario> DatosUsuario) throws Exception {
        theActorInTheSpotlight().attemptsTo( AbrirFormulario.the(DatosUsuario.get(0)),
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
                CrearUnidad.crearunidadcondatos(DatosUsuario.get(0)),
                CrearReunion.crearreunioncondatos(DatosUsuario.get(0))
=======
                CrearUnidad.the(DatosUsuario.get(0))
>>>>>>> parent of 117a8eb (Ejercicio finalizado)
=======
                CrearUnidad.the(DatosUsuario.get(0)),
                CrearReunion.the(DatosUsuario.get(0))
>>>>>>> parent of 5d9a0ec (Proyecto .bad)
=======
                CrearUnidad.the(DatosUsuario.get(0))
>>>>>>> parent of 117a8eb (Ejercicio finalizado)
=======
                CrearUnidad.the(DatosUsuario.get(0))
>>>>>>> parent of 117a8eb (Ejercicio finalizado)
=======
                CrearUnidad.the(DatosUsuario.get(0))
>>>>>>> parent of 117a8eb (Ejercicio finalizado)
        );

    }

    @Then("^se deberia crear una reunion nueva$")
    public void seDeberiaCrearUnaReunionNueva() throws Exception{

    }


}
