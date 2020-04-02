package LeetCode;
import java.util.HashMap;

//Given an array of integers, return indices of the two numbers such that they add up to a specific target.
//
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//Example:
//
//Given nums = [2, 7, 11, 15], target = 9,
//
//Because nums[0] + nums[1] = 2 + 7 = 9,
//return [0, 1].
public class TwoNumbers {

	public static int[] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				int sum = nums[i] + nums[j];

				if (sum == target) {
					int[] arr = { i, j };
					return arr;
				}
			}
		}
		return null;
	}

	public static int[] twoSumAltSol(int[] nums, int target) {
		HashMap<Integer, Integer> numsMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			numsMap.put(nums[i], i);
		}

		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (numsMap.containsKey(complement)) {
				return new int[] { i, numsMap.get(complement) };
			}
		}
		return null;
	}

	public static void main(String[] args) {
		int[] arr = { 15, 11, 11, 15 };
		int target = 22;
		int[] result = twoSum(arr, target);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + ",");
		}
		System.out.println();
		int[] resultAlt = twoSumAltSol(arr, target);
		for (int i = 0; i < resultAlt.length; i++) {
			System.out.print(resultAlt[i] + ",");
		}
	}
}
