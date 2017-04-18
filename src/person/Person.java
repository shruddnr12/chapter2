package person;

public class Person {
	private String name;
	
	public Person(){
		System.out.println("Person() called");	
	}
	
	public Person(String name)
	{
		System.out.println("Person(String name) called");
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
