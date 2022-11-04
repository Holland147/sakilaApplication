package ApiComponents.demo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name="actor")
public class Actor {
    //Attributes
    @Id
    @Column(name = "actor_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int actorID;

    @Column(name = "first_name")
    String actorFirstName;

    @Column(name = "last_name")
    String actorLastName;

    @ManyToMany
    @JoinTable(name = "film_actor",
            joinColumns = @JoinColumn(name = "actor_id"),
            inverseJoinColumns = @JoinColumn(name = "film_id"))
    @JsonIgnore
    Collection<Film> films;

    //Constructor
    public Actor(int myID,String myFirstName, String myLastName, Collection<Film> films){
        this.actorFirstName = myFirstName;
        this.actorLastName = myLastName;
        this.actorID = myID;
        this.films = films;

    }

    public Actor(){
        setActorFirstName(actorLastName);
    }

    //Methods
    public String getActorFirstName(){
        return actorFirstName;
    }

    public void setActorFirstName(String myFirstName){
        actorFirstName = myFirstName;
    }

    public String getActorLastName(){
        return actorLastName;
    }

    public void setActorLastName(String myLastName){
        actorLastName = myLastName;
    }

    public int getActorID(){
        return actorID;
    }

    public void setActorID(int myID){
        actorID = myID;
    }

    public Collection<Film> getFilms() { return films; }




}
