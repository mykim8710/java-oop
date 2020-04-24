package ch6;

public class isNumberTest {
	public static void main(String[] args) {
		String str = "123";
		System.out.println(str + "은 숫자로 이루어져 있습니까? " + isNumber(str));
		
		String str2 = "korea123";
		System.out.println(str2 + "은 숫자로 이루어져 있습니까? " + isNumber(str2));
	}

	public static boolean isNumber(String str) {
		boolean isNumber = true;

		if (str == null || str.equals("")) {
			isNumber = false;
		}

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch < '0' || ch > '9') {
				isNumber = false;
			}
		}

		return isNumber;
	}

}
