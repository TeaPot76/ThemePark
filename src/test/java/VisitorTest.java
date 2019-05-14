import People.Visitor;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class VisitorTest {

    private Visitor visitor;

    @Before
    public void before() {
        visitor = new Visitor("Edwin", 20, 198, 250);
    }

    @Test
    public void hasName() {
        assertEquals("Edwin", visitor.getName());
    }

    @Test
    public void hasHeight() {
        assertEquals(198.0, visitor.getHeight());
    }

    @Test
    public void hasAge() {
        assertEquals(20, visitor.getAge());
    }

    @Test
    public void hasMoney() {
        assertEquals(250.0, visitor.getMoney());
    }

    @Test
    public void setName() {
        visitor.setName("Bill");
        assertEquals("Bill", visitor.getName());
    }

    @Test
    public void setAge() {
        visitor.setAge(22);
        assertEquals(22, visitor.getAge());
    }

    @Test
    public void setVisitorHeight() {
        visitor.setHeight(197.0);
        assertEquals(197.0, visitor.getHeight());
    }

    @Test
    public void setVisitorMoney() {
        visitor.setMoney(355.0);
        assertEquals(355.0, visitor.getMoney());
    }
}

