package attractions;

import people.Visitor;

public class RollerCoaster  extends Attraction {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    public boolean isAllowed(Visitor visitor) {
        return visitor.getHeight() >= 145 && visitor.getAage() > 12;
    }

    public double defaultPrice() {
        return 8.40;
    }

    public double priceFor(Visitor visitor) {
        double adjust = defaultPrice() * 2;
        int height = (int) visitor.getHeight();
        if (height < 200) {
        }
        return adjust;
    }
  }