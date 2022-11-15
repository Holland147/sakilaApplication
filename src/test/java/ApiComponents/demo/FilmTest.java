package ApiComponents.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;

 class FilmTest {
    Collection<Actor> actors = new ArrayList<>();

    Film testFilm = new Film(1,"Title","Desc",1,"PG",actors);

    @Test
    void testActor(){
        Film testFilm = new Film();
        Assertions.assertNotNull(testFilm);
    }

    //Test getters
    @Test
    void testGetFilmID(){
        Assertions.assertEquals(1, testFilm.getFilmID(), "Film ID was not correct");
    }

    @Test
    void testGetTitle(){
        Assertions.assertEquals("Title", testFilm.getMyTitle(), "Title Incorrect");
    }

    @Test
    void testGetDescription(){
        Assertions.assertEquals("Desc", testFilm.getMyDescription(), "Incorrect description");
    }

    @Test
    void testGetRentalDuration(){
        Assertions.assertEquals(1, testFilm.getMyRentalDescription(), "Incorrect rental duration");
    }

    @Test
    void testGetRating(){
        Assertions.assertEquals("PG", testFilm.getMyRating(), "Incorrect rating");
    }

    //test setters
    @Test
    void testSetID(){
        Assertions.assertEquals(1, testFilm.getFilmID(), "Film ID incorrect");
        testFilm.setFilmID(2);
        Assertions.assertEquals(2, testFilm.getFilmID(), "Film ID incorrect");
    }

    @Test
    void  testSetTitle(){
        Assertions.assertEquals("Title", testFilm.getMyTitle(), "Incorrect title");
        testFilm.setMyTitle("Change");
        Assertions.assertEquals("Change", testFilm.getMyTitle(), "Incorrect title");
    }

    @Test
    void testSetDescription(){
        Assertions.assertEquals("Desc", testFilm.getMyDescription(), "Incorrect Description");
        testFilm.setMyDescription("Changed");
        Assertions.assertEquals("Changed", testFilm.getMyDescription(), "Incorrect Description");
    }
    @Test
    void testSetRentalDuration(){
        Assertions.assertEquals(1, testFilm.getMyRentalDescription(), "Rental Duration");
        testFilm.setMyRentalDescription(2);
        Assertions.assertEquals(2, testFilm.getMyRentalDescription());
    }

    @Test
    void testSetRating(){
        Assertions.assertEquals("PG", testFilm.getMyRating(), "Film rating incorrect");
        testFilm.setMyRating("R");
        Assertions.assertEquals("R", testFilm.getMyRating(), "Film rating incorrect");
    }


}
