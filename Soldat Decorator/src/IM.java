
public class IM implements Soldat {
	
	private int health;
	
	public IM() {
		health = 50;
	}
	
	public int strike() {
		return 10;
	}
	
	public void parry(int f) {
		health -= f;
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
