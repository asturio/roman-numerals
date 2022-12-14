package de.lv1871.dojos.roman;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.of;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class RomanNumeralTest {

    private final RomanNumeral romanNumeral = new RomanNumeral();

    public static Stream<Arguments> testArguments() {
        return Stream.of(
            of("I", 1),
            of("II", 2),
            of("III", 3),
            of("IV", 4),
            of("V", 5),
            of("VI", 6),
            of("VIII", 8),
            of("IX", 9),
            of("X", 10),
            of("XI", 11),
            of("XIII", 13),
            of("XIV", 14),
            of("XV", 15),
            of("XVI", 16),
            of("XIX", 19),
            of("XX", 20),
            of("XXVII", 27),
            of("XXXII", 32),
            of("XXXIX", 39),
            of("XL", 40),
            of("XLI", 41),
            of("XLIX", 49),
            of("L", 50),
            of("LI", 51),
            of("LIX", 59),
            of("LX", 60),
            of("LXXI", 71),
            of("LXXXIX", 89),
            of("XC", 90),
            of("XCI", 91),
            of("XCIX", 99),
            of("C", 100),
            of("CI", 101),
            of("CXXIII", 123),
            of("CXCIX", 199),
            of("CCXCIX", 299),
            of("CCCXCIX", 399),
            of("CD", 400),
            of("CDXCIX", 499),
            of("D", 500),
            of("DC", 600),
            of("DCCCXCVIII", 898),
            of("CM", 900),
            of("CMXLIX", 949),
            of("CMLXXXIV", 984),
            of("M", 1000),
            of("MCMLXXVI", 1976),
            of("MDCCCLXXI", 1871),
            of("MMXXII", 2022),
            of("", 0)
		);
	}

	@ParameterizedTest
	@MethodSource("testArguments")
	void testRomanNumerals(String expected, int input) {
		// then
		assertThat(romanNumeral.convert(input)).isEqualTo(expected);
	}
}
