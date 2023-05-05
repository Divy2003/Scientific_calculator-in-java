import java.util.Scanner;
import java.lang.Math;

public class Scientific_Calculator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double result;
    System.out.println("This is Scientific Calculator");

    while (true) {
      System.out.println(
          "\nSelect a number for operation operation \n1->arithmetic operation(+,-,*,/) ,\n2->exponatial(^),\n3->squreroot,\n4->cuberoot,\n5->trignomatric fn(sin,cos,ten),\n6->inverse trignomatric fn(sin^-1,cos^-1,ten^-1),\n7->log,\n8->ln(natural log),\n9->factroial ");
      String operation = sc.next();

      double num1, num2;

      switch (operation) {
        case "1":
          System.out.println("choose(write) a arithmetic operation: +,-,*,/ ");
          String inner = sc.next();

          if (inner.equals("+")) {
            System.out.print("Enter first number: ");
            num1 = sc.nextDouble();
            System.out.print("Enter second number: ");
            num2 = sc.nextDouble();
            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
          } else if (inner.equals("-")) {
            System.out.print("Enter first number: ");
            num1 = sc.nextDouble();
            System.out.print("Enter second number: ");
            num2 = sc.nextDouble();
            System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
          } else if (inner.equals("/")) {
            System.out.print("Enter first number: ");
            num1 = sc.nextDouble();
            System.out.print("Enter second number: ");
            num2 = sc.nextDouble();
            if (num2 == 0) {
              System.out.println("Error: Divide by zero");
            } else {
              System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
            }
          } else if (inner.equals("*")) {
            System.out.print("Enter first number: ");
            num1 = sc.nextDouble();
            System.out.print("Enter second number: ");
            num2 = sc.nextDouble();
            System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));

          }
          break;
        case "2":System.out.print("Enter base: ");
          num1 = sc.nextDouble();
          System.out.print("Enter exponent: ");
          num2 = sc.nextDouble();
          System.out.println(num1 + " ^ " + num2 + " = " + Math.pow(num1, num2));
          break;

        case "3":
          System.out.print("Enter a number to find its squre root: ");
          num1 = sc.nextDouble();
          System.out.println("sqrt(" + num1 + ") = " + Math.sqrt(num1));
          break;

        case "4":
          System.out.print("Enter a number to find its cube root: ");
          num1 = sc.nextDouble();
          System.out.println("cbrt(" + num1 + ") = " + Math.cbrt(num1));
          break;

        case "5":
          System.out.println("choose(write) a trignomatric fn: sin ,cos ,tan ");
          String inner1 = sc.next();

          if (inner1.equals("sin")) {
            System.out.println("Enter angle in degrees: ");
            num1 = sc.nextDouble();
            System.out.println("sin(" + num1 + ") = " + Math.sin(Math.toRadians(num1)));
          } else if (inner1.equals("cos")) {
            System.out.print("Enter angle in degrees: ");
            num1 = sc.nextDouble();
            System.out.println("cos(" + num1 + ") = " + Math.cos(Math.toRadians(num1)));

          } else if (inner1.equals("tan")) {
            System.out.print("Enter angle in degrees: ");
            num1 = sc.nextDouble();
            System.out.println("tan(" + num1 + ") = " + Math.tan(Math.toRadians(num1)));

          }
          break;

        case "6":
          System.out.println("choose(write) a inverse trignomatric fn: sin^-1 ,cos^-1 ,tan^-1 ");
          String inner2 = sc.next();

          if (inner2.equals("sin^-1")) {
            System.out.println("Enter angle in degrees: ");
            num1 = sc.nextDouble();
            System.out.println("sin-1(" + num1 + ") = " + Math.toDegrees(Math.asin(num1)));
          } else if (inner2.equals("cos^-1")) {
            System.out.print("Enter angle in degrees: ");
            num1 = sc.nextDouble();
            System.out.println("cos-1(" + num1 + ") = " + Math.toDegrees(Math.acos(num1)));

          } else if (inner2.equals("tan^-1")) {
            System.out.print("Enter angle in degrees: ");
            num1 = sc.nextDouble();
            System.out.println("tan-1(" + num1 + ") = " + Math.toDegrees(Math.atan(num1)));

          }
          break;
        case "7":
          System.out.print("Enter number: ");
          num1 = sc.nextDouble();
          System.out.println("log(" + num1 + ") = " + Math.log10(num1));
          break;

        case "8":
          System.out.print("Enter number: ");
          num1 = sc.nextDouble();
          System.out.println("ln(" + num1 + ") = " + Math.log(num1));
          break;

        case "9":
          System.out.print("Enter a number to find its factorial: ");
          int n = sc.nextInt();
         
          result = factorial(n);
          System.out.println(n + "! = " + result);
          break;
        default:
          System.out.println("Invalid operation. Please try again.");
          System.exit(0);
      }
    }
  }

  public static double factorial(int n) {
    double result = 1.0;

    for (int i = 1; i <= n; i++) {
        result *= i;
    }

    return result;
}
}
/*
  made by-
  Divy patel-IU2141230167
  
 */
