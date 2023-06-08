package org.bridgelabz;

import java.util.Scanner;

/*A perfect number in Java is a positive integer that is equal to the sum of
its proper positive divisors excluding the number itself.
For example, the divisors of 6 are 1, 2 and 3.
The sum of the proper divisors of 6 is 1 + 2 + 3 = 6, which is a perfect number.*/
public class PerfectNumber {
    public static void main(String[] args) {
        int n, sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        n = input.nextInt();
        int i = 1;
        while (i <= n / 2) {  //executes until the condition becomes false
            if (n % i == 0) {
                sum = sum + i;  //calculates the sum of factors
            } //end of if
            i++;  //after each iteration, increments the value of variable i by 1
        } //end of while
        if (sum == n) {  //compares sum with the number
            System.out.println(n + " is a perfect number.");  //prints if sum and n are equal
        } else
            System.out.println(n + " is not a perfect number.");  //prints if sum and n are not equal
    }
}