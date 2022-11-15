package ApiComponents.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
 class ActorTest {
    Collection<Film> films = new ArrayList<>();
    Actor testActor = new Actor(1,"firstName", "lastName",films);

    @Test
     void testGetMyID(){
        Assertions.assertEquals(1, testActor.getActorID(), "The ID is not correct");
    }

    @Test
     void testGetMyFirstName(){
        Assertions.assertEquals("firstName", testActor.getActorFirstName(), "The actor firstName is not correct");

    }

    @Test
     void testGetMyLastName(){
        Assertions.assertEquals("lastName", testActor.getActorLastName(), "The actor lastName is not correct");
    }

    @Test
     void testSetMyFirstName(){
        Assertions.assertEquals("firstName", testActor.getActorFirstName(), "actor firstName Wrong");
        testActor.setActorFirstName("bob");
        Assertions.assertEquals("bob", testActor.getActorFirstName(), "actor firstName Wrong");

    }

    @Test
     void testSetMyLastName(){
        Assertions.assertEquals("lastName", testActor.getActorLastName(), "actor LastName Wrong");
        testActor.setActorLastName("bob");
        Assertions.assertEquals("bob", testActor.getActorLastName(), "actor LastName Wrong");

    }

    @Test
     void testSetMyID(){
        Assertions.assertEquals(1, testActor.getActorID(), "actor firstName Wrong");
        testActor.setActorID(2);
        Assertions.assertEquals(2, testActor.getActorID(), "actor firstName Wrong");

    }


}
