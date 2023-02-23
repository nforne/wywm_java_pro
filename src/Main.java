import gamePackages.Territory;

import java.io.PrintStream;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Scanner;

import static gamePackages.CrudHelpers.createTerritory;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Creating territories ....\n");
        ArrayList<Territory> territories = new ArrayList<>();
        while (true) {

            Territory newTerritory = createTerritory();
            System.out.println("\nCreating Settlements of " + newTerritory.getName());
            while (true) {
                System.out.println(MessageFormat.format("What sort of settlement will you like to add in {0} at this time?: ", newTerritory.getName()));
                System.out.println("1: a Village?");
                System.out.println("2: a Town?");
                System.out.println("3: a City?");
                System.out.println("4: a Metropolis?");
                System.out.println("0: None?");
                int settlementInput = input.nextInt();

                if (settlementInput == 1) newTerritory.addVillages();
                if (settlementInput == 2) newTerritory.addTowns();
                if (settlementInput == 3) newTerritory.addCities();
                if (settlementInput == 4) newTerritory.addMetropolis();
                if (settlementInput == 0) break;

                System.out.println(MessageFormat.format("Add another Settlement in {0} ?: Yes(Y) / No(N)", newTerritory.getName()));
                String addTools = input.next();
                if (addTools.equalsIgnoreCase("no") || addTools.equalsIgnoreCase("n")) {
                    break;
                }
            }

            territories.add(newTerritory);

            System.out.println("Add another territory?: Yes(Y) / No(N)");
            String addTools = input.next();
            if (addTools.equalsIgnoreCase("no") || addTools.equalsIgnoreCase("n")) {
                break;
            }
        }
        
        input.close();

        try {
            // Create a PrintStream instance
            PrintStream stream = new PrintStream(System.out);

            // print the object
            // to this stream using print() method
            // This will put the object in the stream
            // till it is printed on the console
            stream.print(territories);

            stream.flush();
        }
        catch (Exception e) {
            System.out.println(e);
        }

    }


}