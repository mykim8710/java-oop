class Card {
	String pattern;
	int number;

	static String width = "100mm";
	static String height = "250mm";

}

public class CardTest {
	public static void main(String[] args) {
		System.out.println("�� ī���� ���� " + Card.width + " �̴�.");
		System.out.println("�� ī���� ���̴� " + Card.height + " �̴�.");

		Card c1 = new Card();
		c1.pattern = "Spade";
		c1.number = 10;

		Card c2 = new Card();
		c2.pattern = "Heart";
		c2.number = 5;

		System.out.println("c1 ī���� ������ " + c1.pattern + " �̸� ���ڴ� " + c1.number + " �̴�.");
		System.out.println("c2 ī���� ������ " + c2.pattern + " �̸� ���ڴ� " + c2.number + " �̴�.");
		
		System.out.println("c1 ī���� ���� 80mm, ���̸� 200mm�� �ٲٰ� ������");
		c1.width = "80mm";
		c1.height = "200mm";

		System.out.println("c1 ī���� ������ " + c1.pattern + " �̸� ���ڴ� " + c1.number + " �̸� ����� c1ī���� ���� " +c1.width +" �̸� ����� c1ī���� ���̴� " +c1.height +"�Դϴ�." );
	}

}
