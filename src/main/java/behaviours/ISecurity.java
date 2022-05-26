package behaviours;
import people.Visitor;
public interface ISecurity {
    boolean isAllowedToUse(Visitor visitor);
}
