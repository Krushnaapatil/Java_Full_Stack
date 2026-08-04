public class loops {
    static int a;
    static void main() {
//        for (int i = 1; i <= 5; i++) {
//            System.out.println("Count: " + i);
//        }

        for (int i = 1; i <= 5; i++) {
            if(i%2==0) {
                System.out.println("Count: " + i);
            }
        }

        int j = 0;
        while (j<5){
            System.out.print(j +  " ");
            j++;
        }


        //do-while
        int i = 1;
        do {
            System.out.print("Count: " + i + " ");
            i++;
        } while (i <= 5);

        System.out.println();



        int[] numbers = {10, 20, 30};
        for (int num : numbers) {
            System.out.println("Number: " + num);
        }



        //fizz bizz problem
        int num = 0;
        while(num < 10){
            if(num%2==0 && num%4==0){
                System.out.println("FIZZBUZZ");
            } else if (num%2==0) {
                System.out.println("BUZZ");
            } else if (num%4==0) {
                System.out.println("FIZZ");
            } else{
                System.out.println(num);
            }
            num++;
        }


        //reverse
        int oNum = 122235;
        int rNumber = 0;
        while (oNum>0){
            int lastDigit = oNum % 10;                  // Extract the last digit
            rNumber = (rNumber * 10) + lastDigit; // Build reversed number
            oNum = oNum / 10;
        }
        System.out.println(rNumber);


        //palindrom
        int orginal = 1221;
        int temp = orginal;
        int reversedNumber = 0;
        while (temp>0){
            int lastDigit = temp % 10;                  // Extract the last digit
            reversedNumber = (reversedNumber * 10) + lastDigit; // Build reversed number
            temp = temp / 10;
        }

        if (orginal == reversedNumber){
            System.out.println("palindrome");
        }else {
            System.out.println("Not palindrome");
        }

//        int a;
        System.out.println(a);
    }
}
