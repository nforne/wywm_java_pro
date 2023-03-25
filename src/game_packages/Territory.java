package game_packages;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Scanner;

import static game_packages.DB_CRUD.dbCrudHelpers;

class Territory {

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
    private static Scanner tSc ()  {
        return new Scanner(System.in);
    }

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

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }


    public String getSize() {
        return size;
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

    private boolean addAnother(String settlementType){
        boolean output = true;
        System.out.println(MessageFormat.format("Add another {0} to {1}?: Yes(Y) / No(N)", settlementType, this.name));
        String addTools = tSc().nextLine();
        if (addTools.equalsIgnoreCase("no") || addTools.equalsIgnoreCase("n")) {
           output = false;
        }
        return output;
    }
    public void addVillages() {
        do {
            Village villageSettlement = dbCrudHelpers.createVillage(this);
            this.villages.add(villageSettlement);
        } while (addAnother("Village"));
    }
    public void addTowns() {
        do {
            Town townSettlement = dbCrudHelpers.createTown(this);
            this.towns.add(townSettlement);
        } while (addAnother("Town"));
    }

    public void addCities() {
        do {
            City citySettlement = dbCrudHelpers.createCity(this);
            this.cities.add(citySettlement);
        } while (addAnother("City"));
    }
    public ArrayList<Metropolis> getMetropolis() {
        return metropolis;
    }
    public void setMetropolis(ArrayList<Metropolis> metropolis) {
        this.metropolis = metropolis;
    }
    public void addMetropolis() {
        do {
            Metropolis metroSettlement = dbCrudHelpers.createMetropolis(this);
            this.metropolis.add(metroSettlement);
        } while (addAnother("Metropolis"));
    }

}
