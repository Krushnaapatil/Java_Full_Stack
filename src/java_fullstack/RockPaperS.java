package java_fullstack;

import java.util.Random;
import java.util.Scanner;

public class RockPaperS {
	
	

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        	System.out.print("Enter rock, paper, or scissors: ");
            String player = scanner.next().toLowerCase(); 
            
            String computer = getComputerChoice();
            System.out.println("Computer chose: " + computer);
            
            if (player.equals(computer)) {
                System.out.println("It's a tie!");
            } 
            else if ((player.equals("rock") && computer.equals("scissors")) ||
                     (player.equals("paper") && computer.equals("rock")) ||
                     (player.equals("scissors") && computer.equals("paper"))) {
                System.out.println("You win!");
            }
            else {
                System.out.println("Computer wins!");
            }
        scanner.close();
    }

    public static String getComputerChoice() {
        String[] options = {"rock", "paper", "scissors"};
        Random random = new Random();
        int index = random.nextInt(3);
        return options[index];
    }
}

