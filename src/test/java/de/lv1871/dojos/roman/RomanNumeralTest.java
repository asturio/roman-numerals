package de.lv1871.dojos.roman;

import org.junit.jupiter.api.Test;

public class RomanNumeralTest {
	@Test
	void romanOf1_shouldBeI() {
		// given
		RomanNumeral romanNumeral = new RomanNumeral();
		// when
		String roman = romanNumeral.convert(1);
		// then

	}
}
