public class Padovan implements Algorithm {
	private double val;
	
	public Padovan() {
		val = 0 ;
	}
	
	public double getVal(int i) {
		if(i == 0 || i == 1 ||i == 2) 
			return 1;
		
		val = getVal(i - 2) + getVal(i -3);
		return val;
	}
	
	public String getName() {
		return "Padovan";
	}
}
