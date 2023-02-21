package gamePackages;

import java.util.ArrayList;

public class Settlement {
    public String id;
    public String name;
    public ArrayList<Building> buildings;

    public Settlement(String id, String name, ArrayList<Building> buildings) {
        this.id = id;
        this.name = name;
        this.buildings = buildings;
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

    public ArrayList<Building> getBuildings() {
        return buildings;
    }

    public void setBuildings(ArrayList<Building> buildings) {
        this.buildings = buildings;
    }


}
