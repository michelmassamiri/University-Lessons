import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) {
		if(args.length != 2) {
			System.out.println("Usage : Main <FactoryConcrete> <fibonacci_index>");
			System.exit(0);
		}
		
		String concretClass = args[0];
		String fiboIndex = args[1];
		
		try {
			Class<?> fiboFactory = Class.forName(concretClass);
			Object fiboFactory_instance = fiboFactory.newInstance();
			
			Method[] allMethods = fiboFactory.getDeclaredMethods();
			Method createFibo = null;
			for(Method method : allMethods) {
				String method_name = method.getName();
				if(method_name.contains("Fibonacci")) {
					createFibo = method ;
					System.out.println("We are executing "+ method_name);
				}
			}
			if(createFibo == null) {
				System.out.println("The method which creates fibonacci does not exist");
				System.exit(0);
			}
			
			Object[] params = null;
			Object fibo = createFibo.invoke(fiboFactory_instance, params);
			Class<?> fiboClass = fibo.getClass();
			Class <?>[] indexParam = new Class[] {int.class}; 
			Method getVal = fiboClass.getMethod("getVal", indexParam);
			
			Object result_getVal = getVal.invoke(fibo, Integer.parseInt(fiboIndex));
			System.out.println("Fibonacci with "+fiboIndex+ " index has " + result_getVal.toString() );
			 
			
		}
		
		catch(SecurityException e) {
			e.printStackTrace();
			
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
			
		} catch(InstantiationException e) {
			e.printStackTrace();
			
		} catch(NoSuchMethodException e) {
			e.printStackTrace();
			
		} catch (IllegalAccessException e) {
			e.printStackTrace();
			
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}

}
