package Top150.Array_String;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Тесты для {@link JumpGame}
 *
 * @author VladKornilov
 */
class JumpGameTest {
	private JumpGame jumpGame;
	
	@BeforeEach
	void before() {
		jumpGame = new JumpGame();
	}
	
	@Test
	void example1() {
		test(new int[]{2, 3, 1, 1, 4}, true);
	}
	
	@Test
	void example2() {
		test(new int[]{3, 2, 1, 0, 4}, false);
	}
	
	@Test
	void noFirstJump() {
		test(new int[]{0, 3, 3, 3, 4}, false);
	}
	
	@Test
	void twoJumps() {
		test(new int[]{3, 0, 0, 3, 0, 0, 4}, true);
	}
	
	void test(int[] nums, boolean expected) {
		assertEquals(expected, jumpGame.canJump(nums));
	}
}