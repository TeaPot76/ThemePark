package park;

import People.Visitor;

public interface ISecurity {
    boolean isAllowedTo(Visitor Visitor);
}
