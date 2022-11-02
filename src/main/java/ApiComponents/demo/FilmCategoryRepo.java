package ApiComponents.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmCategoryRepo extends JpaRepository<Film_category, Integer> {
}
