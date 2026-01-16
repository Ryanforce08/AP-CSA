
public class Animal {
	
	private String name;
	
	public Animal(String n) {
		name = n;
	}
	
	public void speak() {
		System.out.println("I am an animal so i cannot speak");
	}
	public void eat() {
		System.out.println("Yummy");
	}
	
	@Override
	public String toString() {
		return "Name: " + name;
	}
	
}


