package Top150.Array_String;

/**
 * 45. Jump Game II
 * <br>
 * Medium
 * <br>
 * https://leetcode.com/problems/jump-game-ii/
 *
 * @author VladKornilov
 */
public class JumpGameII {
	public int jump(int[] nums) {
		return bruteForce(nums);
	}
	
	private int bruteForce(int[] nums) {
		int[] stepsToReach = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			stepsToReach[i] = Integer.MAX_VALUE;
		}
		stepsToReach[stepsToReach.length - 1] = 0;
		for (int i = nums.length - 2; i >= 0; i--) {
			int min = stepsToReach[i];
			for (int j = 1; j <= nums[i] && i + j < stepsToReach.length; j++) {
				if (stepsToReach[i + j] != Integer.MAX_VALUE) {
					min = Math.min(min, stepsToReach[i + j] + 1);
				}
			}
			stepsToReach[i] = min;
		}
		return stepsToReach[0] == Integer.MAX_VALUE ? -1 : stepsToReach[0];
	}
}
