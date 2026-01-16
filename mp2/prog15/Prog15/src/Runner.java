
public class Runner {
	public static void main(String[] args) {
		Cat c = new Cat("Kitty");
		Dog d = new Dog("Puppy");
		Pet p = new Dog("Mr Dog");
		Animal a = new Animal("Animal");
		Lion l = new Lion("Mufasa");
		Animal al = new Lion("Simba");
		
		System.out.println("c: " + c);
		System.out.println("d: " + d);
		System.out.println("p: " + p);
		System.out.println("a: " + a);
		System.out.println("l: " + l);
		System.out.println("al: " + al);
		
		System.out.println("c:");
		c.eat();
		c.speak();
		System.out.println();
		
		System.out.println("d:");
		d.eat();
		d.speak();
		System.out.println();
		
		System.out.println("p:");
		p.eat();
		p.speak();
		System.out.println();
		
		System.out.println("a:");
		a.eat();
		a.speak();
		System.out.println();
		
		System.out.println("l:");
		l.eat();
		l.speak();
		System.out.println();
		
		System.out.println("al:");
		al.eat();
		al.speak();
		System.out.println();
		
		
		
	}
}
