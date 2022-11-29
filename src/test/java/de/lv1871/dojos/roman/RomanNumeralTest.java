package de.lv1871.dojos.roman;

import static org.assertj.core.api.Assertions.assertThat;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumeralTest {

	private RomanNumeral romanNumeral = new RomanNumeral();

	@Test
	void romanOf1_shouldBe_I() {
		assertThat(romanNumeral.convert(1)).isEqualTo("I");
	}

	@Test
	void romanOf2_shouldBe_II() {
		assertThat(romanNumeral.convert(2)).isEqualTo("II");
	}
}
