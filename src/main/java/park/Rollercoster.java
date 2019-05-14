package park;

import People.Visitor;

public class Rollercoster extends Atraction {

    public Rollercoster(String name){
        super(name);
    }

    public boolean isAllowedTo(Visitor visitor) {
        return visitor.getAge() >= 12 && visitor.getHeight() >=145;
    }
}
