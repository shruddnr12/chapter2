package person;

public class PersonTest {

	public static void main(String[] args) {
			Person p2 = new Student("CS");
		Person p3 = new Student("노경욱", "CS");
		
	
		//up casting (암시적)
		Student s =  new Student();
		Person p = s;  // Person p =(Person)new Student(); -> 이렇게 안해 줘도 된다.
		p.setName("둘리");

		
		//down casting (명시적)
		Student s2 = (Student)p;
		s.setMajor("CS");
		
		((Student)p).setMajor(""); // 변수 지정없이 한번만 사용.
		
		
	}

}
