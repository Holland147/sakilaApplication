package ApiComponents.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.ArrayList;
import java.util.List;

public interface FilmRepo extends JpaRepository<Film, Integer> {
    @Query(nativeQuery = true, value = "SELECT * FROM film WHERE rental_duration <5")
    List<Film> getFilmByID();

    @Query(nativeQuery = true, value = "select * from film where title = \"ALABAMA DEVIL\"")
    Film getAlabama();

    @Query(nativeQuery = true, value = "select * from film where film_id = ?1")
    Film getFirstFilm(int film_id);

    @Query(nativeQuery = true, value = "select * from film Where Title = ?1")
    Film getFilmByTitle(String Title);

    @Query(nativeQuery = true, value = "SELECT * FROM film ORDER BY RAND() LIMIT 1;")
    List<Film> getRandomFilm();
}
