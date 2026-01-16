
public class Lion extends Animal implements Eat{
	
	private String name;
	
	public Lion(String n) {
		super(n);
		name = n;
	}
	
	public void speak() {
		System.out.println("Roar");
	}
	public void eat() {
		System.out.println("i eated chita");
	}
	
	@Override
	public String toString() {
		return "Name: " + name;
	}
}
