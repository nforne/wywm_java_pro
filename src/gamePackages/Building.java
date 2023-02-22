package gamePackages;

import java.util.ArrayList;
import java.util.Scanner;

public class Building {
    public Building(int id, String name, String type, String size, String address, ArrayList<Person> occupants) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.size = size;
        this.address = address;
        this.occupants = occupants;
    }

    public int id;
    //    a building could be a hurt, a bungalow, a flat, a story building, an office complex, a market, a business plaza, etc
    public String name;
    public String type;
    public String size;
    public String address;
    public ArrayList<Person> occupants;

//    public Building(String name, String type, String size, String address) {
//        Scanner buildingInput = new Scanner(System.in);
//        System.out.println("Creating a building ...");
//
//        if (name.length() == 0) System.out.println("Enter the building name: John's family residence, 5th SubDivision police station, etc");
//        this.name = name.length() == 0 ? buildingInput.nextLine() : name;
//
//        if (type.length() == 0) System.out.println("Enter the building type: a building could be a hurt, a bungalow, a flat, a story building, an office complex, a market, a business plaza, etc");
//        this.type = type.length() == 0 ? buildingInput.nextLine() : type;
//
//        if (size.length() == 0) System.out.println("Enter the building size: eg 20sqm, 40sqm, etc");
//        this.size = size.length() == 0 ? buildingInput.nextLine() : size;
//
//        if (address.length() == 0) System.out.println("Enter the address: eg 10-V12-23 for territory # 10, village # 12, house # 23" );
//        this.address = address.length() == 0 ? buildingInput.nextLine() : address;
//    }

}
