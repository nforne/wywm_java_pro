import static Packages.pkgs.*;

import Packages.*;

import java.text.MessageFormat;

public class Main {

    public static <Bicyles> void main(String[] args) {
//        testj();

//        drawDiamonds(5);

//        menuja();

//        System.out.println((int) factoLoops(50));

        System.out.println(fibSeqLoops(8));
        System.out.println(fibSeqRec(8,3, 1, 1));

//        calculator(2);
//        calculator(2.5F);

        Bicycles byke1 = new Bicycles(0, 1, 2) {
            @Override
            public void printStart() {

            }
        };
        Bicycles byke2 = new Bicycles(3, 4, 5) {
            @Override
            public void printStart() {
                System.out.println(MessageFormat.format("Cadence: {0}, Speed: {1}, Gear: {2}", this.cadence, this.getSpeed(), this.gear));
            }
        };

        byke1.changeCadence(50);
        byke1.speedUp(10);
        byke1.changeGear(2);

        byke1.printStates();

        bykesControl byke3 = new Bicycles(1, 2, 3) {
            @Override
            public void printStart() {
                System.out.println(MessageFormat.format("Cadence: {0}, Speed: {1}, Gear: {2}", this.cadence, this.getSpeed(), this.gear));
            }
        };

        Bicycles[] bykesList = new Bicycles[3];
        bykesList[0] = new Bicycles(1, 2, 3) {
            @Override
            public void printStart() {
                System.out.println(MessageFormat.format("Cadence: {0}, Speed: {1}, Gear: {2}", this.cadence, this.getSpeed(), this.gear));
            }
        };
        bykesList[1] = new MountainByke(10, 11, 12, 2);
        bykesList[2] = new MAX(5, 6, 4, 5);


        for (Bicycles byke: bykesList){
            byke.printStates();
//            if (byke instanceof  MountainByke) {
//                newbyke = (MountainByke) byke;
//            }
        }

        bykesControl byke5 = new FixedGear(1, 2);
        Bicycles byke6 = new FixedGear(3, 4);
        FixedGear byke7 = new FixedGear(5, 6);


    }

    private static int addition(int a, int b) {
        int c = a + b;
        return c;
    }

}