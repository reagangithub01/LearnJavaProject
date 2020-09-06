package testprojectgit;

public class ExceptionHandlingDemoThrow {

	public static void main(String[] args) {
		
		try {
			demoThrow();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static void demoThrow() throws Exception{
	// TODO Auto-generated method stub
			System.out.println("Hello World...!");
			throw new ArithmeticException("not valid Operation");
			//int i = 1/0;
			//System.out.println("Completed");
		
	}
	
	
	
}
