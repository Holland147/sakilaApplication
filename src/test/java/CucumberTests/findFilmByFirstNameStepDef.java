package CucumberTests;

import ApiComponents.demo.ActorRepo;
import ApiComponents.demo.Film;
import ApiComponents.demo.FilmRepo;
import ApiComponents.demo.SakilaProjectApplication;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class findFilmByFirstNameStepDef {
    ArrayList<Film> firstNameList;
    @Autowired
    private FilmRepo filmRepo;

    @Autowired
    private ActorRepo actorRepo;

    @Autowired
    SakilaProjectApplication testSakalia = new SakilaProjectApplication(actorRepo, filmRepo);

    String firstName;

    List <Film> output;

    @Before
    public void init(){
        firstName = "";

    }

    @Given("the user wants to find a film by an actors first name")
    public void theUserWantsToFindAFilmByAnActorsFirstName() {
        firstName = "NICK";
    }

    @When("the user inputs an actors first name")
    public void theUserInputsAnActorsFirstName() {
        firstNameList = testSakalia.getFilmByActorFirstName(firstName);
    }

    @Then("The program provides a list of films that the actor first name is in")
    public void theProgramProvidesAListOfFilmsThatTheActorFirstNameIsIn() {
        Assertions.assertEquals(77, firstNameList.size(), "There was not 77 nicks");
    }
}
