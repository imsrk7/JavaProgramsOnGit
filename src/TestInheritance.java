class animal{

	void eat() {
		System.out.println("Dog is Eating");
	}
}

class Dog extends animal{
	void bark() {
		System.out.println("Dog is barking");
	}
}
public class TestInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog d = new Dog();
		d.eat();
		d.bark();
	}

}
