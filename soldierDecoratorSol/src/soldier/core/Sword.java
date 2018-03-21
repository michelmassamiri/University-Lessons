package soldier.core;

public class Sword implements Equipment{
	public Sword() {
		
	}

	public BehaviorExtension createEquipment(BehaviorSoldier s) {
		return new StdExtension(s.strike() * 2, 0, s);
	}
	
	
}
