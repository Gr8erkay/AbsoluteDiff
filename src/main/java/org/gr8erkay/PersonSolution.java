package org.gr8erkay;

import java.util.*;

public class PersonSolution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN.

        Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of people you want to check: ");
        int num = scanner.nextInt();

        for (int i = 1; i <= num; i++){
            System.out.println("Enter the age of person no."+ i + ": ");
            int years = scanner.nextInt();

            Person person = new Person(years);
            person.amIOld();
            person.yearPasses();
            person.amIOld();
            System.out.println();
        }
    }
}
class Person {
    private int age;

    public Person(int initialAge) {
        if (initialAge < 0) {
            age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        } else {
            age = initialAge;
        }
    }

    public void yearPasses() {
        age += 3;
    }

    public void amIOld() {
        if (age < 13) {
            System.out.println("You are young.");
        } else if (age < 18) {
            System.out.println("You are a teenager.");
        } else {
            System.out.println("You are old.");
        }
    }
}