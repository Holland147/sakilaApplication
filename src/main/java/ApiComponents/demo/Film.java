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

    //constructor

    public Film(String setTitle, String setDescription){
        this.myTitle = setTitle;
        this.myDescription = setDescription;
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





}
