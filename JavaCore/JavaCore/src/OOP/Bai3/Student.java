package OOP.Bai3;

public class Student {
	private String id;
	private String name;
	private double mark;
	private int scholarship;
	
	public Student() {
		
	}

	public Student(String id, String name, double mark) {
		super();
		this.id = id;
		this.name = name;
		this.mark = mark;
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

	protected double getMark() {
		return mark;
	}

	protected void setMark(double mark) {
		this.mark = mark;
	}
	
	protected double getScholarship() {
		return scholarship;
	}

	protected void setScholarship(double mark) {
		if(mark > 8) scholarship = 500;
		else if(mark >= 7) scholarship = 300;
		else scholarship = 0;
	}

	@Override
	public String toString() {
		return String.format("%5s %10s %5s %5s",id,name,mark,scholarship);
	}
	
	
}
