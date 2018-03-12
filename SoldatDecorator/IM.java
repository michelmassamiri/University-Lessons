
public class IM implements Soldat {
	
	private double health;
	
	public IM() {
		health = 50;
	}
	
	public int strike() {
		return 5;
	}
	
	public void parry(int f) {
		health -= f;
	}
	
	public boolean isAlive() {
		if(health != 0)
			return true;
		return false;
	}
}
