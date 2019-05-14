package themepark;

import park.*;

import java.util.ArrayList;
import java.util.List;

public class ThemePark {
    private String name;


    private CandyFlossStall candyFlossStall;
    private Dodgem dodgem;
    private IceCreamStall iceCreamStall;
    private Park park;
    private Playground playground;
    private Rollercoster rollercoster;
    private TobaccoStall tobaccoStall;

    public ThemePark(String name, CandyFlossStall candyFlossStall, Dodgem dodgem, IceCreamStall iceCreamStall, Park park,
                     Playground playground, Rollercoster rollercoster, TobaccoStall tobaccoStall) {
        this.name = name;
        this.candyFlossStall = candyFlossStall;
        this.dodgem = dodgem;
        this.iceCreamStall = iceCreamStall;
        this.park = park;
        this.playground = playground;
        this.rollercoster = rollercoster;
        this.tobaccoStall = tobaccoStall;
    }

    public List<IReviewed> getAllReviewed(){
        List<IReviewed> allReviewed = new ArrayList<>();
        allReviewed.add(candyFlossStall);
        allReviewed.add(dodgem);
        allReviewed.add(iceCreamStall);
        allReviewed.add(park);
        allReviewed.add(playground);
        allReviewed.add(rollercoster);
        allReviewed.add(tobaccoStall);
        return allReviewed;
    }
}
