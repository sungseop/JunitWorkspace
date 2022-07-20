package junit.sample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.ezen.unit.MathUtil;

class FindMaxTest {

	@Test
	void testFindMax() {
		// 사용배열: {1, 3, 4, 2}
		assertEquals(4, MathUtil.findMax(new int[] {1, 3, 4, 2}));
		assertEquals(-2, MathUtil.findMax(new int[] {-12, -3, -4, -2}));
	}

}