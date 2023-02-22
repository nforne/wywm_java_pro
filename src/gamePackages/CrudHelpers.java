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

    public static Village createVillages(Territory territory){
        System.out.println("Creating Village ...");
        Scanner input = new Scanner(System.in);

        String vid;
        if (Territory.villageIds.size() == 0){
            vid = "V100";
        } else {
            vid = "V" + (parseInt(Territory.villageIds.get(Territory.villageIds.size() - 1).substring(1)) + 1);
        }

        System.out.println("Village Name: ");
        String vName = input.nextLine();

        System.out.println("Creating Buildings ...");
        ArrayList<Building> buildings = new ArrayList<>();

        createBuildings(territory.address, vid, buildings);

        System.out.println("Village size?: in square metres");
        String size = input.nextLine();

        Person chief = buildings.get(0).occupants.get(0);
        Building palace = buildings.get(0);

        return new Village(vid, vName, buildings, chief, palace, size);
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

            int bid = buildings.size() == 0 ? 1 : buildings.size() + 1;
            String buildingAddress = territoryAddress + "-" + settlementId + "-" + bid;

            System.out.println("Assigning Occupants ...");
            ArrayList<Person> occupants = new ArrayList<>();

            while (true) {
                Scanner personInput = new Scanner(System.in);
                System.out.println("Adding Person to building ...");

                System.out.println("Person's First name?: ");
                String firstName = personInput.nextLine();

                System.out.println("Person's Last name?: ");
                String lastName = personInput.nextLine();

                System.out.println("Person's Age?: ");
                int age = personInput.nextInt();

                ArrayList<String> residence = new ArrayList<>();
                residence.add(buildingAddress);

                System.out.println(MessageFormat.format("Creating {0}'s professional profile", firstName));
                System.out.println("National Occupation Classification code");
                String code = UUID.randomUUID().toString();

                System.out.println("Name of Profession?: ");
                String professionalOccupation = personInput.nextLine(); // name of profession

                System.out.println("Current title or rank of person in said profession?: ");
                String title = personInput.nextLine(); // current title of person in the profession, title or rank or position , etc

                System.out.println("Tools or professional and rank identifying equipment?: ");
                ArrayList<String> tools = new ArrayList<>();
                while (true) {
                    System.out.println("Name of tool?: ");
                    String tool = personInput.nextLine();
                    tools.add(tool);

                    System.out.println("Add another Tool?: Yes(Y) / No(N)");
                    String addTools = personInput.nextLine();
                    if (addTools.equalsIgnoreCase("no") || addTools.equalsIgnoreCase("n")) {
                        break;
                    }
                }

                System.out.println("Person's Area of expertise in professional?: eg backend engineer");
                String area_of_expertise = personInput.nextLine();

                Profession profession = new Profession(code, professionalOccupation, title, tools, area_of_expertise);

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
