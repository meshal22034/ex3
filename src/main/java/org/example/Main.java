
package org.example;

import java.util.Scanner;

public class Main {
    static void main() {

        /*
        استخدم الفور للارقام
         */
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter s ");

//        System.out.println("Enter e");

        for (int s =1; s <= 100; s++) {

            if (s % 3 == 0 && s % 5 == 0) {
                System.out.println("FizzBuzz");

            } else if (s % 3 == 0) {

                System.out.println("Fizz");
            } else if (s % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(s);
            }
        }
//      /*
//      2.Write a Java program to reverse a string.
//Test Data: Input a string: The quick brown fox Expected Output: Reverse
//string: xof nworb kciuq ehT  */
//
//
        System.out.println("The quick brown fox ");
        String data = sc.nextLine();

        for (int i = data.length() - 1; i >= 0; i--) {

            System.out.print(data.charAt(i));
        }




        /*
        Write a program to find the factorial value of any number entered
through the keyboard. اضافة شرط لليوزر يتاكد سالب او لا
*/
        System.out.println("enter number");

        int number = sc.nextInt();
        if (number < 0){
            System.out.println("the entered number is negtive");

        } else {
            int factorial = 1;
            for (int i = 1; i <= number; i++) {

                factorial *= i;
            }
            System.out.println("The factorial for" + number + "==>" + factorial);
        }
/*
Two numbers are entered through the keyboard. Write a program to find the value of one number raised to the power
of another. (Do not use Java built-in method)
 */
        System.out.println("enter tow numbers");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int result = 1;
        for (int i = 1; i <= n2; i++) {

            result = result * n1;
        }
        System.out.println(n1 + " ^ " + n2 + " = " + result);


        /*
        .Write a program that reads a set of integers, and then prints the sum of
the even and odd integers.
         */
        System.out.println("enter number ");
        int st = sc.nextInt();

        System.out.println("enter number ");
        int en = sc.nextInt();

        int evenSum = 0;
        int oddSum = 0;

        for (int i = st; i <= en; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            } else {
                oddSum += i;
            }
        }
        System.out.println(evenSum);
        System.out.println(oddSum);

        /*
        Write a program that prompts the user to input a positive integer. It
should then output a message indicating whether the number is a prime
number.
         */

        System.out.println("enter number");
        int n = sc.nextInt();

        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");


        }

         /*
    Use a for loop to print headings for four weeks (Weeks 1 - 4). Then use
another for loop to print the days (Days 1 -7) for each week. */

        System.out.println("enter number of weeks");
        int weeks = sc.nextInt();
        for (int i = 1; i <= weeks; i++) {
            System.out.println("Week " + i);
            for (int j = 1; j <= 7; j++) {
                System.out.println("day " + j);
            }
        }
        /*
        Write a program thats check if the word is a palindrome or not. hint: A
string is said to be a palindrome if it is the same if we start reading it from
left to right or right to left.
         */
        System.out.println("Enter word");
        String word = sc.nextLine();
        String reverse = "";
        for (int i = word.length() - 1; i >= 0; i--) {

            System.out.print(word.charAt(i));
            reverse = reverse + word.charAt(i);
        }
        if (word.equals(reverse)) {
            System.out.println(" ==> Palindrome");
        } else {
            System.out.println(" ==> Not Palindrome");
        }


    }

}