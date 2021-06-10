package fizzbuzz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class fizzbuzz_test {
	fizzbuzz obj = new fizzbuzz();
	@Test
	void test_finalResult() {
		assertEquals("fizz",obj.finalResult(3));
		assertEquals("buzz",obj.finalResult(10));
		assertEquals("fizzbuzz",obj.finalResult(15));
		assertEquals("2",obj.finalResult(2));
		assertEquals("fizzbuzz",obj.finalResult(90));
		assertEquals("0",obj.finalResult(0));
	}
	@Test
	void test_amtFizz() {
		assertEquals(1,obj.amtFizz(3));
		assertEquals(2,obj.amtFizz(6));
		assertEquals(4,obj.amtFizz(12));
		assertEquals(5,obj.amtFizz(18));
		assertEquals(9,obj.amtFizz(33));
		assertEquals(0,obj.amtFizz(1));
	}
	@Test
	void test_amtBuzz() {
		assertEquals(1,obj.amtBuzz(5));
		assertEquals(2,obj.amtBuzz(10));
		assertEquals(2,obj.amtBuzz(15));
		assertEquals(5,obj.amtBuzz(35));
		assertEquals(0,obj.amtBuzz(1));
	}
	@Test
	void test_amtFizzbuzz() {
		assertEquals(1,obj.amtFizzbuzz(15));
		assertEquals(2,obj.amtFizzbuzz(30));
		assertEquals(1,obj.amtFizzbuzz(24));
		assertEquals(0,obj.amtFizzbuzz(4));
	}
}
