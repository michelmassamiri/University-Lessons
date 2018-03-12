
public class SoldatWithShield extends SoldatDecorator{
	
	public SoldatWithShield(Soldat soldat) {
		super(soldat);
	}
	
	public void parry(int f) {
		 _deco.parry(Math.log(f));
	}
}
