package testExcetions;

public class CompileRunTime {

	public static void main(String[] args) {

		try {
			int i = 10/0;
			System.out.println(i);
			Thread.sleep(1000);
		}catch (InterruptedException e) {
			System.out.println("Error is : " + e.getMessage());
		}catch (ArithmeticException e) {
			System.out.println("Error is : " + e.getMessage());
		}
		
		System.out.println("Ending code.");
		
	}
}


//public static void test() {
//throw new ArithmeticException();
//System.out.println("roshan");
//
//
//}
//public static void main(String args[]) throws InterruptedException {
//System.out.println("swati");
//Thread.sleep(3000);
//System.out.println("www");
//test();
//
//}