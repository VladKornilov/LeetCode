package Top150.Array_String;

import Top150.Array_String.RemoveDuplicatesFromSortedArray.Solution;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Тесты для {@link RemoveDuplicatesFromSortedArray}
 *
 * @author VladKornilov
 */
class RemoveDuplicatesFromSortedArrayTest {
	private Solution solution;
	
	@BeforeEach
	void before() {
		solution = new Solution();
	}
	
	@Test
	void simpleData() {
		test(
			new int[] {1, 2, 3},
			new int[] {1, 2, 3}
		);
	}
	
	@Test
	void simpleDuplicates() {
		test(
			new int[] {1, 2, 2, 3},
			new int[] {1, 2, 3}
		);
	}
	
	@Test
	void onlyDuplicates() {
		test(
			new int[] {1, 1, 1},
			new int[] {1}
		);
	}
	
	@Test
	void singleElement() {
		test(
			new int[] {1},
			new int[] {1}
		);
	}
	
	@Test
	void emptyArray() {
		test(
			new int[] {},
			new int[] {}
		);
	}
	/**
	 * @param nums Input array
	 * @param expectedNums The expected answer with correct length
	 */
	public void test(int[] nums, int[] expectedNums) {
		int k = solution.removeDuplicates(nums);
		assertEquals(expectedNums.length, k);
		for (int i = 0; i < k; i++) {
			assertEquals(expectedNums[i], nums[i]);
		}
	}
}