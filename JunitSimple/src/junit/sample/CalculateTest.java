package junit.sample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.ezen.unit.Calculate;

class CalculateTest {
	Calculate calc = new Calculate();
	int sum = calc.sum(2, 5);
	int testSum = 10;
	
	// @Test - 테스트 케이스로 실행할 메소드 지정
	@Test
	void test() {
		System.out.println("@Test sum(): " + testSum + "=" + sum);
		// testSum: 예상결과, sum: 실제 실행 결과
		assertEquals(testSum, sum);
	}

}
