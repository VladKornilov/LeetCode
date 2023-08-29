package Top150.Array_String;

import java.util.HashMap;
import java.util.Map;

/**
 * 26. Remove Duplicates from Sorted Array
 * <br>
 * Easy
 * <br>
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 *
 * @author VladKornilov
 */
public class RemoveDuplicatesFromSortedArray {
	static class Solution {
		public int removeDuplicates(int[] nums) {
			int currentPos = 0;
			int resultPos = 0;
			while (currentPos < nums.length) {
				nums[resultPos] = nums[currentPos];
				currentPos++;
				while (currentPos < nums.length && nums[currentPos] == nums[currentPos - 1]) {
					currentPos++;
				}
				resultPos++;
			}
			return resultPos;
		}
	}
}
