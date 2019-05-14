package park;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DodgemTest {

    private Dodgem dodgem;

    @Before
    public void before() {
        dodgem = new Dodgem("Small");
    }

    @Test
    public void hasName() {
        assertEquals("Small", dodgem.getName());
    }

    @Test
    public void setName() {
        dodgem.setName("Big");
        assertEquals("Big", dodgem.getName());
    }


}
