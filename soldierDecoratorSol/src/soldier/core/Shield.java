package soldier.core;

public class Shield implements Equipment{
	public Shield() {
		
	}

	public BehaviorExtension createEquipment(BehaviorSoldier s) {
		return new StdExtension(s.strike(), 10, s);
	}
	
	
}
