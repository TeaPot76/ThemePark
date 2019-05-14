import org.junit.Before;
import org.junit.Test;
import park.*;
import themepark.ThemePark;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class ThemeParkTest {
    private ThemePark themePark;
    private CandyFlossStall candyFlossStall;
    private Dodgem dodgem;
    private IceCreamStall iceCreamStall;
    private Park park;
    private Playground playground;
    private Rollercoster rollercoster;
    private TobaccoStall tobaccoStall;

    @Before
    public void before(){
        candyFlossStall = new CandyFlossStall("Good", "Dan", 12);
        iceCreamStall = new IceCreamStall("Good", "Dan", 12);
        tobaccoStall = new TobaccoStall("Good", "Dan", 12);
        dodgem = new Dodgem("Great");
        park = new Park("Great");
        playground = new Playground("Great");
        rollercoster = new Rollercoster("Great");
        themePark = new ThemePark("Escape", candyFlossStall, dodgem, iceCreamStall, park, playground, rollercoster, tobaccoStall);
    }
    @Test
    public void canGetAllReviewed(){
        List<IReviewed> expectedList = new ArrayList<>();
        expectedList.add(candyFlossStall);
        expectedList.add(dodgem);
        expectedList.add(iceCreamStall);
        expectedList.add(park);
        expectedList.add(playground);
        expectedList.add(rollercoster);
        expectedList.add(tobaccoStall);

        assertEquals(expectedList, themePark.getAllReviewed());
    }
}
