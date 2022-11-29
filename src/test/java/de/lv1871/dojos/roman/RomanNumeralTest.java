package de.lv1871.dojos.roman;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumeralTest {

	@Test
	void romanOf1_shouldBe_I() {
		// given
		RomanNumeral romanNumeral = new RomanNumeral();
		// when
		String roman = romanNumeral.convert(1);
		// then
		Assertions.assertThat(roman).isEqualTo("I");
	}

	@Test
	void romanOf2_shouldBe_II() {
		// given
		RomanNumeral romanNumeral = new RomanNumeral();
		// when
		String roman = romanNumeral.convert(2);
		// then
		Assertions.assertThat(roman).isEqualTo("II");
	}
}
