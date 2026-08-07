package Abstration;

abstract class Animal {
	abstract void makeSound();
	void eat() {
		System.out.println("Animal is Eating");
	}
}

public class AnimalSound {

	public static void main(String[] args) {
		Animal dogAnimal = new Animal() {
			
			@Override
			void makeSound() {
				System.out.println("Dog Sound : Bark Bark");
			}
		};
		
		dogAnimal.eat();
		dogAnimal.makeSound();
	}

}
