package game_packages;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

import static java.lang.Integer.parseInt;

public class CrudHelpers {
    public static Territory createTerritory(){
        System.out.println("Creating Territory ...");
        Scanner input = new Scanner(System.in);

        System.out.println("Territory Name?: ");
        String name = input.nextLine();

        System.out.println("Territory Size: in square metres");
        String size = input.nextLine();

        System.out.println("Territory Climate: Temperate or Tropical?");
        String climate = input.nextLine();

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

        System.out.println("Village Name?: ");
        String vName = vInput.nextLine();

        System.out.println("Village size?: in square metres");
        String size = vInput.nextLine();

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

        System.out.println("Town's Name: ");
        String tName = tInput.nextLine();

        System.out.println("Town size?: in square metres");
        String size = tInput.nextLine();

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

    public static  City creatCity(Territory territory) {
        System.out.println("Creating City ...");
        Scanner cInput = new Scanner(System.in);

        String cid;
        ArrayList<String> cIds = territory.getCitiesIds();
        if (cIds.size() == 0){
            cid = "C100";
        } else {
            cid = "C" + (parseInt(cIds.get(cIds.size() - 1).substring(1)) + 1);
        }

        System.out.println("City Name?: ");
        String cName = cInput.nextLine();

        System.out.println("City size?: in square metres");
        String size = cInput.nextLine();

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

    public static  Metropolis creatMetropolis(Territory territory) {
        System.out.println("Creating Metropolis ...");
        Scanner mInput = new Scanner(System.in);

        String mid;
        ArrayList<String> mIds = territory.getMetropolisIds();
        if (mIds.size() == 0){
            mid = "M100";
        } else {
            mid = "M" + (parseInt(mIds.get(mIds.size() - 1).substring(1)) + 1);
        }

        System.out.println("Metropolis Name?: ");
        String mName = mInput.nextLine();

        System.out.println("Metropolis size?: in square metres");
        String size = mInput.nextLine();

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

            System.out.println("Building Name?: eg John's family residence, 5th SubDivision police station, etc");
            String buildingName = buildingInput.nextLine();

            System.out.println("Building Type?: eg tent, hurt, bungalow, flat, story building, office complex, etc");
            String type = buildingInput.nextLine();

            System.out.println("Building size?: in square metres");
            String size = buildingInput.nextLine();

            int bid = buildings.size() == 0 ? 1 : buildings.size() + 1; // eg 10-V12-23 for territory # 10, village # 12, house # 23
            String buildingAddress = territoryAddress + "-" + settlementId + "-" + bid;

            System.out.println(MessageFormat.format("\nAssigning Occupants to {0} ...", buildingName));
            ArrayList<Person> occupants = new ArrayList<>();

            while (true) {
                System.out.println(MessageFormat.format("\nAdding Person to {0} ...", buildingName));
                Scanner personInput = new Scanner(System.in);

                System.out.println("Person's First name?: ");
                String firstName = personInput.nextLine();

                System.out.println("Person's Last name?: ");
                String lastName = personInput.nextLine();

                System.out.println("Person's Age?: ");
                int age = personInput.nextInt();

                ArrayList<String> residence = new ArrayList<>();
                residence.add(buildingAddress);

                System.out.println(MessageFormat.format("\nCreating {0}'s professional profile ...", firstName));
                String code = String.valueOf(UUID.randomUUID());

                System.out.println(MessageFormat.format("\n{0}'s Profession?: eg Knight, Blacksmith, Farmer", firstName));
                String occupation = "";
                while (occupation.equals("")) {
                    occupation = personInput.nextLine();
                }

                System.out.println(MessageFormat.format("Current title or rank of {0} in {1}?: ", firstName, occupation));
                String title = personInput.nextLine(); /* current title of person in the profession, title or rank or position , etc */

                System.out.println(MessageFormat.format("{0}'s Area of expertise in profession?: eg backend engineer", firstName));
                String expertiseArea = personInput.nextLine();

                System.out.println("Tools or professional and rank identifying equipment?: ");
                ArrayList<String> tools = new ArrayList<>();
                System.out.println("-Adding tools ...");
                while (true) {
                    Scanner toolInput = new Scanner(System.in);

                    System.out.println("--Name of tool?: ");
                    String tool = toolInput.nextLine();
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
