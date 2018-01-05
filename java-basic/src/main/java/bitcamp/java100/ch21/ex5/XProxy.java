package bitcamp.java100.ch21.ex5;

public class XProxy extends X {
	
	@Override
	public String m1(String name) {
		MyAdvice advice = new MyAdvice();
		
		advice.doBefore(name);
		
		try {
		String returnValue = super.m1(name);
		advice.doAfterReturning(returnValue);
		return returnValue;
		} catch (Exception e) {
			advice.doAfterThrowing(e);
			throw e;
		} finally {
			advice.doAfter();
			
		}
		
	}

}
