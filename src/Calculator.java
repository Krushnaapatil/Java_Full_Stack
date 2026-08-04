import java.util.Scanner;

public class Calculator {

    // 1. static method
    public static int addNumbers(int a, int b) {
        return a + b;
    }
    public static int subNumbers(int a, int b) {
        return a - b;
    }
    public static int multiNumbers(int a, int b) {
        return a * b;
    }

    // 2. An instance method
    public void printGreeting(String name) {
        System.out.println("Hello, " + name + "!");
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input A and B");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("SELECT Operation \n 1.add \n 2.sub \n 3.multi");
        int choice = sc.nextInt();
        // Calling the static method directly using the class name
        switch (choice){
            case 1:
                int sum = Calculator.addNumbers(10, 20);
                System.out.println("The sum is: " + sum);
                break;
            case 2:
                int sub = Calculator.subNumbers(10, 20);
                System.out.println("The sub is: " + sub);
                break;
            case 3:
                int mul = Calculator.multiNumbers(10, 20);
                System.out.println("The sum is: " + mul);
                break;
            default:
                System.out.println("worng choice");
        }



        // Calling the instance method requires creating an object first
        Calculator calcObject = new Calculator();
        calcObject.printGreeting("Alex");

    }
}
