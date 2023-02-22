import gamePackages.Territory;

import java.util.ArrayList;
import java.util.Scanner;

import static gamePackages.CrudHelpers.createTerritory;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Creating territories ....");
        ArrayList<Territory> territories = new ArrayList<>();
        while (true) {

            Territory newTerritory = createTerritory();
            newTerritory.addVillages();
            newTerritory.addTowns();
            newTerritory.addCities();
            newTerritory.addMetropolis();

            territories.add(newTerritory);

            System.out.println("Add another territory?: Yes(Y) / No(N)");
            String addTools = input.nextLine();
            if (addTools.equalsIgnoreCase("no") || addTools.equalsIgnoreCase("n")) {
                input.close();
                break;
            }
            input.close();
        }
        System.out.println(territories);
    }
}