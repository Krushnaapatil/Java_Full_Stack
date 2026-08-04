import java.util.Scanner;

public class AtmManagementSystem {
    static void main() {
        int pincode = 124124;
        int amount = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Pin :");
        int userPin = sc.nextInt();
        if (userPin != pincode)
            System.out.println("Enter Correct Pin******");
        System.out.println();

        int choice = 0;
        while(choice!=5){
            System.out.println("Enter Choice : \n 1. Check Balance \n 2. Deposite Amount \n 3. WithDraw Amount \n 4. Change Pincode \n 5. EXIT");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Total Balance : " + amount);
                    break;
                case 2:
                    System.out.println("Enter Deposite Amount : ");
                    int deposite = sc.nextInt();
                    amount += deposite;
                    System.out.println("Total Balance : " + amount);
                    break;
                case 3:
                    System.out.println("Enter Amount To Withdraw :");
                    int withdrawA = sc.nextInt();
                    if (withdrawA<amount) {
                        amount -= withdrawA;
                        System.out.println("Total Balance Left:" + amount);
                    }else {
                        System.out.println("Withdraw Amount is Greater than your Balance****");
                    }
                    break;
                case 4:
                    System.out.println("Enter New Pin :");
                    int NewPin = sc.nextInt();
                    pincode = NewPin;
                    System.out.println("Pincode Changed*");
                    break;
                case 5:
                    System.out.println("EXITTTTTT");
                    break;

            }
        }

    }
}
