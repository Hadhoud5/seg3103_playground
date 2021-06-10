package fizzbuzz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class fizzbuzz_test {
	fizzbuzz obj = new fizzbuzz();
	@Test
	void testfinalResult() {
		assertEquals("fizz",obj.finalResult(3));
		assertEquals("buzz",obj.finalResult(10));
		assertEquals("fizzbuzz",obj.finalResult(15));
		assertEquals("2",obj.finalResult(2));
		assertEquals("fizzbuzz",obj.finalResult(90));
		assertEquals("0",obj.finalResult(0));
	}

}
