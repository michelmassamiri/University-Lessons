
public class SoldatDecorator implements Soldat {
	
	public Soldat _deco;
	
	public SoldatDecorator(Soldat deco) {
		_deco = deco;
	}
	
	public int strike() {
		return _deco.strike();
	}
	
	public void parry(int f) {
		_deco.parry(f);
	}
	
	public boolean isAlive() {
		return _deco.isAlive();
	}
}
