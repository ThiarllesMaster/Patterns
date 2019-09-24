package creational.prototype;

public class Employee {

	public String name;
	public Address address;
	
	public Employee(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}
	
	public Employee(Employee e) {
		this.name = e.name;
		this.address = new Address(e.address);
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + "]";
	}
	
	
}
