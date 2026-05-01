package a;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

//Good pairs means how many elements are alike;
//(2,2,3,3,4,4) the number of Good pairs should be 3
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		System.out.println("Enter the number elements in the array");
		int n = scan.nextInt();
		
		System.out.println("Enter the elements");
		int [] nums = new int [n];
		for(int i= 0; i<n; i++) {
			nums[i]=scan.nextInt();		
			}
		System.out.println("Original array:" + Arrays.toString(nums));
		scan.close();

		int result = GoodPairs(nums);
		System.out.println("The number of good pairs is: " + result);
	}
	   
//TODO: Explain the GoodPair how the hashmap works and all the functions calls.
	public static int GoodPairs(int nums[]) {
		int count = 0; //Pointer
		
		HashMap <Integer,Integer> numsMap = new HashMap<>();
		
//TODO: Explain how the keys are structured. Can you print the HashMap. The keys and elements
//is num= 0 in the beginning? It is the key?
		for(int num:nums) {
			if(numsMap.containsKey(num)) {
				count += numsMap.get(num);
			}
			numsMap.put(num, numsMap.getOrDefault(num, 0)+1);
		}
		
		return count; // Count is the new n of the array
		
	}

}
