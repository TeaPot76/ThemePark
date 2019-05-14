package park;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ParkTest {

    private Park park;

    @Before
    public void before() {
        park = new Park("GreenPark");
    }

    @Test
    public void hasName() {
        assertEquals("GreenPark", park.getName());
    }

    @Test
    public void setName() {
        park.setName("Big");
        assertEquals("Big", park.getName());
    }


}
