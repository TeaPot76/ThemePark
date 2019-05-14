package park;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CandyFlossStallTest {

    private CandyFlossStall candyFlossStall;

    @Before
    public void before() {
        candyFlossStall = new CandyFlossStall("BestFloss", "Dan", 12);
    }


    @Test
    public void hasName() {
        assertEquals("BestFloss", candyFlossStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Dan", candyFlossStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(12, candyFlossStall.getParkingSpot());
    }

    @Test
    public void setName() {
        candyFlossStall.setName("Bill's");
        assertEquals("Bill's", candyFlossStall.getName());
    }

    @Test
    public void setVisitorHeight() {
        candyFlossStall.setOwnerName("Don");
        assertEquals("Don", candyFlossStall.getOwnerName());

    }

    @Test
    public void setVisitorMoney() {
        candyFlossStall.setParkingSpot(10);
        assertEquals(10, candyFlossStall.getParkingSpot());
    }
}