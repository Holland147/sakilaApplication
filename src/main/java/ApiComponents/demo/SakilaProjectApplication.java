package ApiComponents.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.ResourceAccessException;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@RestController
@RequestMapping("/home")
@CrossOrigin
public class SakilaProjectApplication {
	@Autowired
	private FilmRepo filmRepo;

	private ActorRepo actorRepo;


	public SakilaProjectApplication(ActorRepo myActorRepo, FilmRepo myFilmRepo){
		this.actorRepo = myActorRepo;
		this.filmRepo = myFilmRepo;
	}



	public static void main(String[] args) {
		SpringApplication.run(SakilaProjectApplication.class, args);
	}

	@GetMapping("/allActors")
	public @ResponseBody
	Iterable<Actor> getAllActors(){
		return actorRepo.findAll();
	}



	@GetMapping("/allFilms")
	public @ResponseBody
	Iterable<Film> getAllFilms(){
		return filmRepo.findAll();
	}




	@PutMapping("/allActors/{id}")
	public ResponseEntity<Actor> updateActor(@PathVariable(value = "id") int ID, @RequestBody Actor actorDetails){
		Actor updateActor = actorRepo.findById(ID).orElseThrow(()->new ResourceAccessException("actor not found" + ID));


		updateActor.setActorFirstName(actorDetails.getActorFirstName());

		updateActor.setActorLastName(actorDetails.getActorLastName());


		final Actor updatedActor =  actorRepo.save(updateActor);

		return ResponseEntity.ok(updatedActor);
	}

	@PostMapping("/addActors")
	public Actor createEmployee (@Validated @RequestBody Actor actor) {
		return actorRepo.save(actor);
	}

	@DeleteMapping("/deleteActors/{id}")
	public Map<String, Boolean> deleteActor(@PathVariable(value = "id") int id)
			throws ResourceAccessException   {
		Actor actor = actorRepo.findById(id)
				.orElseThrow(() -> new ResourceAccessException("Employee not found for this id :: " + id));

		actorRepo.delete(actor);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}




}

