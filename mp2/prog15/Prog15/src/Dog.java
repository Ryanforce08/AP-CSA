
public class Dog extends Pet implements Eat{
	
	private String name;
	
	public Dog(String n) {
		super(n);
		name = n;
	}
	
	public void speak() {
		System.out.println("bark");
	}
	public void eat() {
		System.out.println("i eated meat");
	}
	
	@Override
	public String toString() {
		return "Name: " + name;
	}
}
