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
		
		int result = removeDuplicates(nums,n);
		System.out.println("Original Array: " + Arrays.toString(Arrays.copyOf(nums,result)));
	}
	
	public static int removeDuplicates(int [] nums, int n) {
		int k =1;
		
		for(int i =1; i < n; i++) {
			if(nums[i] != nums[i-1]) {
			   nums[k] = nums[i];
			   k++;
			}
			
		}
		return k;
		
	}

}
