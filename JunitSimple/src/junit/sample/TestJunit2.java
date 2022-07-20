package junit.sample;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.ezen.unit.Calculator;

class TestJunit2 {

	@Test
	void testMultiply() {
		Calculator calc = new Calculator();
		assertEquals(6, calc.multiply(2, 3));
	}

}
