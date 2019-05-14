package park;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class IceCreamStallTest {

    private IceCreamStall iceCreamStall;

    @Before
    public void before() {
        iceCreamStall = new IceCreamStall("BestIceCream", "Dan", 12);
    }


    @Test
    public void hasName() {
        assertEquals("BestIceCream", iceCreamStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Dan", iceCreamStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(12, iceCreamStall.getParkingSpot());
    }

    @Test
    public void setName() {
        iceCreamStall.setName("Bill's");
        assertEquals("Bill's", iceCreamStall.getName());
    }

    @Test
    public void setVisitorHeight() {
        iceCreamStall.setOwnerName("Don");
        assertEquals("Don", iceCreamStall.getOwnerName());

    }

    @Test
    public void setVisitorMoney() {
        iceCreamStall.setParkingSpot(10);
        assertEquals(10, iceCreamStall.getParkingSpot());
    }
}