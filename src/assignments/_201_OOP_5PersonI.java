package assignments;

public class _201_OOP_5PersonI {
	public static void main(String[] args) {
		Person person = new Person();

		System.out.println(person.getFirstName());
		System.out.println(person.getLastName());
		System.out.println(person.getAge());
		System.out.println(person.toString());

		person.setFirstName("John");
		person.setLastName("Doe");
		person.setAge(44);

		System.out.println(person.toString());

		Person person2 = new Person("Fatima", "Lee", 22);

		System.out.println(person2.getFirstName());
		System.out.println(person2.getLastName());
		System.out.println(person2.getAge());
		System.out.println(person2.toString());
	}
}

class Person {
	//encapsulation
	private String firstName;
	private String lastName;
	private int age;

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public String toString() {
		return firstName + " | " + lastName + " | " + age;
	}

	public Person() {
		firstName = "undefined";
		lastName = "undefined";
		age = -1;
	}

	public Person(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
}
