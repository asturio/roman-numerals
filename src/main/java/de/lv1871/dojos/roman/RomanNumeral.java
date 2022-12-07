package de.lv1871.dojos.roman;

public class RomanNumeral {

	public String convert(int naturalNumber) {
		if (naturalNumber <= 0) {
			return "";
		}

        if (naturalNumber >= 50) {
            return "L" + convert(naturalNumber - 50);
        } else if (naturalNumber >= 40) {
            return "XL" + convert(naturalNumber - 40);
        } else if (naturalNumber >= 10) {
			return "X" + convert(naturalNumber - 10);
		} else if (naturalNumber == 9) {
			return "IX";
		} else if (naturalNumber >= 5) {
			return "V" + convert(naturalNumber - 5);
		} else if (naturalNumber == 4) {
			return "IV";
		} else {
			return "I" + convert(naturalNumber - 1);
		}
	}
}
