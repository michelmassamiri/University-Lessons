public class ProxyPadovan extends AlgoProxy {
	public ProxyPadovan() {
		super();
	}
	
	public Algorithm createAlgo() {
		return new Padovan();
	}
}
