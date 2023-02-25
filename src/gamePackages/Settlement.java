package gamePackages;

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

    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
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
    public ArrayList<Integer> getBuildingIds() {
        return buildingIds;
    }

    public void setBuildingIds(ArrayList<Integer> buildingIds) {
        this.buildingIds = buildingIds;
    }


}
