package game_packages;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Scanner;

import static game_packages.CrudHelpers.*;

public class Territory {
    private String id;
    private String name;
    private String address;
    private String size;
    private String climate; // climate could be tropical or temperate
    private static ArrayList<String> territoryIds = new ArrayList<>();
    private  ArrayList<String> villagesIds;
    private  ArrayList<String> townsIds;
    private  ArrayList<String> citiesIds;
    private  ArrayList<String> metropolisIds;

    private ArrayList<Village> villages;
    private ArrayList<Town> towns;
    private ArrayList<City> cities;
    private ArrayList<Metropolis> metropolis;

    public Territory(String name, String address, String size, String climate, String id) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.size = size;
        this.climate = climate;

        this.villagesIds = new ArrayList<>();
        this.townsIds = new ArrayList<>();
        this.citiesIds = new ArrayList<>();
        this.metropolisIds = new ArrayList<>();

        this.villages = new ArrayList<>();
        this.towns = new ArrayList<>();
        this.cities = new ArrayList<>();
        this.metropolis = new ArrayList<>();

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getClimate() {
        return climate;
    }

    public void setClimate(String climate) {
        this.climate = climate;
    }

    public static ArrayList<String> getTerritoryIds() {
        return territoryIds;
    }

    public static void setTerritoryIds(ArrayList<String> territoryIds) {
        Territory.territoryIds = territoryIds;
    }

    public ArrayList<String> getVillagesIds() {
        return villagesIds;
    }

    public void setVillagesIds(ArrayList<String> villagesIds) {
        this.villagesIds = villagesIds;
    }

    public ArrayList<String> getTownsIds() {
        return townsIds;
    }

    public void setTownsIds(ArrayList<String> townsIds) {
        this.townsIds = townsIds;
    }

    public ArrayList<String> getCitiesIds() {
        return citiesIds;
    }

    public void setCitiesIds(ArrayList<String> citiesIds) {
        this.citiesIds = citiesIds;
    }

    public ArrayList<String> getMetropolisIds() {
        return metropolisIds;
    }

    public void setMetropolisIds(ArrayList<String> metropolisIds) {
        this.metropolisIds = metropolisIds;
    }

    public ArrayList<Village> getVillages() {
        return villages;
    }
    public void setVillages(ArrayList<Village> villages) {
        this.villages = villages;
    }
    public void addVillages() {
        while (true) {
            Scanner vInput = new Scanner(System.in);

            Village villageSettlement = createVillage(this);
            this.villages.add(villageSettlement);

            System.out.println(MessageFormat.format("Add another village to {0}?: Yes(Y) / No(N)", this.name));
            String addTools = vInput.nextLine();
            if (addTools.equalsIgnoreCase("no") || addTools.equalsIgnoreCase("n")) {
                break;
            }

        }
    }

    public ArrayList<Town> getTowns() {
        return towns;
    }
    public void setTowns(ArrayList<Town> towns) {
        this.towns = towns;
    }
    public void addTowns() {
        while (true) {
            Scanner tInput = new Scanner(System.in);

            Town townSettlement = createTown(this);
            this.towns.add(townSettlement);

            System.out.println(MessageFormat.format("Add another Town to {0}?: Yes(Y) / No(N)", this.name));
            String addTools = tInput.nextLine();
            if (addTools.equalsIgnoreCase("no") || addTools.equalsIgnoreCase("n")) {
                break;
            }

        }
    }

    public ArrayList<City> getCities() {
        return cities;
    }

    public void setCities(ArrayList<City> cities) {
        this.cities = cities;
    }
    public void addCities() {
        while (true) {
            Scanner cInput = new Scanner(System.in);

            City citySettlement = createCity(this);
            this.cities.add(citySettlement);

            System.out.println(MessageFormat.format("Add another city {0}?: Yes(Y) / No(N)", this.name));
            String addTools = cInput.nextLine();
            if (addTools.equalsIgnoreCase("no") || addTools.equalsIgnoreCase("n")) {
                break;
            }

        }
    }
    public ArrayList<Metropolis> getMetropolis() {
        return metropolis;
    }
    public void setMetropolis(ArrayList<Metropolis> metropolis) {
        this.metropolis = metropolis;
    }
    public void addMetropolis() {
        while (true) {
            Scanner mInput = new Scanner(System.in);

            Metropolis metroSettlement = createMetropolis(this);
            this.metropolis.add(metroSettlement);

            System.out.println(MessageFormat.format("Add another metropolis {0}?: Yes(Y) / No(N)", this.name));
            String addTools = mInput.nextLine();
            if (addTools.equalsIgnoreCase("no") || addTools.equalsIgnoreCase("n")) {
                break;
            }

        }
    }

}
