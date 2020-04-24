package ch7_7_1;

class SutdaCard {
	int num;
	boolean isKwang;

	SutdaCard() {
		this(1, true);
	}

	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

	@Override
	public String toString() {
		return num + (isKwang ? "K" : "");
	}

}

class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];

	SutdaDeck() {
		for (int i = 0; i < cards.length; i++) {
			boolean k = false;
			int number = i % 10 + 1;
			if ((i < 10) && (number == 1 || number == 3 || number == 8)) {
				k = true;
			}

			cards[i] = new SutdaCard(number, k);
		}
	}
}

public class SutdaTest {

	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();

		for (int i = 0; i < deck.cards.length; i++) {
			System.out.print(deck.cards[i] + " , ");
		}
	}

}
