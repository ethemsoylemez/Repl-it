package assignments;

public class _225_OOP_17Dog {
	public static void main(String[] args) {
		
		Dog myDog = new Dog("Quco", 3, "karabas");
		System.out.println(myDog.toString());
		System.out.println(myDog.equals(myDog));

	}
}

abstract class Animal {

	private String name;
	private int age;
	
	public Animal(String name, int age) {
		setName(name);
		setAge(age);
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public abstract int getAgeInHumanYears();

	
}

class Dog extends Animal {

	private String breed;
	int humanYears;

	public Dog(String name, int age, String breed) {
		super(name, age);
		setBreed(breed);
	}
	
	  public void setBreed(String breed){
		    this.breed = breed;
		  }
		  public String getBreed(){
		    return breed;
		  }

	public String toString() {
		return "Name: " + getName() + "\nBreed: " + breed + "\nAge in calendar years: " + getAge()
				+ "\nAge in human years: " + getAgeInHumanYears();
	}

	public int getAgeInHumanYears() {
		if (getAge() <= 2) {
			humanYears = getAge() * 11;
		} else {
			humanYears = 22 + ((getAge() - 2) * 5);
		}
		return humanYears;
	}

	@Override
	public boolean equals(Object other) {
		Dog that = (Dog) other;
		if (this.getName().equals(that.getName()) && this.getAge()==that.getAge()
				&& this.breed.equals(that.breed)) {
			return true;
		} else {
			return false;
		}
	}

}
