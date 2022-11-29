package de.lv1871.dojos.roman;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class RomanNumeralTest {

	private final RomanNumeral romanNumeral = new RomanNumeral();

	public static Stream<Arguments> testArguments() {
		return Stream.of(
				Arguments.of("I", 1),
				Arguments.of("II", 2),
				Arguments.of("III", 3),
				Arguments.of("IV", 4),
				Arguments.of("V", 5),
				Arguments.of("VI", 6)
		);
	}

	@ParameterizedTest
	@MethodSource("testArguments")
	void testRomanNumerals(String expected, int input) {
		// then
		assertThat(romanNumeral.convert(input)).isEqualTo(expected);
	}
}
