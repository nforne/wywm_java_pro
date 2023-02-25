package gamePackages;

import java.util.ArrayList;

public class City extends Settlement{
    private Person cityMayor;
    private Building cityCouncilComplex;
    private String size;
    private ArrayList<Integer> buildingIds;
    public City(String id, String name, ArrayList<Building> buildings, Person cityMayor, Building cityCouncilComplex, String size) {
        super(id, name, buildings);
        this.cityMayor = cityMayor;
        this.cityCouncilComplex = cityCouncilComplex;
        this.size = size;
        this.buildingIds = new ArrayList<>();
        for (Building b: buildings) {
            this.buildingIds.add(b.id);
        }
    }
    public Person getCityMayor() {
        return cityMayor;
    }

    public void setCityMayor(Person cityMayor) {
        this.cityMayor = cityMayor;
    }

    public Building getCityCouncilComplex() {
        return cityCouncilComplex;
    }

    public void setCityCouncilComplex(Building cityCouncilComplex) {
        this.cityCouncilComplex = cityCouncilComplex;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }



}
