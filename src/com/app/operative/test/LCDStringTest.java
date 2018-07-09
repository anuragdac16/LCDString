package com.app.operative.test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.app.operative.LCDString;

class LCDStringTest {

	LCDString lcd = new LCDString();
	@Test
	void testPrintFirstLine() {
		Assert.assertNotNull( lcd.printFirstLine("123"));
		Assert.assertEquals("... ._. ._. ", lcd.printFirstLine("123"));
	}

	@Test
	void testPrintSecondLine() {
		Assert.assertNotNull( lcd.printSecondLine("123"));
		Assert.assertEquals("..| ._| ._| ", lcd.printSecondLine("123"));
	}

	@Test
	void testPrintThirdLine() {
		Assert.assertNotNull( lcd.printThirdLine("123"));
		Assert.assertEquals("..| |_. ._| ", lcd.printThirdLine("123"));
	}

}
