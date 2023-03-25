package game_packages;

import java.util.ArrayList;

public class Metropolis extends Settlement{
    private Person governor;
    private Building citadel;
    public Metropolis(String id, String name, ArrayList<Building> buildings, Person governor, Building citadel, String size) {
        super(id, name, buildings, size);
        this.governor = governor;
        this.citadel = citadel;
    }

}
