import static org.junit.Assert.*;

import org.junit.Test;

import com.sas.helper.StringHelper;


public class StringHelperTest {

	StringHelper helper = new StringHelper();
	
	@Test
	public void testStringHavingAInFirstCharacterOnly() {
		assertEquals("BCD", helper.removeAInFirst2Chars("ABCD"));
	}
	
	@Test
	public void testStringHavingNoAInFirst2Chars() {
		assertEquals("BBAA", helper.removeAInFirst2Chars("BBAA"));
	}
	
	@Test
	public void testStringHavingAInFirst2CharsAnd4Char() {
		assertEquals("BBA", helper.removeAInFirst2Chars("ABBA"));
	}
	
	@Test
	public void testStringWith2Chars() {
		assertEquals("B", helper.removeAInFirst2Chars("AB"));
	}
	
	@Test
	public void testStringWith1Chars() {
		assertEquals("B", helper.removeAInFirst2Chars("B"));
	}
	
	@Test
	public void testStringWithAAs1Chars() {
		assertEquals("", helper.removeAInFirst2Chars("A"));
	}

	@Test
	public void testStringWithEmptyString() {
		assertEquals("", helper.removeAInFirst2Chars(""));
	}
}
