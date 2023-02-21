package Packages;

import java.text.MessageFormat;

public class MAX extends Bicycles {
    public int seatHeight;
    public MAX(int startHeight, int startCadence, int startSpeed, int startGear) {
        super(startCadence, startSpeed, startGear);
        this.seatHeight = startHeight;
    }
    @Override
    public boolean moveKickStand(boolean active) {
        return super.moveKickStand(active);
    }
    @Override
    public void printStart() {
        System.out.println(MessageFormat.format("Cadence: {0}, Speed: {1}, Gear: {2}", this.cadence, this.getSpeed(), this.gear));
    }
}
