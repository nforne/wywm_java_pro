package game_packages;

import java.util.ArrayList;

public class City extends Settlement{
    private Person cityMayor;
    private Building cityCouncilComplex;
    public City(String id, String name, ArrayList<Building> buildings, Person cityMayor, Building cityCouncilComplex, String size) {
        super(id, name, buildings, size);
        this.cityMayor = cityMayor;
        this.cityCouncilComplex = cityCouncilComplex;
    }

}
