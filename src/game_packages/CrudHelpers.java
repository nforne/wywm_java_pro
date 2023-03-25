package game_packages;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

import static game_packages.DB_CRUD.dbCrudHelpers;

public interface CrudHelpers {
    public static CrudHelpers getCrudHelpers = dbCrudHelpers;
    String userInput(Scanner sc, String toBeCollected, boolean stringOrNumber);
    void jsonPrettyPrint(ArrayList<Territory> territories);
    void createTerritories();
    ArrayList<Territory> getTerritories();
    String setNOCs(Map<String, String> noc, String profession);
    Territory createTerritory();
    Village createVillage(Territory territory);
    Town createTown(Territory territory);
    City createCity(Territory territory);
    Metropolis createMetropolis(Territory territory);

    void createBuildings(String territoryAddress, String settlementId, ArrayList<Building> buildings);

}
