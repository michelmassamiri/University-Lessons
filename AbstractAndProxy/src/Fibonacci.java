public class Fibonacci implements Algorithm {
	private double val;
	
	public Fibonacci() {
		val = 0;
		
	}
	
	public double getVal(int i) {
		if(i == 0 || i == 1)
			return 1;
		
		val = getVal(i - 1) + getVal(i - 2);
		return val;
	}
	
	public String getName() {
		return "Fibonacci";
	}
	
	
}
