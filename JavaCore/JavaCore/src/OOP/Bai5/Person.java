package OOP.Bai5;

public class Person {
	private int id;
	private String name;
	private String address;
	
	public Person() {
		
	}
	
	public Person(int id) {
		this.id = id;
	}

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public Person(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return String.format("%5s %10s %10s",this.id,this.name,this.address);
	}
	
	
}
