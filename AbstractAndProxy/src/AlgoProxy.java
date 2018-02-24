import java.util.HashMap;


public abstract class AlgoProxy implements Algorithm {
	
	private Algorithm algo;
	private HashMap<Integer, Double> hashMap;
	
	protected abstract Algorithm createAlgo();
	
	public AlgoProxy() {
		algo = createAlgo();
		hashMap = new HashMap<Integer, Double>();
	}
	
	public double getVal(int i) {		
		if(hashMap.containsKey(i))
			return hashMap.get(i);
		
		double value = algo.getVal(i);
		hashMap.put(i, value);
		
		return value ;
	}
	
	public String getName() {
		return algo.getName();
	}
	
}
