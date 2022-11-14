package ApiComponents.demo;

import javax.persistence.*;

@Entity
@Table(name="film_actor")
public class FilmActor {
    @Id
    @Column(name = "actor_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int filmActorID;


    @Column(name = "film_id")
    int actorFilmID;



    public FilmActor(int setCatActorID, int setCatFilmID){
        this.filmActorID = setCatActorID;
        this.actorFilmID = setCatFilmID;
    }

    public FilmActor(){

    }

    public int getCatActorID(){
        return filmActorID;
    }

    public int getCatFilmID(){
        return actorFilmID;
    }

}
