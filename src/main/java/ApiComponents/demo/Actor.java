package ApiComponents.demo;

import javax.persistence.*;

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



    //Constructor
    public Actor(int myID,String myFirstName, String myLastName){
        this.actorFirstName = myFirstName;
        this.actorLastName = myLastName;
        this.actorID = myID;

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

}
