package gamePackages;

import java.util.ArrayList;

public class Town extends Settlement{
    private ArrayList<Integer> buildingIds;
    private Person mayor;
    private Building councilComplex;
    private String size;
    public Town(String id, String name, ArrayList<Building> buildings, Person mayor, Building councilComplex, String size) {
        super(id, name, buildings);
        this.mayor = mayor;
        this.councilComplex = councilComplex;
        this.size = size;
        this.buildingIds = new ArrayList<>();
        for (Building b: buildings) {
            this.buildingIds.add(b.id);
        }
    }


    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Person getMayor() {
        return mayor;
    }

    public void setMayor(Person mayor) {
        this.mayor = mayor;
    }

    public Building getCouncilComplex() {
        return councilComplex;
    }

    public void setCouncilComplex(Building councilComplex) {
        this.councilComplex = councilComplex;
    }

}
