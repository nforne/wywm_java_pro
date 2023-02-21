package Packages;

import java.text.MessageFormat;

public class MountainByke extends Bicycles {
//    the MountainByke subclass adds one attribute
    public  int seatHeight;
//    the MountainByke subclass has one constructor
    public MountainByke(int startHeight, int startCadence, int startSpeed, int startGear) {
        super(startCadence, startSpeed, startGear);
        this.seatHeight = startHeight;
    }
//    the MountainByke subclass adds one method
    public void setHeight(int inputValue) {
        this.seatHeight = inputValue;
    }

    @Override
    public boolean moveKickStand(boolean active) {
        return super.moveKickStand(active);
    }

    @Override
    public void printStart() {
        System.out.println(MessageFormat.format("Cadence: {0}, Speed: {1}, Gear: {2}, SeatHeight: {3}",
                getCadence(), getSpeed(), getGear(), this.seatHeight));
    }

    private int getGear() {
        return this.gear;
    }

    private int getCadence() {
        return this.cadence;
    }
}
