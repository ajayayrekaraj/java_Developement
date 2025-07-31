package Leet_Code_Questions;

/*
 * Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
Example 2:

Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
 

Constraints:

1 <= nums.length <= 105
-231 <= nums[i] <= 231 - 1
0 <= k <= 105
 
Follow up:

Try to come up with as many solutions as you can. There are at least three different ways to solve this problem.
Could you do it in-place with O(1) extra space?
 */
import java.util.*;

public class Rotate_Array_189 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nums[] = new int[n];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		Rotate_Array(nums, k);
		for (int m = 0; m < nums.length; m++) {
			System.out.print(nums[m]+ " ");
		}
	}

	public static void Rotate_Array(int nums[], int k) {
		int n = nums.length;
		k = k % n;
		for (int j = 1; j <= k; j++) {
			int last_ele = nums[n - 1];
			for (int i = n - 2; i >= 0; i--) {
				nums[i + 1] = nums[i];
			}
			nums[0] = last_ele;
		}
	}
}
