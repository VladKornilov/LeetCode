package Top150.Array_String;

/**
 * 80. Remove Duplicates from Sorted Array II
 * <br>
 * Medium
 * <br>
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii
 *
 * @author VladKornilov
 */
public class RemoveDuplicatesFromSortedArrayII {
	static class Solution {
		public int removeDuplicates(int[] nums) {
			int currentPos = 0;
			int resultPos = 0;
			while (currentPos < nums.length) {
				nums[resultPos] = nums[currentPos];
				currentPos++;
				if (currentPos < nums.length && nums[resultPos] == nums[currentPos]) {
					resultPos++;
					nums[resultPos] = nums[currentPos];
				}

				while (currentPos < nums.length && nums[currentPos] == nums[currentPos - 1]) {
					currentPos++;
				}
				resultPos++;
			}
			return resultPos;
		}
	}
}

