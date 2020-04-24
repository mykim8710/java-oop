package Ch7_25;

interface Parseable {
	public abstract void parse(String fileName);
}

class XMLParser implements Parseable {
	public void parse(String fileName) {
		System.out.println(fileName + "- XML Parsing completed");
	}
}

class HTMLParser implements Parseable {
	public void parse(String fileName) {
		System.out.println(fileName + "- HTML Parsing completed");
	}
}

class ParserManage {
	public static Parseable getParser(String type) {
		if (type.equals("XML")) {
			return new XMLParser();
		} else {
			return new HTMLParser();
		}
	}
}

public class ParseTest {
	public static void main(String[] args) {
		Parseable parser = ParserManage.getParser("XML");
		parser.parse("documents.xml");
		Parseable parser2 = ParserManage.getParser("HTML");
		parser2.parse("documents2.html");
	}
}
