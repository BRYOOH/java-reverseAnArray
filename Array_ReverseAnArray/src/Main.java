import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array");
		int n = scan.nextInt();
		
		System.out.println("Enter the elements");
		int [] nums = new int [n];
		for (int i=0; i<n ;i++) {
			nums[i] = scan.nextInt();
		}
		System.out.println("Original Array: " + Arrays.toString(nums));
		scan.close();
		
		int [] reversed = new int [n];
		for (int i=0; i<n ; i++) {
			reversed[i] = nums [n-1-i];
		}
		
		System.out.println("Reversed Array: " + Arrays.toString(reversed));
	}

}
