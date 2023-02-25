package gamePackages;

import java.util.ArrayList;

public class Town extends Settlement{
    private Person mayor;
    private Building councilComplex;
    public Town(String id, String name, ArrayList<Building> buildings, Person mayor, Building councilComplex, String size) {
        super(id, name, buildings, size);
        this.mayor = mayor;
        this.councilComplex = councilComplex;
    }

    public Person getMayor() {
        return mayor;
    }

    public void setMayor(Person mayor) {
        this.mayor = mayor;
    }

    public Building getCouncilComplex() {
        return councilComplex;
    }

    public void setCouncilComplex(Building councilComplex) {
        this.councilComplex = councilComplex;
    }

}
