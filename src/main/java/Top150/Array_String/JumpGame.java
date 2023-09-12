package Top150.Array_String;

/**
 * 55. Jump Game
 * <br>
 * Medium
 * <br>
 * https://leetcode.com/problems/jump-game/
 *
 * @author VladKornilov
 */
public class JumpGame {
	public boolean canJump(int[] nums) {
		int maxJump = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (maxJump == 0) {
				return false;
			}
			maxJump--;
			maxJump = Math.max(maxJump, nums[i]);
		}
		return true;
	}
}
