package game_packages;

import java.util.ArrayList;

public class Town extends Settlement{
    private Person mayor;
    private Building councilComplex;
    public Town(String id, String name, ArrayList<Building> buildings, Person mayor, Building councilComplex, String size) {
        super(id, name, buildings, size);
        this.mayor = mayor;
        this.councilComplex = councilComplex;
    }

}
