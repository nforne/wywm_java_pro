package game_packages;

import java.util.ArrayList;

public class Village extends Settlement{
    private Person chief;
    private Building palace;
    public Village(String id, String name, ArrayList<Building> buildings, Person chief, Building palace, String size) {
        super(id, name, buildings, size);
        this.chief = chief;
        this.palace = palace;
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
}
