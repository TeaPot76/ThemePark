package park;

import People.Visitor;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TobaccoStallTest {

    private TobaccoStall tobaccoStall;

    @Before
    public void before() {
        tobaccoStall = new TobaccoStall("SureDeath", "Dan", 12);
    }


    @Test
    public void hasName() {
        assertEquals("SureDeath", tobaccoStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Dan", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(12, tobaccoStall.getParkingSpot());
    }

    @Test
    public void setName() {
        tobaccoStall.setName("Bill's");
        assertEquals("Bill's", tobaccoStall.getName());
    }

    @Test
    public void setVisitorHeight() {
        tobaccoStall.setOwnerName("Don");
        assertEquals("Don", tobaccoStall.getOwnerName());

    }

    @Test
    public void setVisitorMoney() {
        tobaccoStall.setParkingSpot(10);
        assertEquals(10, tobaccoStall.getParkingSpot());
    }

    @Test
    public void visitorIsAllowedTo() {
        Visitor visitor = new Visitor("Dan", 21, 189, 250);
        assertEquals(true, tobaccoStall.isAllowedTo(visitor));
    }

    @Test
    public void visitorIsNotAllowedTo() {
        Visitor visitor = new Visitor("Dan", 12, 189, 250);
        assertEquals(false, tobaccoStall.isAllowedTo(visitor));
    }
}