package gamePackages;

import java.util.ArrayList;

public class Territory {
    public static ArrayList<String> territoryIds;
    public static ArrayList<String> villageIds;
    public static ArrayList<String> townsIds;
    public static ArrayList<String> citiesIds;
    public static ArrayList<String> metropolisIds;
    public String id;
    public String name;
    public String address;
    public String size;

    //    climate could be tropical or temperate
    public String climate;

    public ArrayList<Village> villages;
    public ArrayList<Town> towns;
    public ArrayList<City> cities;
    public ArrayList<Metropolis> metropolis;

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

    public ArrayList<Town> getTowns() {
        return towns;
    }

    public void setTowns(ArrayList<Town> towns) {
        this.towns = towns;
    }

    public ArrayList<City> getCities() {
        return cities;
    }

    public void setCities(ArrayList<City> cities) {
        this.cities = cities;
    }

    public ArrayList<Metropolis> getMetropolis() {
        return metropolis;
    }

    public void setMetropolis(ArrayList<Metropolis> metropolis) {
        this.metropolis = metropolis;
    }


}
