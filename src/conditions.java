public class conditions {
    static void main() {
        //if
        int speed = 60;
        if (speed > 50) {
            System.out.println("Slow down!");
        }

        //if-else
        int age = 16;
        if (age >= 18)
            System.out.println("Eligible to vote.");
        else
            System.out.println("Not eligible to vote.");
            System.out.println("Not eligible to vote.");
            System.out.println("Not eligible to vote.");

        //if-elseif-else
        int score = 85;
        if (score >= 90) {
            System.out.println("Grade A");
        } else if (score >= 80) {
            System.out.println("Grade B"); // This will execute
        } else {
            System.out.println("Grade C");
        }


        int marks = 99;
        if(marks <=100 && marks>=90)
            System.out.println("A+");
        else if (marks <90 && marks>=80)
            System.out.println("A");
        else if (marks <80 && marks>=70)
            System.out.println("B+");
        else if (marks <70 && marks>=60)
            System.out.println("B");
        else if (marks < 60 && marks>=45)
            System.out.println("C");
        else
            System.out.println("FAIL");


        if (true && false)
            System.out.println("Eligible to vote.");
        else
            System.out.println("Not eligible to vote.");

        //ternary
        int time = 20;
        String result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result);

        //switch
        int day = 3;
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            default -> System.out.println("Invalid day");
        }

        //bitwise opreator
        System.out.println(2 & 4);
            //bitwise & 2 - 010
            //          4 - 100
            //        ans - 000
        System.out.println(2 & 2);
        //bitwise & 2 - 010
        //          2 - 010
        //        ans - 010
        System.out.println(2 | 4);
        //bitwise | 2 - 010
        //          4 - 100
        //        ans - 110 // 6
        System.out.println(2 | 2);
        //bitwise | 2 - 010
        //          2 - 010
        //        ans - 010 // 2
        //shift operator
        System.out.println(2<<4);
        //010 -> 0100000 shift to left (add 4 zero's to right)
        System.out.println(3>>2);
        //011 -> 0 shift to rigth
        System.out.println(4<<2);
        //100 -> 10000

        //incremental type
        //pre-ince and post-ince
        int pre = 10;
        System.out.println(pre++ + " " + ++pre + " " + pre++);
        //decremental type
        //pre-dece and post-dece
        int dcre = 10;
        System.out.println(dcre-- + " " + --dcre + " " + dcre--);
    }
}
