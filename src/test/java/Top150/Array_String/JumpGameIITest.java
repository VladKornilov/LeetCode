package Top150.Array_String;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Тесты для {@link JumpGameII}
 * @author VladKornilov
 */
class JumpGameIITest {
	private JumpGameII jumpGame;
	
	@BeforeEach
	void before() {
		jumpGame = new JumpGameII();
	}
	
	@Test
	void example1() {
		test(new int[]{2, 3, 1, 1, 4}, 2);
	}
	
	@Test
	void example2() {
		test(new int[]{2, 3, 0, 1, 4}, 2);
	}
	
	@Test
	void noJumps() {
		test(new int[]{0}, 0);
	}

	@Test
	void bigJumps() {
		test(new int[]{1000, 0, 0, 1000, 0, 0, 4}, 1);
	}
	
	void test(int[] nums, int expected) {
		assertEquals(expected, jumpGame.jump(nums));
	}
}