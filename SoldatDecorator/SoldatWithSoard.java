
public class SoldatWithSoard extends SoldatDecorator{
	
	public SoldatWithSoard(Soldat soldat) {
		super(soldat);
	}
	
	public int strike() {
		return 2 * _deco.strike();
	}
}
