
import java.util.Scanner;

public class assignmentOne {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // 1. Print Hello, World!
	        // System.out.println("Hello, World!");

	        // 2. Take Name and Age as input and print them
	        // System.out.print("Enter your name: ");
	        // String name = sc.nextLine();
	        // System.out.print("Enter your age: ");
	        // int age = sc.nextInt();
	        // System.out.println("Name: " + name + ", Age: " + age);

	        // 3. Take User ID and print Jake's name & age if ID matches
	        // System.out.print("Enter User ID: ");
	        // int id = sc.nextInt();
	        // if (id == 101) {
	        //     System.out.println("Jake, Age: 25");
	        // } else {
	        //     System.out.println("User not found.");
	        // }

	        // 4. Take Age, increment by 1, and print
	        // System.out.print("Enter your age: ");
	        // int age = sc.nextInt();
	        // System.out.println("Next year you'll be: " + (age + 1));

	        // 5. Find the largest of three numbers
	        // System.out.print("Enter three numbers: ");
	        // int a = sc.nextInt();
	        // int b = sc.nextInt();
	        // int c = sc.nextInt();
	        // int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
	        // System.out.println("Largest is: " + max);

	        // 6. Add 2 and 3 and print result
	        // int sum = 2 + 3;
	        // System.out.println("Sum is: " + sum);

	        // 7. Take two numbers, add, and print
	        // System.out.print("Enter two numbers: ");
	        // int x = sc.nextInt();
	        // int y = sc.nextInt();
	        // System.out.println("Sum is: " + (x + y));

	        // 8. Take two numbers, multiply, and print
	        // System.out.print("Enter two numbers: ");
	        // int m = sc.nextInt();
	        // int n = sc.nextInt();
	        // System.out.println("Product is: " + (m * n));

	        // 9. Take two numbers, subtract, and print
	        // System.out.print("Enter two numbers: ");
	        // int s1 = sc.nextInt();
	        // int s2 = sc.nextInt();
	        // System.out.println("Difference is: " + (s1 - s2));

	        // 10. Convert Fahrenheit to Celsius
	        // System.out.print("Enter temperature in Fahrenheit: ");
	        // double f = sc.nextDouble();
	        // double c = (f - 32) * 5 / 9;
	        // System.out.println("Celsius: " + c);

	        // 11. Area and Circumference of Circle
	         System.out.print("Enter radius: ");
	         double r = sc.nextDouble();
	         double area = Math.PI * r * r;
	         double circumference = 2 * Math.PI * r;
	         System.out.println("Area: " + area);
	         System.out.println("Circumference: " + circumference);

	        sc.close();
	    }
	}


