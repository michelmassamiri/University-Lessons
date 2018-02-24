
public class BufferFactory implements AlgoFactory {
	private AlgoProxy algo;
	
	
	public BufferFactory() {
		
	}
	
	public Algorithm createFibonacci() {
		algo = new ProxyFibonacci();
		return algo.createAlgo();
	}
	
	public Algorithm createPadovan() {
		algo = new ProxyPadovan();
		return algo.createAlgo();
	}
}
