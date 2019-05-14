package park;

import People.Visitor;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PlaygroundTest {

    private Playground playground;

    @Before
    public void before(){
        playground= new Playground("HappyPlace");
}
    @Test
    public void hasName(){
        assertEquals("HappyPlace", playground.getName());
    }
    @Test
    public void setName(){
        playground.setName("Big");
        assertEquals("Big", playground.getName());
    }

    @Test
    public void visitorIsAllowedTo(){
        Visitor visitor = new Visitor("Dan", 23, 189, 250);
        assertEquals(true, playground.isAllowedTo(visitor));
    }


}
