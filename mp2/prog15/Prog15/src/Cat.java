
public class Cat extends Pet implements Eat{
	
	private String name;
	
	public Cat(String n) {
		super(n);
		name = n;
	}
	
	public void speak() {
		System.out.println("meow");
	}
	public void eat() {
		System.out.println("i eated fish");
	}
	
	@Override
	public String toString() {
		return "Name: " + name;
	}
}
