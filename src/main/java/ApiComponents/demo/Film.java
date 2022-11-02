package ApiComponents.demo;

import javax.persistence.*;

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

    //constructor

    public Film(String setTitle, String setDescription, int setRentalDuration){
        this.myTitle = setTitle;
        this.myDescription = setDescription;
        this.myRentalDescription = setRentalDuration;
    }

    public Film(){

    }

    //methods
    public int getFilmID(){
        return filmID;
    }

    public String getMyTitle(){
        return myTitle;
    }

    public String getMyDescription(){
        return myDescription;
    }

    public int getMyRentalDescription(){return myRentalDescription;}





}
