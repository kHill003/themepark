package attractions;

import behaviours.ISecurity;
import people.Visitor;

public class Playground extends Attraction implements ISecurity {


    public Playground(String name, int rating) {
        super(name, rating);
    }




    public boolean isAllowedToUse(Visitor visitor) {
        return visitor.getAage() <= 15;
    }
}
