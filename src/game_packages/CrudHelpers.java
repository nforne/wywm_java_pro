package game_packages;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParser;
import org.apache.commons.lang3.math.NumberUtils;

import java.text.MessageFormat;
import java.util.*;

import static java.lang.Integer.parseInt;

public class CrudHelpers {
    public static String userInput(Scanner sc, String toBeCollected, boolean stringOrNumber){
        /* method to collect and validate user input before use */
        String output = "";
        while (output.equals("")){
            try {
                System.out.println(MessageFormat.format("Enter {0}", toBeCollected));
                output = sc.nextLine();
                char c = output.charAt(0);
                if (output.length() > 0
                        && ((((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) && stringOrNumber)
                        || (NumberUtils.isCreatable(output) && !stringOrNumber))){
                    break;
                }  else {
                    output = "";
                }
            }
            catch (Exception e) {
                output = "";
                System.out.println(e);
            }
        }
        return output;
    }

    public static void jsonPrettyPrint(ArrayList<Territory> territories) {
        /* to legibly print the created territories to the console */
        String json = new Gson().toJson(territories);
        String outPut = new GsonBuilder().setPrettyPrinting().create().toJson(JsonParser.parseString(json));
        System.out.println("This is/are the territory(ies) ... ");
        System.out.println(outPut);
    }


    public static void createTerritories() {
        Scanner input = new Scanner(System.in);
        System.out.println("\nWelcome to the game backend...\n");
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

        gameSessions.add(getTerritories());

        jsonPrettyPrint(getTerritories());
    };

    private static ArrayList<Territory> territories = new ArrayList<>();
    private static ArrayList<ArrayList<Territory>> gameSessions = new ArrayList<>();
    public static ArrayList<Territory> getTerritories() {
        return territories;
    }
    public static void setTerritories(ArrayList<Territory> territories) {
        CrudHelpers.territories = territories;
    }

    public static ArrayList<ArrayList<Territory>> getGameSessions() {
        return gameSessions;
    }
    public static void setGameSessions(ArrayList<ArrayList<Territory>> gameSessions) {
        CrudHelpers.gameSessions = gameSessions;
    }

    private static Map<String, String> nationalOccupationCodes = new HashMap<>();
    private static String setNOCs(Map<String, String> noc, String profession){
        /* To auto generate national occupation classification codes */
        String NOC = "";
        for ( String nocCode : noc.keySet()){
            if (noc.get(nocCode).equalsIgnoreCase(profession)) {
                NOC = nocCode;
                break;
            }
        }
        if (NOC.equals("")) {
            while(true) {
                int digitsCode = new Random().nextInt(100000, 900000);
                NOC = String.valueOf(profession.charAt(0)) + String.valueOf(digitsCode);
                if (!noc.keySet().contains(NOC)) {
                    nationalOccupationCodes.put(NOC, profession);
                    break;
                }
            }
        }

        return NOC;
    }
    public static Territory createTerritory(){
        System.out.println("Creating Territory ...");
        Scanner input = new Scanner(System.in);

        String name = userInput(input, "Territory Name?: ", true);

        String size = userInput(input, "Territory Size: in square metres", false);

        String climate = "";
        while (true) {
            climate = userInput(input, "Territory Climate: Temperate or Tropical?", true);
            if(climate.equalsIgnoreCase("Temperate") || climate.equalsIgnoreCase("Tropical")) {
                break;
            } else {
                System.out.println("Please enter 'Tropical' or 'Temperate'");
            }
        }

        String tid;
        ArrayList<String> tIds = Territory.getTerritoryIds();
        if (tIds.size() == 0) {
            tid = String.valueOf(1000);
        } else {
            tid = String.valueOf(parseInt(tIds.get(tIds.size() - 1)) + 1);
        }
        String address = tid;
        Territory territory = new Territory(name, address, size, climate, tid);
        tIds.add(territory.getId());
        Territory.setTerritoryIds(tIds);

        return territory;
    }

    public static Village createVillage(Territory territory){
        System.out.println("Creating Village ...");
        Scanner vInput = new Scanner(System.in);

        String vid;
        ArrayList<String> vIds = territory.getVillagesIds();
        if (vIds.size() == 0){
            vid = "V100";
        } else {
            vid = "V" + (parseInt(vIds.get(vIds.size() - 1).substring(1)) + 1);
        }

        String vName = userInput(vInput, "Village Name?: ", true);

        String size = userInput(vInput, "Village size?: in square metres", false);

        System.out.println("\nAdding buildings to village! ...\n");
        System.out.println("Creating Buildings ...");
        ArrayList<Building> buildings = new ArrayList<>();
        createBuildings(territory.getAddress(), vid, buildings);

        Person chief = buildings.get(0).getOccupants().get(0);
        Building palace = buildings.get(0);

        Village village = new Village(vid, vName, buildings, chief, palace, size);
        vIds.add(village.getId());
        territory.setVillagesIds(vIds);

        return village;
    }

    public static  Town createTown(Territory territory) {
        System.out.println("Creating Town ...");
        Scanner tInput = new Scanner(System.in);

        String tid;
        ArrayList<String> tIds = territory.getTownsIds();
        if (tIds.size() == 0){
            tid = "T100";
        } else {
            tid = "T" + (parseInt(tIds.get(tIds.size() - 1).substring(1)) + 1);
        }

        String tName = userInput(tInput, "Town's Name?: ", true);

        String size = userInput(tInput, "Town size?: in square metres", false);

        System.out.println("\nAdding buildings to Town! ...\n");
        System.out.println("Creating Buildings ...");
        ArrayList<Building> buildings = new ArrayList<>();
        createBuildings(territory.getAddress(), tid, buildings);

        Person mayor = buildings.get(0).getOccupants().get(0);
        Building councilComplex = buildings.get(0);

        Town town = new Town(tid, tName, buildings, mayor, councilComplex, size);
        tIds.add(town.getId());
        territory.setTownsIds(tIds);

        return town;
    }

    public static  City createCity(Territory territory) {
        System.out.println("Creating City ...");
        Scanner cInput = new Scanner(System.in);

        String cid;
        ArrayList<String> cIds = territory.getCitiesIds();
        if (cIds.size() == 0){
            cid = "C100";
        } else {
            cid = "C" + (parseInt(cIds.get(cIds.size() - 1).substring(1)) + 1);
        }

        String cName = userInput(cInput, "City Name?: ", true);

        String size = userInput(cInput, "City size?: in square metres", false);

        System.out.println("\nAdding buildings to City! ...\n");
        System.out.println("Creating Buildings ...");
        ArrayList<Building> buildings = new ArrayList<>();
        createBuildings(territory.getAddress(), cid, buildings);

        Person cityMayor = buildings.get(0).getOccupants().get(0);
        Building cityCouncilComplex = buildings.get(0);

        City city = new City(cid, cName, buildings, cityMayor, cityCouncilComplex, size);
        cIds.add(city.getId());
        territory.setCitiesIds(cIds);

        return city;
    }

    public static  Metropolis createMetropolis(Territory territory) {
        System.out.println("Creating Metropolis ...");
        Scanner mInput = new Scanner(System.in);

        String mid;
        ArrayList<String> mIds = territory.getMetropolisIds();
        if (mIds.size() == 0){
            mid = "M100";
        } else {
            mid = "M" + (parseInt(mIds.get(mIds.size() - 1).substring(1)) + 1);
        }

        String mName = userInput(mInput, "Metropolis Name?: ", true);

        String size = userInput(mInput, "Metropolis size?: in square metres", false);

        System.out.println("\nAdding buildings to Metropolis! ...\n");
        System.out.println("Creating Buildings ...");
        ArrayList<Building> buildings = new ArrayList<>();
        createBuildings(territory.getAddress(), mid, buildings);

        Person governor = buildings.get(0).getOccupants().get(0);
        Building citadel = buildings.get(0);

        Metropolis metropolis = new Metropolis(mid, mName, buildings, governor, citadel, size);
        mIds.add(metropolis.getId());
        territory.setMetropolisIds(mIds);

        return metropolis;
    }

    public static void createBuildings(String territoryAddress, String settlementId, ArrayList<Building> buildings){
        while (true) {
            System.out.println(MessageFormat.format("\nCreate Building in {0}...", settlementId));
            Scanner buildingInput = new Scanner(System.in);

            String buildingName = userInput(buildingInput, "Building Name?: eg John's family residence, 5th SubDivision police station, etc", true);

            String type = userInput(buildingInput, "Building Type?: eg tent, hurt, bungalow, flat, story building, office complex, etc", true);

            String size = userInput(buildingInput, "Building size?: in square metres", false);

            int bid = buildings.size() == 0 ? 1 : buildings.size() + 1; // eg 10-V12-23 for territory # 10, village # 12, house # 23
            String buildingAddress = territoryAddress + "-" + settlementId + "-" + bid;

            System.out.println(MessageFormat.format("\nAssigning Occupants to {0} ...", buildingName));
            ArrayList<Person> occupants = new ArrayList<>();

            while (true) {
                System.out.println(MessageFormat.format("\nAdding Person to {0} ...", buildingName));
                Scanner personInput = new Scanner(System.in);

                String firstName = userInput(personInput, "Person's First name?: ", true);

                String lastName = userInput(personInput, "Person's Last name?: ", true);

                int age = parseInt(userInput(personInput, "Person's Age?: ", false));

                ArrayList<String> residence = new ArrayList<>();
                residence.add(buildingAddress);

                System.out.println(MessageFormat.format("\nCreating {0}'s professional profile ...\n", firstName));

                String occupation = userInput(personInput, MessageFormat.format("{0}'s Profession?: eg Knight, Blacksmith, Farmer", firstName), true);
                String code = setNOCs(nationalOccupationCodes, occupation);

                /* current title of person in the profession, title or rank or position , etc */
                String title = userInput(personInput, MessageFormat.format("Current title or rank of {0} in {1}?: ", firstName, occupation), true);

                String expertiseArea = userInput(personInput, MessageFormat.format("{0}'s Area of expertise in profession?: eg backend engineer", firstName), true);

                System.out.println("Tools or professional and rank identifying equipment?: ");
                ArrayList<String> tools = new ArrayList<>();
                System.out.println("-Adding tools ...");
                while (true) {
                    Scanner toolInput = new Scanner(System.in);

                    String tool = userInput(toolInput, "--Name of tool?: ", true);
                    tools.add(tool);

                    System.out.println("-Add another Tool?: Yes(Y) / No(N)");
                    String addTools = toolInput.next();
                    if (addTools.equalsIgnoreCase("no") || addTools.equalsIgnoreCase("n")) {
                        break;
                    }
                }

                Profession profession = new Profession(code, occupation, title, tools, expertiseArea);

                Person person = new Person(firstName, lastName, age, residence, profession);

                occupants.add(person);

                System.out.println(MessageFormat.format("Add another Person to {0}?: Yes(Y) / No(N)", buildingName));
                String addMore = personInput.next();
                if (addMore.equalsIgnoreCase("no") || addMore.equalsIgnoreCase("n")) {
                    break;
                }
            }

            Building building = new Building(bid, buildingName, type, size, buildingAddress, occupants);
            buildings.add(building);

            System.out.println(MessageFormat.format("Add another house to {0}?: Yes(Y) / No(N)", settlementId));
            String createMore = buildingInput.next();
            if (createMore.equalsIgnoreCase("no") || createMore.equalsIgnoreCase("n")) {
                break;
            }
        }
    }

}
