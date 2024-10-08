package Checkedandunchecked;

class UserDefinedException extends Exception
{
	public UserDefinedException(String str) {
		super(str);
	}
}

public class TestThrow3{
	public static void main(String args[]) {
		try {
			throw new UserDefinedException("This is user-defined Exception");
		}
		catch(UserDefinedException ude) {
			System.out.println("caught the exception");
			System.out.println(ude.getMessage());
		}
	}
}
