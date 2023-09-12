package Top150.Array_String;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Тесты для {@link RotateArray}
 *
 * @author VladKornilov
 */
class RotateArrayTest {
	private RotateArray rotateArray;
	
	@BeforeEach
	void before() {
		rotateArray = new RotateArray();
	}
	
	@Test
	void example1() {
		test(
			new int[]{1, 2, 3, 4, 5, 6, 7},
			3,
			new int[]{5, 6, 7, 1, 2, 3, 4}
		);
	}
	
	@Test
	void example2() {
		test(
			new int[]{-1, -100, 3, 99},
			2,
			new int[]{3, 99, -1, -100}
		);
	}
	
	@Test
	void noChanges() {
		test(
			new int[]{1, 2, 3, 4, 5, 6, 7},
			0,
			new int[]{1, 2, 3, 4, 5, 6, 7}
		);
	}
	
	@Test
	void bigK() {
		test(
			new int[]{1, 2, 3, 4, 5, 6, 7},
			7 * 111 + 3,
			new int[]{5, 6, 7, 1, 2, 3, 4}
		);
	}
	
	void test(int[] nums, int k, int[] expected) {
		rotateArray.rotate(nums, k);
		assertArrayEquals(expected, nums);
	}
}