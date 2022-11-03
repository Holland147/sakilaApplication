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

    public Film(int setFilmID, String setTitle, String setDescription, int setRentalDuration){
        this.filmID = setFilmID;
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





}
