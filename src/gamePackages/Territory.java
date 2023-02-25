package gamePackages;

import java.util.ArrayList;
import java.util.Scanner;

import static gamePackages.CrudHelpers.*;

public class Territory {
    public static ArrayList<String> territoryIds = new ArrayList<>();
    public  ArrayList<String> villageIds = new ArrayList<>();
    public  ArrayList<String> townsIds = new ArrayList<>();
    public  ArrayList<String> citiesIds = new ArrayList<>();
    public  ArrayList<String> metropolisIds = new ArrayList<>();
    private String id;
    private String name;
    private String address;
    public String size;

    //    climate could be tropical or temperate
    private String climate;

    public ArrayList<Village> villages = new ArrayList<>();
    public ArrayList<Town> towns = new ArrayList<>();
    public ArrayList<City> cities = new ArrayList<>();
    public ArrayList<Metropolis> metropolis = new ArrayList<>();

    public Territory(String name, String address, String size, String climate, String id) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.size = size;
        this.climate = climate;
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

            System.out.println("Add another village?: Yes(Y) / No(N)");
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

            System.out.println("Add another Town?: Yes(Y) / No(N)");
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

            City citySettlement = creatCity(this);
            this.cities.add(citySettlement);

            System.out.println("Add another city?: Yes(Y) / No(N)");
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

            Metropolis metroSettlement = creatMetropolis(this);
            this.metropolis.add(metroSettlement);

            System.out.println("Add another metropolis?: Yes(Y) / No(N)");
            String addTools = mInput.nextLine();
            if (addTools.equalsIgnoreCase("no") || addTools.equalsIgnoreCase("n")) {
                break;
            }

        }
    }

}
