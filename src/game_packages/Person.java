package game_packages;

import java.util.ArrayList;
import java.util.UUID;

class Person {

    private UUID id;
    private String firstName;
    private String lastName;
    private int age;
    private ArrayList<String> residence;
    private Profession profession;
    public Person(String firstName, String lastName, int age, ArrayList<String> residence, Profession profession) {
        this.id = UUID.randomUUID();
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.residence = residence;
        this.profession = profession;
    }

    public UUID getId() {
        return id;
    }

}