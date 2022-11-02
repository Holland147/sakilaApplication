package ApiComponents.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmActorRepo extends JpaRepository<FilmActor, Integer> {
}
