class Card {
	String pattern;
	int number;

	static String width = "100mm";
	static String height = "250mm";

}

public class CardTest {
	public static void main(String[] args) {
		System.out.println("이 카드의 폭은 " + Card.width + " 이다.");
		System.out.println("이 카드의 길이는 " + Card.height + " 이다.");

		Card c1 = new Card();
		c1.pattern = "Spade";
		c1.number = 10;

		Card c2 = new Card();
		c2.pattern = "Heart";
		c2.number = 5;

		System.out.println("c1 카드의 패턴은 " + c1.pattern + " 이며 숫자는 " + c1.number + " 이다.");
		System.out.println("c2 카드의 패턴은 " + c2.pattern + " 이며 숫자는 " + c2.number + " 이다.");
		
		System.out.println("c1 카드의 폭을 80mm, 길이를 200mm로 바꾸고 싶으면");
		c1.width = "80mm";
		c1.height = "200mm";

		System.out.println("c1 카드의 패턴은 " + c1.pattern + " 이며 숫자는 " + c1.number + " 이며 변경된 c1카드의 폭은 " +c1.width +" 이며 변경된 c1카드의 길이는 " +c1.height +"입니다." );
	}

}
