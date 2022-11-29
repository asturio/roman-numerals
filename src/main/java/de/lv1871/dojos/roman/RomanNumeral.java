package de.lv1871.dojos.roman;

public class RomanNumeral {

	public String convert(int naturalNumber) {
		if (naturalNumber > 1) {
			return "I" + convert(naturalNumber - 1);
		}
		return "I";
	}
}
