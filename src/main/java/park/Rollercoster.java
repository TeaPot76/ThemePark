package park;

import People.Visitor;

public class Rollercoster extends Atraction implements ITicketed {

    public Rollercoster(String name) {
        super(name);
    }

    public boolean isAllowedTo(Visitor visitor) {
        return visitor.getAge() >= 12 && visitor.getHeight() >= 145;
    }

    @Override
    public double defaultPrice() {
        return 8.40;
    }

    @Override
    public double priceFor(Visitor visitor) {
        if (visitor.getHeight()>=200){
            return defaultPrice()*2;
        } else {
            return defaultPrice();
        }
    }
}
