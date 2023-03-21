import static game_packages.CrudHelpers.createTerritories;


public class Main {
    public static void main(String[] args) {
        /*
        This is a build with a vision to scale and to go deep with unique details.
        So, never mind if things get verbose or look redundant at some point at the moment.
        It'll make more sense as it scales and takes up more and more detail and functionality.
        The point is to get it right from the very start, so to avoid complications later.
        The design is aimed to be a blend of simplicity and depth.
        */

//        For now, it's a CLI run to make sure of the back-end and data structure
//        There will be slight modifications to serve the CRUD API were there to be a front-end(GUI)
        createTerritories();
    }

}