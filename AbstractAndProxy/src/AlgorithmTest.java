import static org.junit.Assert.*;

import org.junit.Test;

public class AlgorithmTest {

	@Test
	public void test() {
		Algorithm fiboProxy = new ProxyFibonacci();
		Algorithm fibo = new Fibonacci();
		
		for(int i = 0 ; i < 10 ; ++i) {
			assertEquals(fibo.getVal(i), fiboProxy.getVal(i), 0);
		}
		
		/* Verify if the  cache version works */
		for(int i = 0 ; i < 10 ; ++i) {
			assertEquals(fibo.getVal(i), fiboProxy.getVal(i), 0);
		}
		
	}

}
