package ApiComponents.demo;

import javax.persistence.*;

@Entity
@Table(name="film_actor")
public class FilmActor {
    @Id
    @Column(name = "actor_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int catActorID;


    @Column(name = "film_id")
    int categoryFilmID;



    public FilmActor(int setCatActorID, int setCatFilmID){
        this.catActorID = setCatActorID;
        this.categoryFilmID = setCatFilmID;
    }

    public FilmActor(){

    }

    public int getCatActorID(){
        return catActorID;
    }

    public int getCatFilmID(){
        return categoryFilmID;
    }

}
