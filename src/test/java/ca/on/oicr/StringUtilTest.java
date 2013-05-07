package ca.on.oicr;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilTest {


	@Test
	public void testNull() {
		assertEquals(true, StringUtil.isNullOrEmpty(null));
	}
	
	@Test
	public void testEmpty() {
		assertEquals(true, StringUtil.isNullOrEmpty(""));
	}
	
	@Test
	public void testNotEmpty() {
		assertEquals(false, StringUtil.isNullOrEmpty("notEmpty"));
	}

}
