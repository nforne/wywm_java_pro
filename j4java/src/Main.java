import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        String a = "the car is a volvo";
        String b = a.substring(4);
        System.out.println(b);
        
        //"hello world!"
        String example1 = a.toLowerCase();
        String example1R = example1.replaceAll("t", "+r");
        System.out.println(example1R);
        
        //"HELLO WORLD!"
        String example2 = a.toUpperCase();
        System.out.println(example2);

        ArrayList<String> students = new ArrayList<String>();
        students.add("Martin Nforne");
        students.add("Wessel Gansford");
        students.add("Carter Lystra");

        System.out.println(students);
        System.out.println(students.get(0));
        
        students.set(1, "Morgan West");
        System.out.println(students.get(1));
        students.remove(1);
        System.out.println(students.get(1));
        
        System.out.println(students.size());
        System.out.println(students);

        Scanner input = new Scanner(System.in);

        System.out.println("What is your name?: ");
        String name = input.nextLine();
        
        System.out.println("What is your age?: ");
        String age = input.nextLine();
        
        System.out.println("Hello " + name + "! You are of age " + age + "years");

        System.out.println("Name, please: ");
        String name2 = input.nextLine();
        System.out.println(name2);
        
        input.close();

        System.out.println("line1--------------------------------------------------");
        int[] array1 = new int[] {1, 2, 3, 4};
        System.out.println(array1);
        System.out.println("line1a--------------------------------------------------");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
        System.out.println("line1b--------------------------------------------------");
        for (Integer i : array1) {
            System.out.println(i);
        }

        System.out.println("line2--------------------------------------------------");
        int j = 0;
        while (j < 5) {
            System.out.println("a" + String.valueOf(j));
            j++;
        }

        

    }
}