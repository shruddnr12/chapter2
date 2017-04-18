package person;

public class Student extends Person {
	private String major;

	public Student()
	{
		System.out.println("Student() called");
	}

	public Student(String major)
	{
		System.out.println("Student(String major) called");
		this.major = major;
	}
	
	public Student(String name, String major){
		super(name);
		this.major = major;   //this(major)은 안된다  왜??? super도 this도 첫번째에 위치해야하기 때문에 충돌한다.
	//  setName(name);
		System.out.println("Student(String name, String major) called");
	}
	
	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}



}
