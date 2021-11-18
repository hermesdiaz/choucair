package co.com.choucair.certification.pruebaTecnica.stepdefinitions;

import co.com.choucair.certification.pruebaTecnica.model.AcademyChoucairData;
import co.com.choucair.certification.pruebaTecnica.tasks.*;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;


import static net.serenitybdd.screenplay.actors.OnStage.*;

public class ChoucairuTestStepDefinitions {
    @Before
    public void setStage() {
        setTheStage(new OnlineCast());
    }

    @Given("^a web browser on the uTest page$")
    public void aWebBrowserOnTheUTestPage() throws Exception{
        theActorCalled("usuario").wasAbleTo(OpenUp.thePage(),
                OpenSingUpForm.OnThePage());

    }

    @When("^you click on the Joid Today option and the information is filled out$")
    public void youClickOnTheJoidTodayOptionAndTheInformationIsFilledOut(List<AcademyChoucairData> AcademyChoucairData) {
        theActorInTheSpotlight().attemptsTo(
                OpenPersonalForm.the(AcademyChoucairData.get(0)),
                OpenDeviceForm.the(AcademyChoucairData.get(0)),
                OpenPasswordForm.the(AcademyChoucairData.get(0))
      );

    }

    @Then("^a new user account must be created$")
    public void aNewUserAccountMustBeCreated () throws Exception {

    }
}
