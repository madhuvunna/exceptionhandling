package Checkedandunchecked;

public class TryExample3 {
	public static void main (String args[]) {
		try {
		int arr[]= {1,3,5,7,12,15,17,19};
		System.out.println(arr[12]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		System.out.println("print the hi");
	}
}
