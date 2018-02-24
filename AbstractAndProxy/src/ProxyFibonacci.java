public class ProxyFibonacci extends AlgoProxy {
	
	public ProxyFibonacci() {
		super();
	}
	
	public Algorithm createAlgo() {
		return new Fibonacci();
	}
}
