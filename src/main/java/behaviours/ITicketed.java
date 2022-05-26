package behaviours;

import people.Visitor;

public interface ITicketed {

    double DefaultPrice();
    double priceForVisitor(Visitor visitor);
}
