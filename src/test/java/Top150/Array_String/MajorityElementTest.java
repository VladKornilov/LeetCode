package Top150.Array_String;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Тесты для {@link MajorityElement}
 *
 * @author VladKornilov
 */
class MajorityElementTest {
	private MajorityElement majorityElement;

	@BeforeEach
	void before() {
		majorityElement = new MajorityElement();
	}

	@Test
	void example1() {
		test(new int[] {3, 2, 3}, 3);
	}

	@Test
	void example2() {
		test(new int[] {2, 2, 1, 1, 1, 2, 2}, 2);
	}

	@Test
	void majorAtStart() {
		test(new int[] {2, 2, 2, 2, 1, 3, 3}, 2);
	}

	@Test
	void majorAtEnd() {
		test(new int[] {2, 2, 2, 3, 3, 3, 3}, 3);
	}

	@Test
	void oneElement() {
		test(new int[] {1}, 1);
	}

	void test(int[] nums, int expected) {
		int actual = majorityElement.majorityElement(nums);
		assertEquals(expected, actual);
	}
}