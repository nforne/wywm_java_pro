package gamePackages;

public class Territory {
    public String name;
    public String address;
    public String size;

    //    climate could be tropical or temperate
    public String climate;

    public Village[] villages;
    public Town[] towns;
    public City[] cities;
    public Metropolis[] metropolis;

    public Territory(String name, String address, String size, String climate) {
        this.name = name;
        this.address = address;
        this.size = size;
        this.climate = climate;
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

    public Village[] getVillages() {
        return villages;
    }

    public void setVillages(Village[] villages) {
        this.villages = villages;
    }

    public Town[] getTowns() {
        return towns;
    }

    public void setTowns(Town[] towns) {
        this.towns = towns;
    }

    public City[] getCities() {
        return cities;
    }

    public void setCities(City[] cities) {
        this.cities = cities;
    }

    public Metropolis[] getMetropolis() {
        return metropolis;
    }

    public void setMetropolis(Metropolis[] metropolis) {
        this.metropolis = metropolis;
    }


}
