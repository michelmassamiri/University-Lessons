
public class ReccursiveFactory implements AlgoFactory{
	
	public ReccursiveFactory() {
	
	}
	
	public Algorithm createFibonacci() {
		return new Fibonacci();
	}
	
	public Algorithm createPadovan() {
		return new Padovan();
	}
}
