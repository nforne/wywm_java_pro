import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the simple calculator!💬🌼");

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first operand - number(int):");
        int no1 = input.nextInt();

        System.out.println("Enter an operator: +, -, * and / are acceptable");
        char operator = input.next().charAt(0);

        System.out.println("Enter the second operand - number(int):");
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
        }

        input.close();
    }
}