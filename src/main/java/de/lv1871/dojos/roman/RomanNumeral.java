package de.lv1871.dojos.roman;

public class RomanNumeral {

	public String convert(int naturalNumber) {
		if (naturalNumber == 5) {
			return "V";
		} else if (naturalNumber == 4) {
			return "IV";
		} else if (naturalNumber > 1) {
			return "I" + convert(naturalNumber - 1);
		}
		return "I";
	}
}
