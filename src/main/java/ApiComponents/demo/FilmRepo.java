package ApiComponents.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FilmRepo extends JpaRepository<Film, Integer> {
    @Query(nativeQuery = true, value = "SELECT * FROM film WHERE rental_duration <5")
    List<Film> getFilmByID();
}
