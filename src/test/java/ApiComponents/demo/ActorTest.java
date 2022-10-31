package ApiComponents.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ActorTest {
    Actor testActor = new Actor("firstName", "lastName");

    @Test
    public void testGetMyFirstName(){
        Assertions.assertEquals("firstName", testActor.getActorFirstName(), "The actor firstName is not correct");

    }

    @Test
    public void testGetMyLastName(){
        Assertions.assertEquals("lastName", testActor.getActorLastName(), "The actor lastName is not correct");
    }
}
