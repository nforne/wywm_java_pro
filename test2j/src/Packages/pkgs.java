package Packages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class pkgs {

    public static void drawDiamonds(int number) {

        // Declaring and initializing variables
//            Scanner input = new Scanner(System.in);
//            System.out.println("Enter the size of the diamond: ");
//            int number = input.nextInt();

        // Outer loop 1
        for (int y = 1; y <= number; y++) {

            // Inner loop 1 print whitespaces
            for (int x = 1; x <= number - y; x++) {
                System.out.print(" ");
            }

            // Inner loop 2 prints star
            for (int z = 1; z <= y * 2 - 1; z++) {
                System.out.print("*");
            }

            // Ending line after each row
            System.out.println();
        }

        // Outer loop 2
        for (int y = number-1; y > 0; y--) {

            // Inner loop 1 print whitespaces
            for (int x = 1; x <= number - y; x++) {
                System.out.print(" ");
            }

            // Inner loop 2 prints star
            for (int z = y * 2 - 1; z > 0; z--) {
                System.out.print("*");
            }

            // Ending line after each row
            System.out.println();
        }

    }

    public static void menuja() {
        Scanner choice = new Scanner(System.in);

        boolean exit = false;
        while (!exit) {
            System.out.println("   --Menu---------");
            System.out.println("1: --Hello World--");
            System.out.println("2: --Enter Name---");
            System.out.println("3: --Exit---------");
            System.out.println("   --Your choice?:");
            int input = choice.nextInt();
            switch (input) {
                case 1 -> System.out.println("Hello World \n\n");
                case 2 -> {
                    Scanner nsc = new Scanner(System.in);
                    System.out.println("What is your name please?");
                    String name = nsc.nextLine();
                    System.out.println("Hello " + (name.length() > 0 ? name : "World") + "\n");
                    nsc.close();
                }
                case 3 -> {
                    System.out.println("Exiting Program");
                    choice.close();
                    exit = true;
                }
                default -> System.out.println("Invalid selection, Please select an item from the menu");
            }

        }

    }

    public static void testj () {
        int[] marks = {65,132,95,125,116,110};
        Arrays.sort(marks);
        int max = marks[marks.length - 1];
        int min = marks[0];
        int median = marks.length % 2 == 0 ?  (marks[marks.length / 2] + marks[(marks.length / 2) - 1])/2 : marks[(marks.length - 1) / 2];

        System.out.println(Arrays.toString(marks));
        System.out.println("The highest score is " + max);
        System.out.println("The lowest score is " + min);
        System.out.println("The median score is " + median);

        char Ch = 'A';
        char ch = 'a';
        do{
            System.out.print((Ch + " "));
            System.out.print((ch + " "));
            Ch++;
            ch++;
        } while (Ch<='Z' && ch<='z');


        char num = 0;
        do{
            System.out.print((num + " "));
            num++;
        } while (num<= 10);

        Scanner input = new Scanner(System.in);

        System.out.println(("What is your age?: ") + " ");
        int age = input.nextInt();

        System.out.println(("What is your weight?: " + " "));
        int weight = input.nextInt();

        if (age > 18) {
            if (weight > 50) {
                System.out.println("You are eligible:");
            } else {
                System.out.println("You are ineligible on account of your weight");
            }
        } else {
            System.out.println("You are underage");
        }
        input.close();

    }

    public static double factoLoops(double number) {
        double facto = number;
        double i = number - 1;
        while (i > 0) {
           facto *= i;
           i--;
        }
        return facto;
    }

    public static int fibSeqLoops(int n) {
        ArrayList<Integer> fib = new ArrayList<>();
        fib.add(1); fib.add(1);
        if (n == 1 || n == 2) {
            return fib.get(0);
        } else if (n >= 3){
            for (int j = 3; j <= n; j++ ) {
                fib.add(fib.get(j-3) + fib.get(j-2));
            }
            return fib.get(fib.size() - 1);
        } else {
            System.out.println("The function can only take numbers greater than or equal to 1");
            return -1;
        }

    }

    public static int fibSeqRec(int n, int rankn, int fibn_1, int fibn_2) {
//      always start with fibn = 3, fibn_1 = 1 and fibn_2 = 1
        int outPut;
        if (n == 1 || n == 2) {
            outPut = 1;
        } else if (n >= 3) {
            int b = fibn_1 + fibn_2;
            if (rankn == n) {
                outPut = b;
            } else {
                outPut = fibSeqRec(n,rankn + 1, fibn_2, b);
            }
        } else {
            System.out.println("The function can only take numbers greater than or equal to 1");
            return -1;
        }

        return outPut;
    }

    public static void calculator(int a) {
        System.out.println("Welcome to the simple calculator!💬🌼");

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first operand - number(int): \n");
        int no1 = input.nextInt();

        System.out.println("  :What would you like to do with the number? \n  :Choose an operator please: \n");
        System.out.println("+ : --Addtion---------");
        System.out.println("- : --Subtraction-----");
        System.out.println("* : --Multiplication--");
        System.out.println("/ : --Division--------");
        System.out.println("    --Your choice?:");
        char operator = input.next().charAt(0);

        System.out.println("Enter the second operand - number(int): \n");
        int no2 = input.nextInt();

        if (operator == '+') {
            System.out.println("Result: " + String.valueOf(no1) + " " + String.valueOf(operator) + " " + String.valueOf(no2) + " " + "= " + String.valueOf(no1 + no2));
        } else if (operator == '-') {
            System.out.println("Result: " + String.valueOf(no1) + " " + String.valueOf(operator) + " " + String.valueOf(no2) + " " + "= " + String.valueOf(no1 - no2));
        } else if (operator == '*') {
            System.out.println("Result: " + String.valueOf(no1) + " " + String.valueOf(operator) + " " + String.valueOf(no2) + " " + "= " + String.valueOf(no1 * no2));
        } else if (operator == '/') {
            if (no2 == 0) {
                System.out.println("Division by zero is illegal!");
            } else {
                System.out.println("Result: " + String.valueOf(no1) + " " + String.valueOf(operator) + " " + String.valueOf(no2) + " " + "= " + String.valueOf(no1 / no2));
            }
        } else {
            System.out.println("Only operators +, -, * are / are allowed!");
        }

        input.close();
        System.out.println("\n");
    }

    public static void calculator(float a) {
        System.out.println("Welcome to the simple calculator!💬🌼");

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first operand - number(float):\n");
        float no1 = input.nextFloat();

        System.out.println("  :What would you like to do with the numbers? \n  :Choose an operator please: \n");
        System.out.println("+ : --Addtion---------");
        System.out.println("- : --Subtraction-----");
        System.out.println("* : --Multiplication--");
        System.out.println("/ : --Division--------");
        System.out.println("    --Your choice?:");
        char operator = input.next().charAt(0);

        System.out.println("Enter the second operand - number(int): \n");
        float no2 = input.nextFloat();

        if (operator == '+') {
            System.out.println("Result: " + String.valueOf(no1) + " " + String.valueOf(operator) + " " + String.valueOf(no2) + " " + "= " + String.valueOf(no1 + no2));
        } else if (operator == '-') {
            System.out.println("Result: " + String.valueOf(no1) + " " + String.valueOf(operator) + " " + String.valueOf(no2) + " " + "= " + String.valueOf(no1 - no2));
        } else if (operator == '*') {
            System.out.println("Result: " + String.valueOf(no1) + " " + String.valueOf(operator) + " " + String.valueOf(no2) + " " + "= " + String.valueOf(no1 * no2));
        } else if (operator == '/') {
            if (no2 == 0) {
                System.out.println("Division by zero is illegal!");
            } else {
                System.out.println("Result: " + String.valueOf(no1) + " " + String.valueOf(operator) + " " + String.valueOf(no2) + " " + "= " + String.valueOf(no1 / no2));
            }
        } else {
            System.out.println("Only operators +, -, * are / are allowed!");
        }

        input.close();
        System.out.println("\n");
    }

}