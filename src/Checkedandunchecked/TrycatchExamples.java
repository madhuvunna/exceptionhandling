package Checkedandunchecked;

public class TrycatchExamples {

	public static void main(String[] args) {

		try {
			int data = 50 / 0;
			System.out.println("print the output");

		} catch (ArithmeticException e) {
			System.out.println(e);
		}
	}

}
