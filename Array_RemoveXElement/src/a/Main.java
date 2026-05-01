package a;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n = scan.nextInt();
		
		System.out.println("Enter the elements");
		int [] nums = new int [n];
		for(int i = 0; i < n;i++) {
			nums[i]=scan.nextInt();
		}
		System.out.println("Original Array:" + Arrays.toString(nums));
		int val = scan.nextInt();
		scan.close();
		
		int result = removeElement(nums,n,val);
		System.out.println("Modified Array:" + Arrays.toString(Arrays.copyOf(nums, result)));
	}

	private static int removeElement(int[] nums, int n, int val) {
		int k=0;
		
		for(int i=0; i < n; i++) {
			if(nums[i]!=val) {
				nums[k] = nums[i];
				k++;
			}
		}
		return k;
	}
	
	

}
