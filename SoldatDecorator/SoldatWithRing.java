
public class SoldatWithRing extends SoldatDecorator{
	
	public SoldatWithRing(Soldat soldat) {
		super(soldat);
	}
	
	public int strike() {
		return 3 * _deco.strike();
	}
}
