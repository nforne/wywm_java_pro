package game_packages;

import java.util.ArrayList;
import java.util.UUID;

public class Building {

    //    a building could be a hurt, a bungalow, a flat, a story building, an office complex, a market, a business plaza, etc
    public int id;
    private String name;
    private String type;
    private String size;
    private String address;
    private ArrayList<Person> occupants;
    private final ArrayList<UUID> occupantsIds = new ArrayList<>();

    public Building(int id, String name, String type, String size, String address, ArrayList<Person> occupants) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.size = size;
        this.address = address;
        this.occupants = occupants;
        for (Person p : occupants) {
            occupantsIds.add(p.getId());
        }
    }

    public ArrayList<Person> getOccupants() {
        return occupants;
    }


}
