package game_packages;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DB_CRUD implements CrudHelpers {
    static ArrayList<Territory> territories = new ArrayList<>();
    static ArrayList<ArrayList<Territory>> gameSessions = new ArrayList<>();
    static Map<String, String> nationalOccupationCodes = new HashMap<>();

}
