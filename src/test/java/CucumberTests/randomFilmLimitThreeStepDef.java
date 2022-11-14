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

import java.util.List;

public class randomFilmLimitThreeStepDef {

    List<Film> randomFilms;
    @Autowired
    private FilmRepo filmRepo;

    @Autowired
    private ActorRepo actorRepo;

    @Autowired
    SakilaProjectApplication testSakalia = new SakilaProjectApplication(actorRepo, filmRepo);

    int numOfFilms;

    @Before
    public void init(){
        numOfFilms = 0;
    }

    @Given("the informs the program they want to generate the films")
    public void theInformsTheProgramTheyWantToGenerateTheFilms() {
        numOfFilms = 3;
    }

    @When("the user wants to generate three random films")
    public void theUserWantsToGenerateThreeRandomFilms() {
        randomFilms = testSakalia.getRandomFilmGet(numOfFilms);
    }

    @Then("generate three random films for the user")
    public void generateThreeRandomFilmsForTheUser() {
        Assertions.assertEquals(3, randomFilms.size(), "there were more than 3 films");
    }
}
