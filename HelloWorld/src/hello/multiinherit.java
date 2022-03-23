package hello;

class Animal{
	void eat() {
		System.out.println("the animal eats");
	}
}

class Dog extends Animal{
	void sleep() {
		System.out.println("the dog sleeps");
	}
}

class BabyDog extends Dog{
	void bark() {
		System.out.println("the baby dog barks");
	}
}
public class multiinherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BabyDog bd = new BabyDog();
		bd.sleep();
		bd.bark();
		bd.eat();
	}

}
