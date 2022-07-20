package junit.sample;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.ezen.unit.Calculator;

class TestJunit1 {

	@Test
	void testSum() {
		Calculator calc = new Calculator();
		assertEquals(5, calc.sum(2, 3));
	}

}
