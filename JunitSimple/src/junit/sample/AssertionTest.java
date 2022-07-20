package junit.sample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.ezen.unit.Calculate;
import com.ezen.unit.StringOp;

class AssertionTest {
	StringOp op = new StringOp();
	Calculate calc = new Calculate();
	
	@Test
	void testAssertEquals() {
		assertEquals("ABC", op.strReturn());
		assertEquals(20,calc.sum(10, 10), "calc.sum(10,10) = 23");
		assertEquals(2+2, 4);
	}
	
	@Test
	void testAssertFalse() {
		assertFalse(10 > 20, "10 > 20");
		assertFalse("FirstName".length()==10);
	}
	
	@Test
	void testAsserNull() {
		String str1 = null;
		String str2 = "abc";
		assertNull(str1);
		assertNotNull(str2);
	}
	
	@Test
	void testAssertTrue() {
		assertTrue("FirstName".startsWith("F"));
	}
	
	@Test
	void testAssertArray() {
		int[] arr1 = {1, 2, 3};
		int[] arr2 = {1, 2, 3};
		
		assertArrayEquals(arr1, arr2);
	}

}
