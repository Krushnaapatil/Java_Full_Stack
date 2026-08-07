package Abstration;


abstract class FruitArt {
 private String realFruitName;

 public FruitArt(String realFruitName) {
     this.realFruitName = realFruitName;
 }

 public void displayInspiration() {
     System.out.println("Inspiration: A real-world " + realFruitName);
 }

 public abstract String getColor();
 public abstract String getShape();
 public abstract void displayArt();
}


class Orange extends FruitArt {
 public Orange() {
     super("Orange");
 }

 @Override
 public String getColor() { return "Orange"; }

 @Override
 public String getShape() { return "Small Circuar"; }

 @Override
 public void displayArt() {
     System.out.println(" [" + getShape() + "] painted in [" + getColor() + "]");
 }
}

class Watermelon extends FruitArt {
 public Watermelon() {
     super("Watermelon");
 }

 @Override
 public String getColor() { return "Red and Green"; }

 @Override
 public String getShape() { return "Sharp Circular"; }

 @Override
 public void displayArt() {
     System.out.println(" [" + getShape() + "] using lines of [" + getColor() + "]");
 }
}


public class SimpleAbstractEx {

	public static void main(String[] args) {
		FruitArt[] gallery = { new Orange(), new Watermelon() };

        for (FruitArt piece : gallery) {
            piece.displayInspiration(); 
            piece.displayArt();         
            System.out.println();    
        }
	}

}
