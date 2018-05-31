package com.company;
import java.util.Scanner;
public class SomethingAboutYou {

    public static void main(String[] args) {
	// write your code here
        Scanner sc= new Scanner(System.in);
        String firstName;
        int age;
        float height;
        double gpa;

        System.out.println ("what is your first name ?");
        firstName= sc.next();

        System.out.println ("How old are you ?");
        age= sc.nextInt();

        System.out.println ("How tall are you");
        height= sc.nextFloat();

        System.out.println ("what is your GPA ?");
        gpa= sc.nextDouble();

        System.out.println("name " + firstName +"height"  + height + "age" + age + "gpa" + gpa );
    }
}
