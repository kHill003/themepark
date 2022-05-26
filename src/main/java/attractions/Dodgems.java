package attractions;

import people.Visitor;

public class Dodgems extends Attraction {

    public Dodgems(String name, int rating) {
        super(name, rating);
    }

    public double defaultPrice() {
        return 2.80;
    }

    public double priceFor(Visitor visitor) {
        double adjust = defaultPrice() / 2;
        int age = visitor.getAage();
        if (age > 12) {
        }
        return adjust;
    }
}
