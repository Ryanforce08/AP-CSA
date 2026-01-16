
public abstract class Pet {
	
	private String name;
	
	public Pet(String n) {
		name = n;
	}
	
	public abstract void speak();
	public abstract void eat();
}
