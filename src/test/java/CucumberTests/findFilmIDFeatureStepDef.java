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

public class findFilmIDFeatureStepDef {
    @Autowired
    private FilmRepo filmRepo;

    @Autowired
    private ActorRepo actorRepo;

    @Autowired
    SakilaProjectApplication testSakalia = new SakilaProjectApplication(actorRepo, filmRepo);


    int byFilmID;

    Film output;

    @Before
    public void init(){
        byFilmID = 0;
        output = new Film();
    }

    @Given("a user wants to select a certain film")
    public void aUserWantsToSelectACertainFilm() {
        byFilmID = 5;
    }

    @When("a user selects a film id to view")
    public void aUserSelectsAFilmIdToView() {
        output = testSakalia.getByFilmID(byFilmID);
    }

    @Then("the program selects the view")
    public void theProgramSelectsTheView() {
        Assertions.assertEquals(5, output.getFilmID(), "result is wrong");
    }
}
