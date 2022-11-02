package ApiComponents.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ActorTest {
    Actor testActor = new Actor(1,"firstName", "lastName");

    @Test
    public void testGetMyID(){
        Assertions.assertEquals(1, testActor.getActorID(), "The ID is not correct");
    }

    @Test
    public void testGetMyFirstName(){
        Assertions.assertEquals("firstName", testActor.getActorFirstName(), "The actor firstName is not correct");

    }

    @Test
    public void testGetMyLastName(){
        Assertions.assertEquals("lastName", testActor.getActorLastName(), "The actor lastName is not correct");
    }

    @Test
    public void testSetMyFirstName(){
        Assertions.assertEquals("firstName", testActor.getActorFirstName(), "actor firstName Wrong");
        testActor.setActorFirstName("bob");
        Assertions.assertEquals("bob", testActor.getActorFirstName(), "actor firstName Wrong");

    }

    @Test
    public void testSetMyLastName(){
        Assertions.assertEquals("lastName", testActor.getActorLastName(), "actor LastName Wrong");
        testActor.setActorLastName("bob");
        Assertions.assertEquals("bob", testActor.getActorLastName(), "actor LastName Wrong");

    }

    @Test
    public void testSetMyID(){
        Assertions.assertEquals(1, testActor.getActorID(), "actor firstName Wrong");
        testActor.setActorID(2);
        Assertions.assertEquals(2, testActor.getActorID(), "actor firstName Wrong");

    }


}
