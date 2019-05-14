package park;

import People.Visitor;

public class Playground extends Atraction implements ISecurity {

    public Playground(String name) {
        super(name);
    }

    public boolean isAllowedTo(Visitor visitor) {
        return visitor.getAge() >= 15;
    }
}
