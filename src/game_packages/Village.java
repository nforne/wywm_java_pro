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
}
