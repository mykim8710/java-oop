package ch6;

class SutdaCard {
	int num; // ī���� ����
	boolean isKwang; // ���̸� true, �ƴϸ� false

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
