package gamePackages;

import java.util.ArrayList;
import java.util.Scanner;

public class Building {

    //    a building could be a hurt, a bungalow, a flat, a story building, an office complex, a market, a business plaza, etc
    public String name;
    public String type;
    public String size;
    public String address;
    public ArrayList<Person> occupants;
    public Building(int id, String name, String type, String size, String address, ArrayList<Person> occupants) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.size = size;
        this.address = address;
        this.occupants = occupants;
    }

    public int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Person> getOccupants() {
        return occupants;
    }

    public void setOccupants(ArrayList<Person> occupants) {
        this.occupants = occupants;
    }


}
