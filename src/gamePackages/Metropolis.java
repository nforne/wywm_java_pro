package gamePackages;

import java.util.ArrayList;

public class Metropolis extends Settlement{
    public Person governor;
    public Building citadel;
    public String size;
    public Metropolis(String id, String name, ArrayList<Building> buildings, Person governor, Building citadel, String size) {
        super(id, name, buildings);
        this.governor = governor;
        this.citadel = citadel;
        this.size = size;
    }

    public Person getGovernor() {
        return governor;
    }

    public void setGovernor(Person governor) {
        this.governor = governor;
    }

    public Building getCitadel() {
        return citadel;
    }

    public void setCitadel(Building citadel) {
        this.citadel = citadel;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

}
