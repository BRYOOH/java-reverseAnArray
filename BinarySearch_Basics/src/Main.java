import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n = scan.nextInt();
		
		int [] nums = new int [n];
		System.out.println("Enter the Array");
		for (int i=0; i<n; i++) {
			nums[i]=scan.nextInt();
		}
		System.out.println("Enter the targett number: ");
		int target = scan.nextInt();
		scan.close();
		
		Arrays.sort(nums);
		System.out.println("The array: " + Arrays.toString(nums));
		
		int result = binarySearch(nums,target);
		System.out.println("The target " + target +" is index: " + result);
	}

	private static int binarySearch(int[] nums,int target) {
		int left = 0;
		int right=nums.length-1;
		
		while(left <= right) {
			int mid = left + (right-left)/2;
			
			if(nums[mid] == target) {
				return mid;
				} else if(nums[mid]<target) {
					left = mid+1;
				} else {
					right = mid-1;
				}
		}
		
		return -1;
	}

}
