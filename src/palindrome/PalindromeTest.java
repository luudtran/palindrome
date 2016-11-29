package palindrome;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PalindromeTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCheck1() {
		check(false, "abcde");
	}
	
	@Test
	public void testCheck2() {
		check(true, "abccba");
	}
	
	@Test
	public void testCheck3() {
		check(true, "abcdcba");
	}
	
	@Test
	public void testCheck4() {
		check(false, "abcdcbb");
	}
	
	@Test
	public void testCheck5() {
		check(true, "a");
	}
	
	@Test
	public void testCheck6() {
		check(true, "aa");
	}
	
	@Test
	public void testCheck7() {
		check(false, "ab");
	}
	
	@Test
	public void testCheck8() {
		check(true, "aba");
	}
	
	@Test
	public void testCheck9() {
		check(false, "abc");
	}
	
	@Test
	public void testCheck10() {
		check(true, "");
	}
	
	private void check(boolean expected, String str) {
		assertEquals(expected, Palindrome.check(str));
	}

}
