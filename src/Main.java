import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParser;
import gamePackages.Territory;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static gamePackages.CrudHelpers.createTerritory;


public class Main {
    public static ArrayList<ArrayList<Territory>> gameSessions = new ArrayList<>();
    public static ArrayList<Territory> territories = new ArrayList<>();
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the game backend...\n");
        System.out.println("Creating game territories ....\n");
        while (true) {

            Territory newTerritory = createTerritory();
            System.out.println("\nCreating Settlements of " + newTerritory.getName() + "...");
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
                int[] choices = { 0, 1, 2, 3, 4 };
                if (List.of(choices).contains(settlementInput)) {
                    System.out.println(MessageFormat.format("Add another Settlement in {0} ?: Yes(Y) / No(N)", newTerritory.getName()));
                    String addTools = input.next();
                    if (addTools.equalsIgnoreCase("no") || addTools.equalsIgnoreCase("n")) {
                        break;
                    }
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

        gameSessions.add(territories);
        String outPut = new GsonBuilder().setPrettyPrinting().create().toJson(JsonParser.parseString(new Gson().toJson(territories)));
        System.out.println(outPut);

    }


}