// package Programming.Projects;

import java.util.Scanner;

public class Game_Random_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("::WELCOME::");
        int num;
        String stop;
        do {
            // For check which tym you try and achieve.
            int length = 0;
            // for Random number
            int ran = (int) (Math.random() * 100);
            System.out.println("<======================================>");
            System.out.println("Check: Your number == Random number");
            System.out.println("<======================================>");
            do {
                length++;
                // Enter your number to check your number equal to random or not.
                System.out.print("Enter number to check : ");
                num = input.nextInt();
                if (ran > num) {
                    System.out.println("         Error!!!\n Your number is small than Random number.");
                } else if (ran < num) {
                    System.out.println("           Error!!!\n Your number is greater than Random number");
                }
                if (num == ran) {
                    System.out.println(" @ WOW- - -Correct @");
                    System.out.println(length + " Time you try and you done it.");
                } else {
                    System.out.println("            Try again");
                }
            } while (num != ran);
            // For restart GAME..
            System.out.println("Press (Any key) for continue & Press (Y) for leave.");
            stop = input.next();
        } while (!stop.equals("Y") && !stop.equals("y") );
    }
}
