package co.com.choucair.certification.pruebaTecnica.stepdefinitions;

import co.com.choucair.certification.pruebaTecnica.model.AcademyChoucairData;
import co.com.choucair.certification.pruebaTecnica.tasks.Jointoday;
import co.com.choucair.certification.pruebaTecnica.tasks.OpenUp;
import co.com.choucair.certification.pruebaTecnica.tasks.StepOne;

import co.com.choucair.certification.pruebaTecnica.userinterface.ChoucairStepOne;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class ChoucairuTestStepDefinitions {
    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^a web browser on the uTest page$")
    public void aWebBrowserOnTheUTestPage() throws Exception{
        OnStage.theActorCalled("usuario").wasAbleTo(OpenUp.thePage(),
                Jointoday.OnThePage());

    }

    @When("^you click on the Joid Today option and the information is filled out$")
    public void youClickOnTheJoidTodayOptionAndTheInformationIsFilledOut(List<AcademyChoucairData> AcademyChoucairData) {
        OnStage.theActorInTheSpotlight().attemptsTo(StepOne.the(AcademyChoucairData.get(0).getStrNombre(),
        AcademyChoucairData.get(0).getStrApellido(),
        AcademyChoucairData.get(0).getStrEmail(),
        AcademyChoucairData.get(0).getStrMes(),
        AcademyChoucairData.get(0).getStrDia(),
        AcademyChoucairData.get(0).getStrAno(),
        AcademyChoucairData.get(0).getCiudad(),
        AcademyChoucairData.get(0).getCodigopostal(),
        AcademyChoucairData.get(0).getPais(),
        AcademyChoucairData.get(0).getStrComputer(),
        AcademyChoucairData.get(0).getStrVersion(),
        AcademyChoucairData.get(0).getStrLanguagePc(),
        AcademyChoucairData.get(0).getStrMobileDevice(),
        AcademyChoucairData.get(0).getStrModel(),
        AcademyChoucairData.get(0).getStrOS(),
        AcademyChoucairData.get(0).getStrPassword()


      ));

    }

    @Then("^a new user account must be created$")
    public void aNewUserAccountMustBeCreated () throws Exception {

    }
}
