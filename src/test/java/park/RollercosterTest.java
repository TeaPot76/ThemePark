package park;

import People.Visitor;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RollercosterTest {
    private Rollercoster rollercoster;

    @Before
    public void before() {
        rollercoster = new Rollercoster("OMG");
    }

    @Test
    public void hasName() {
        assertEquals("OMG", rollercoster.getName());
    }

    @Test
    public void setName() {
        rollercoster.setName("BigBang");
        assertEquals("BigBang", rollercoster.getName());
    }


    @Test
    public void visitorIsAllowedTo() {
        Visitor visitor = new Visitor("Dan", 14, 150, 250);
        assertEquals(true, rollercoster.isAllowedTo(visitor));

    }

    @Test
    public void visitorIsNotAllowedTo() {
        Visitor visitor = new Visitor("Dan", 10, 150, 250);
        assertEquals(false, rollercoster.isAllowedTo(visitor));

    }
    @Test
    public void hasDefaultPrice(){
        assertEquals(8.40, rollercoster.defaultPrice());
    }
    @Test
    public void hasDoublePrice(){
        Visitor visitor = new Visitor("Dan", 2, 200, 240);
        assertEquals(16.80, rollercoster.priceFor(visitor));
    }
}
