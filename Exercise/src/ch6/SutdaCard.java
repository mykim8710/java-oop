package ch6;

class SutdaCard {
	int num; // 카드의 숫자
	boolean isKwang; // 광이면 true, 아니면 false

	SutdaCard() {
		this(1, true);
	}

	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

	String info() {
		return num + (isKwang ? "K" : "");
	}

}
