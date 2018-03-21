package soldier.core;

public class HorseMan extends UnitSimple{
	
	public HorseMan() {
		super(new LogPowBehavior(20, 10, 50, "Horse Man"));
	}

}
