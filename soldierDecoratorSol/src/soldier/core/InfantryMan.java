package soldier.core;

public class InfantryMan extends UnitSimple {
	public InfantryMan() {
		super(new ConstBehavior(10, 5, 50, "Infantry Man"));
	}
}
