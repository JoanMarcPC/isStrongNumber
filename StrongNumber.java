

class StrongNumber {

	public static String isStrongNumber(int num) {
		int digits = num;
		int aux2 = 0;
		int result = 0;

		while (digits > 0) {
			aux2 = digits % 10;
			for (int i = (digits % 10) - 1; i > 1; i--) {
				aux2 *= i;
			}

			result += aux2;
			digits /= 10;

		}
		if (result == num) {
			return "STRONG!!!!";
		} else {
			return "Not Strong !!";
		}
	}
}