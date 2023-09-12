package Top150.Array_String;

import java.util.Random;

/**
 * 189. Rotate Array
 * <br>
 * Medium
 * <br>
 * https://leetcode.com/problems/rotate-array
 *
 * @author VladKornilov
 */
public class RotateArray {
	public void rotate(int[] nums, int k) {
		if (new Random().nextBoolean()) {
			rotateWithTempArray(nums, k);
		}
		else {
			rotateWithoutExtraSpace(nums, k);
		}
	}
	
	private void rotateWithTempArray(int[] nums, int k) {
		int N = nums.length;
		int[] copy = new int[N];
		for (int from = 0; from < N; from++) {
			int to = (from + k) % N;
			copy[to] = nums[from];
		}
		System.arraycopy(copy, 0, nums, 0, N);
	}
	
	private void rotateWithoutExtraSpace(int[] nums, int k) {
		k %= nums.length;
		rotateSubArray(nums, 0, nums.length);
		rotateSubArray(nums, 0, k);
		rotateSubArray(nums, k, nums.length);
	}
	
	/**
	 * Rotate subarray between given indexes
	 * @param nums array to rotate
	 * @param from index to start from, inclusive
	 * @param to index to end, exclusive
	 */
	private void rotateSubArray(int[] nums, int from, int to) {
		for (int i = 0; i < (to - from) / 2; i++) {
			int tmp = nums[from + i];
			nums[from + i] = nums[to - i - 1];
			nums[to - i - 1] = tmp;
		}
	}
}
