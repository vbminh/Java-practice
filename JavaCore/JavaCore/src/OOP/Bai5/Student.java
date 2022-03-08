package OOP.Bai5;

public class Student extends Person {
	private byte math;
	private byte physics;
	
	public Student(int id) {
		super(id);
	}
	
	public Student(int id, String name, String address, byte math, byte physics) {
		super(id, name, address);
		this.math = math;
		this.physics = physics;
	}
	
	public double Totals() {
		return math + physics;
	}
	
	@Override
	public String toString() {
		
		return super.toString() + String.format("%5s %5s %8s",math,physics,Totals());
	}
	
	@Override
	public boolean equals(Object obj) {
		Student std = (Student)obj;
		return this.getId() == std.getId();
	}
}
