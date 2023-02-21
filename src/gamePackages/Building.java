package gamePackages;

import java.util.Scanner;

public class Building {
//    a building could be a hurt, a bungalow, a flat, a story building, an office complex, a market, a business plaza, etc
    public String name;
    public String type;
    public String size;
    public String address;

    public Building(String name, String type, String size, String address) {
        Scanner buildingInput = new Scanner(System.in);
        System.out.println("Creating a building ...");

        if (name.length() == 0) System.out.println("Enter the building name: John's family residence, 5th SubDivision police station, etc");
        this.name = name.length() == 0 ? buildingInput.nextLine() : name;

        if (type.length() == 0) System.out.println("Enter the building type: a building could be a hurt, a bungalow, a flat, a story building, an office complex, a market, a business plaza, etc");
        this.type = type.length() == 0 ? buildingInput.nextLine() : type;

        if (size.length() == 0) System.out.println("Enter the building size: eg 20sqm, 40sqm, etc");
        this.size = size.length() == 0 ? buildingInput.nextLine() : size;

        if (address.length() == 0) System.out.println("Enter the address: eg 10-V12-23 for territory # 10, village # 12, house # 23" );
        this.address = address.length() == 0 ? buildingInput.nextLine() : address;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getSize() {
        return size;
    }

    public String getAddress() {
        return address;
    }


}
