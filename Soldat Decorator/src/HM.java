
public class HM implements Soldat {
	
	private int health;
	
	public HM() {
		health = 50;
	}
	
	public int strike() {
		return 7;
	}
	
	public void parry(int f) {
		health -= f/4;
	}
	
	public boolean isAlive() {
		if(health > 0)
			return true;
		return false;
	}
	
	public int getHealth() {
		return health;
	}
	
} 
