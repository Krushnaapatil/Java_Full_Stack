package InterfacesEx;

interface Fruit {
 String getColor();
 String getBasicShape();
 void render();
}


class Apple implements Fruit {
 @Override
 public String getColor() { return "Red"; }

 @Override
 public String getBasicShape() { return "Cube like shape"; }

 @Override
 public void render() {
     System.out.println("() Drawing a " + getColor() + " " + getBasicShape() + " to represent an apple.");
 }
}

class Banana implements Fruit {
 @Override
 public String getColor() { return "Yellow"; } 

 @Override
 public String getBasicShape() { return "long bend pip"; }

 @Override
 public void render() {
     System.out.println(") Rendering a " + getColor() + " " + getBasicShape() + " to represent a banana.");
 }
}

public class FruitInterface {

	public static void main(String[] args) {
		        System.out.println("--- Fruit Exhibition ---");
		        
		        Fruit appleArt = new Apple();
		        Fruit bananaArt = new Banana();
		        
		        appleArt.render();
		        bananaArt.render();
	}

}
