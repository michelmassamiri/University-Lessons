
public class HM implements Soldat {
	
	private double health;
	
	public HM() {
		health = 50;
	}
	
	public int strike() {
		return 7;
	}
	
	public void parry(int f) {
		health = Math.log(f);
	}
	
	public boolean isAlive() {
		if(health != 0)
			return true;
		return false;
	}
	
} 
