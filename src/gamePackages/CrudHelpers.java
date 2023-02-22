package gamePackages;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

import static java.lang.Integer.parseInt;

public class CrudHelpers {
    public static Territory createTerritory(){
        System.out.println("Creating Territory ...");
        Scanner input = new Scanner(System.in);

        System.out.println("Territory Name: ");
        String name = input.nextLine();

        System.out.println("Territory Size: in square metres");
        String size = input.nextLine();

        System.out.println("Territory Climate: Temperate or Tropical?");
        String climate = input.nextLine();

        String tid;
        if (Territory.territoryIds.size() == 0) {
            tid = String.valueOf(1000);
        } else {
            tid = String.valueOf(parseInt(Territory.territoryIds.get(Territory.territoryIds.size() - 1)) + 1);
        }
        String address = tid;

        return new Territory(name, address, size, climate, tid);
    }

    public static Village createVillage(Territory territory){
        System.out.println("Creating Village ...");
        Scanner vInput = new Scanner(System.in);

        String vid;
        if (Territory.villageIds.size() == 0){
            vid = "V100";
        } else {
            vid = "V" + (parseInt(Territory.villageIds.get(Territory.villageIds.size() - 1).substring(1)) + 1);
        }

        System.out.println("Village Name?: ");
        String vName = vInput.nextLine();

        System.out.println("Creating Buildings ...");
        ArrayList<Building> buildings = new ArrayList<>();

        createBuildings(territory.address, vid, buildings);

        System.out.println("Village size?: in square metres");
        String size = vInput.nextLine();

        Person chief = buildings.get(0).occupants.get(0);
        Building palace = buildings.get(0);

        return new Village(vid, vName, buildings, chief, palace, size);
    }

    public static  Town createTown(Territory territory) {
        System.out.println("Creating Town ...");
        Scanner tInput = new Scanner(System.in);

        String tid;
        if (Territory.townsIds.size() == 0){
            tid = "T100";
        } else {
            tid = "T" + (parseInt(Territory.townsIds.get(Territory.townsIds.size() - 1).substring(1)) + 1);
        }

        System.out.println("Town's Name: ");
        String tName = tInput.nextLine();

        System.out.println("Creating Buildings ...");
        ArrayList<Building> buildings = new ArrayList<>();

        createBuildings(territory.address, tid, buildings);

        System.out.println("Town size?: in square metres");
        String size = tInput.nextLine();

        Person mayor = buildings.get(0).occupants.get(0);
        Building councilComplex = buildings.get(0);

        return new Town(tid, tName, buildings, mayor, councilComplex, size);
    }

    public static  City creatCity(Territory territory) {
        System.out.println("Creating City ...");
        Scanner cInput = new Scanner(System.in);

        String cid;
        if (Territory.citiesIds.size() == 0){
            cid = "C100";
        } else {
            cid = "C" + (parseInt(Territory.citiesIds.get(Territory.citiesIds.size() - 1).substring(1)) + 1);
        }

        System.out.println("City Name: ");
        String cName = cInput.nextLine();

        System.out.println("Creating Buildings ...");
        ArrayList<Building> buildings = new ArrayList<>();

        createBuildings(territory.address, cid, buildings);

        System.out.println("City size?: in square metres");
        String size = cInput.nextLine();

        Person cityMayor = buildings.get(0).occupants.get(0);
        Building cityCouncilComplex = buildings.get(0);

        return new City(cid, cName, buildings, cityMayor, cityCouncilComplex, size);
    }

    public static  Metropolis creatMetropolis(Territory territory) {
        System.out.println("Creating City ...");
        Scanner mInput = new Scanner(System.in);

        String mid;
        if (Territory.metropolisIds.size() == 0){
            mid = "M100";
        } else {
            mid = "M" + (parseInt(Territory.metropolisIds.get(Territory.metropolisIds.size() - 1).substring(1)) + 1);
        }

        System.out.println("Metropolis Name: ");
        String mName = mInput.nextLine();

        System.out.println("Creating Buildings ...");
        ArrayList<Building> buildings = new ArrayList<>();

        createBuildings(territory.address, mid, buildings);

        System.out.println("Metropolis size?: in square metres");
        String size = mInput.nextLine();

        Person governor = buildings.get(0).occupants.get(0);
        Building citadel = buildings.get(0);

        return new Metropolis(mid, mName, buildings, governor, citadel, size);
    }


    public static void createBuildings(String territoryAddress, String settlementId, ArrayList<Building> buildings){
        while (true) {
            System.out.println("Create Building ...");
            Scanner buildingInput = new Scanner(System.in);

            System.out.println("Building Name?: eg John's family residence, 5th SubDivision police station, etc");
            String buildingName = buildingInput.nextLine();

            System.out.println("Building Type?: eg tent, hurt, bungalow, flat, story building, office complex, etc");
            String type = buildingInput.nextLine();

            System.out.println("Building size?: in square metres");
            String size = buildingInput.nextLine();

            int bid = buildings.size() == 0 ? 1 : buildings.size() + 1; // eg 10-V12-23 for territory # 10, village # 12, house # 23
            String buildingAddress = territoryAddress + "-" + settlementId + "-" + bid;

            System.out.println("Assigning Occupants ...");
            ArrayList<Person> occupants = new ArrayList<>();

            while (true) {
                System.out.println("Adding Person to building ...");
                Scanner personInput = new Scanner(System.in);

                System.out.println("Person's First name?: ");
                String firstName = personInput.nextLine();

                System.out.println("Person's Last name?: ");
                String lastName = personInput.nextLine();

                System.out.println("Person's Age?: ");
                int age = personInput.nextInt();

                ArrayList<String> residence = new ArrayList<>();
                residence.add(buildingAddress);

                System.out.println(MessageFormat.format("Creating {0}'s professional profile ...\n", firstName));
                String code = UUID.randomUUID().toString();

                System.out.println("Profession?: eg Knight, Blacksmith, Farmer");
                String test = personInput.nextLine(); // ---------------------------?
                String occupation = personInput.nextLine();

                System.out.println("Current title or rank of person in said profession?: ");
                String title = personInput.nextLine(); /* current title of person in the profession, title or rank or position , etc */

                System.out.println("Tools or professional and rank identifying equipment?: ");
                ArrayList<String> tools = new ArrayList<>();
                while (true) {
                    System.out.println("Adding tools ...\n");
                    Scanner toolInput = new Scanner(System.in);

                    System.out.println("Name of tool?: ");
                    String tool = toolInput.nextLine();
                    tools.add(tool);

                    System.out.println("Add another Tool?: Yes(Y) / No(N)");
                    String addTools = toolInput.nextLine();
                    if (addTools.equalsIgnoreCase("no") || addTools.equalsIgnoreCase("n")) {
                        break;
                    }
                }

                System.out.println("Person's Area of expertise in profession?: eg backend engineer");
                String area_of_expertise = personInput.nextLine();

                Profession profession = new Profession(code, occupation, title, tools, area_of_expertise);

                Person person = new Person(firstName, lastName, age, residence, profession);

                occupants.add(person);

                System.out.println("Add another Person?: Yes(Y) / No(N)");
                String addMore = personInput.nextLine();
                if (addMore.equalsIgnoreCase("no") || addMore.equalsIgnoreCase("n")) {
                    break;
                }
            }

            Building building = new Building(bid, buildingName, type, size, buildingAddress, occupants);
            buildings.add(building);

            System.out.println("Add another house?: Yes(Y) / No(N)");
            String createMore = buildingInput.nextLine();
            if (createMore.equalsIgnoreCase("no") || createMore.equalsIgnoreCase("n")) {
                break;
            }
        }
    }

}
