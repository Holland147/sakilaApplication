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

public class findFilmByTitleFeatureStepDef {

    @Autowired
    private FilmRepo filmRepo;

    @Autowired
    private ActorRepo actorRepo;

    @Autowired
    SakilaProjectApplication testSakalia = new SakilaProjectApplication(actorRepo, filmRepo);

    String Title;

    Film output;


    @Before
    public void init(){
        Title = "";
        output = new Film();
    }

    @Given("a user wants to select a certain film by searching for the title")
    public void a_user_wants_to_select_a_certain_film_by_searching_for_the_title() {
        Title = "BULL SHAWSHANK";
    }
    @When("a user inputs a title")
    public void a_user_inputs_a_title() {
        output = testSakalia.getFilmByTitle(Title);
    }
    @Then("the program selects the title that the user has implemented")
    public void the_program_selects_the_title_that_the_user_has_implemented() {
        Assertions.assertEquals("BULL SHAWSHANK", output.getMyTitle(), "Error");
    }
}
