package Top150.Array_String;

/**
 * 169. Majority Element
 * <br>
 * Easy
 * <br>
 * https://leetcode.com/problems/majority-element/
 *
 * @author VladKornilov
 */
public class MajorityElement {
	public int majorityElement(int[] nums) {
		return algBoyerMoore(nums);
	}

	private int algBoyerMoore(int[] nums) {
		int chosenElement = nums[0];
		int votes = 1;
		for (int i = 1; i < nums.length; i++) {
			if (votes == 0) {
				chosenElement = nums[i];
				votes = 1;
			}
			else {
				if (chosenElement == nums[i]) {
					votes++;
				}
				else {
					votes--;
				}
			}
		}
		return chosenElement;
	}
}
