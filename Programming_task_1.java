package PokerStars_FTC;

import java.util.Scanner;

public class Programming_task_1 {
    public static void main(String[] args) {

        /*
        Write a program that takes 10 integer inputs from the user and prints the following:
            •	Number of odd numbers
            •	Number of even numbers
            •	Number of 0s
        Use your preferred programming language.
         */

        Scanner scanner = new Scanner(System.in);
        int counterOf0s = 0;
        int counterOfEvens = 0;
        int counterOfOdds = 0;
        int counter = 10;
        while (counter > 0) {
            System.out.println("Insert Integer number, please: ");
            String input = scanner.nextLine();
            try {
                int num = Math.abs(Integer.parseInt(input));

                if (num == 0) {
                    counterOf0s += 1;
                }
                else if (num % 2 == 0) {
                    counterOfEvens += 1;
                }
                else {
                    counterOfOdds += 1;
                }
            }

            catch (NumberFormatException e) {
                System.out.println(input + " is not a valid integer");
                counter++;
            }


            counter--;
        }
        System.out.printf("Number of odd numbers is %d\n", counterOfOdds);
        System.out.printf("Number of even numbers is %d\n", counterOfEvens);
        System.out.printf("Number of 0s is %d\n", counterOf0s);




    }
}
