import static game_packages.CrudHelpers.getCrudHelpers;

public class Main {
    public static void main(String[] args) {

        /*
        The design is aimed to be a blend of simplicity, efficiency and depth of unique details and functionality of entities.
        It's one intended for scale and to go deep with unique details.
        So, never mind if things look verbose or redundant at some point at the moment.
        It'll make more sense as it scales and takes up more and more detail and functionality.
        The point is to get things right from the very start, so to avoid complications later.
        */

//        For now, it's a CLI run to make sure of the back-end and data structure
//        Slight modifications to serve the CRUD API will be necessary were there to be a front-end(GUI)
//        Each object carries its own records. eg, list of members of a given household will be on the building object.
//        Only what is common is extracted to a common parent class

        getCrudHelpers.createTerritories();

    }

}