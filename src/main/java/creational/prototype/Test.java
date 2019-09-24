package creational.prototype;

public class Test {

	public static void main(String[] args) {
		Employee rafinha = new Employee("Rafinha", new Address("street", "Montijo", "Portugal"));
		Employee thiarlles = new Employee(rafinha);
		thiarlles.name = "Thiarlles";
		System.out.println(rafinha);
		System.out.println(thiarlles);
		
		

	}
}
