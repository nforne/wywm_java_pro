package gamePackages;

import java.util.ArrayList;

public class Village extends Settlement{
    public ArrayList<Integer> buildingIds;
    public Person chief;
    public Building palace;
    public String size;

    public Village(String id, String name, ArrayList<Building> buildings, Person chief, Building palace, String size) {
        super(id, name, buildings);
        this.chief = chief;
        this.palace = palace;
        this.size = size;
    }

    public Person getChief() {
        return chief;
    }

    public void setChief(Person chief) {
        this.chief = chief;
    }

    public Building getPalace() {
        return palace;
    }

    public void setPalace(Building palace) {
        this.palace = palace;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

}
