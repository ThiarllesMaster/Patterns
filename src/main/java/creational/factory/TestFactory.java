package creational.factory;

public class TestFactory {

	public static void main(String[] args) {
		Reader reader = ReaderFactory.getReader("XML");
		System.out.println(reader.read());
	}
}
