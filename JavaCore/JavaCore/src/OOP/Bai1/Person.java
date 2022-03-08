package OOP.Bai1;

public class Person {
	private String id;
	private String name;
	private int age;
	private String email;
	private String address;

	public Person() {
	}

	public Person(String id) {
		this.id = id;
	}

	public Person(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public Person(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public Person(String id, String name, int age, String email) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.email = email;
	}

	public Person(String id, String name, int age, String email, String address) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.email = email;
		this.address = address;
	}

	protected String getId() {
		return id;
	}

	protected void setId(String id) {
		this.id = id;
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected int getAge() {
		return age;
	}

	protected void setAge(int age) {
		this.age = age;
	}

	protected String getEmail() {
		return email;
	}

	protected void setEmail(String email) {
		this.email = email;
	}

	protected String getAddress() {
		return address;
	}

	protected void setAddress(String address) {
		this.address = address;
	}
	
	public String checkAge() {
		if(this.getAge() >= 18) 
			return "Bạn đủ tuổi bầu cử";
		return "Bạn còn nhỏ";
	}
	
	@Override
	public String toString() {
		return String.format("%-10s %-10s %-5s %-10s %10s",this.id,this.name,this.age,this.email,this.address);
	}
}
