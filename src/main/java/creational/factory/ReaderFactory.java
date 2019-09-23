package creational.factory;

public class ReaderFactory {

	public static Reader getReader(String type) {
		if (type.equals("CSV")) {
			return new CSVReader();
		} else if (type.equals("XML")) {
			return new XMLReader();
		}
		return null;
	}
}
