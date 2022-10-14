package Programming.Projects;

import java.util.Scanner;

public class Game_Random_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("::WELCOME::");
        int num;
        String stop;
        do {
            int ran = (int) (Math.random() * 100);
            System.out.println("======================================");
            System.out.println("Cheak: Your number == Random number");
            System.out.println("======================================");
            int tryTime = 0;
            do {
                System.out.print("Enter number to cheak : ");
                num = input.nextInt();
                tryTime++;
                if (ran > num) {
                    System.out.println("         Error!!!\n Your number is small than Random number.");
                } else if (ran < num) {
                    System.out.println("           Error!!!\n Your number is greater than Random number");
                }
                if (num == ran) {
                    System.out.println("WOW- - -Correct");
                    System.out.println(tryTime);
                } else {
                    System.out.println("            Try again");
                }
            } while (num != ran);
            System.out.println("Press (Any key) for continue & Press (Y) for leave.");
            stop = input.next();
        } while (!stop.equals("Y") && !stop.equals("y"));
    }
}
