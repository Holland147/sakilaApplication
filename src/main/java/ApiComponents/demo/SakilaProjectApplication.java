package ApiComponents.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.ResourceAccessException;

import java.util.*;

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

	@GetMapping("/filmsByActor")
	public List<Film> getFilmsByActor(){
		return filmRepo.getFilmByID();
	}

	@GetMapping("/alabama")
	public Film getAlabama(){
		return filmRepo.getAlabama();
	}

	@GetMapping("/singleActor/{id}")
	public Actor getSingleActor(@PathVariable(value = "id") int actorID){
		return actorRepo.findById(actorID).orElseThrow(() -> new ResourceAccessException("Actor not found" + actorID));
	}

	@GetMapping("/setByFilmID/{film_id}")
	public  Film getByFilmID(@PathVariable(value = "film_id") int film_id){
		return filmRepo.getFirstFilm(film_id);
	}

	@GetMapping("/selectFilmByTitle/{Title}")
	public Film getFilmByTitle(@PathVariable(value = "Title") String Title){
		return filmRepo.getFilmByTitle(Title);
	}

	@GetMapping("/randomFilm/{num}")
	public List<Film> getRandomFilmGet(@PathVariable(value = "num") int num){
		return filmRepo.getRandomFilm(num);
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

	@GetMapping("/filmActorLastName/{myName}")
	public @ResponseBody
	ArrayList<Film> getFilmByActorFirstName(@PathVariable(value = "myName") String name){
		return filmRepo.findByActorFirstName(name);
	}






}

