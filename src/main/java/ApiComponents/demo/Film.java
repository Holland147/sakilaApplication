package ApiComponents.demo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name="film")
public class Film {
    @Id
    @Column(name = "film_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int filmID;


    @Column(name = "title")
    String myTitle;

    @Column(name = "description")
    String myDescription;

    @Column(name = "rental_duration")
    int myRentalDescription;


    @ManyToMany
    @JoinTable(name = "film_actor",
            joinColumns = @JoinColumn(name = "film_id"),
            inverseJoinColumns = @JoinColumn(name = "actor_id"))
    @JsonIgnore
    Collection<Actor> actors;

    //constructor

    public Film(int setFilmID, String setTitle, String setDescription, int setRentalDuration, Collection<Actor> actors){
        this.filmID = setFilmID;
        this.myTitle = setTitle;
        this.myDescription = setDescription;
        this.myRentalDescription = setRentalDuration;
        this.actors = actors;
    }

    public Film(){

    }

    //methods
    public int getFilmID(){
        return filmID;
    }



    public void setFilmID(int setFilmID) {
        filmID = setFilmID;
    }

    public String getMyTitle(){
        return myTitle;
    }

    public void setMyTitle(String setTitle){
        myTitle = setTitle;
    }

    public String getMyDescription(){
        return myDescription;
    }

    public void setMyDescription(String setDescription){
        myDescription = setDescription;
    }

    public int getMyRentalDescription(){return myRentalDescription;}

    public void setMyRentalDescription(int setRentalDuration){
        myRentalDescription = setRentalDuration;
    }

    public Collection<Actor> getActors() { return actors; }
    public void setActor(Collection<Actor> actors) { this.actors = actors; }





}
