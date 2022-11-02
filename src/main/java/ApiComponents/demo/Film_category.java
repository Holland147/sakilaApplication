package ApiComponents.demo;

import javax.persistence.*;

@Entity
@Table(name = "film_category")
public class Film_category {
    @Id
    @Column(name = "film_id")
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    int catFilmID;

    @Column(name = "category_id")
    int catCategory_id;



}
