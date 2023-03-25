package game_packages;

import java.util.ArrayList;

class Settlement {
    private String id;
    private String name;
    private String size;
    private ArrayList<Building> buildings;

    private ArrayList<Integer> buildingIds;
    public Settlement(String id, String name, ArrayList<Building> buildings, String size) {
        this.id = id;
        this.name = name;
        this.buildings = buildings;
        this.size = size;
        this.buildingIds = new ArrayList<>();
        for (Building b: buildings) {
            this.buildingIds.add(b.id);
        }
    }

    public String getId() {
        return id;
    }

}
