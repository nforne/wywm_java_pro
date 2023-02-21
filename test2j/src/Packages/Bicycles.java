package Packages;
import java.text.MessageFormat;

public abstract class Bicycles implements bykesControl{
    protected int cadence;
    protected int speed;
    protected int gear;

    public Bicycles (int cadence, int speed, int gear) {
        this.cadence = cadence;
        this.speed = speed;
        this.gear = gear;
    }

    public void changeCadence(int newValue) {
        cadence = newValue;
    }

    public void changeGear(int newGear) {
        gear = newGear;
    }

    @Override
    public int turn(int turnDirection, double radius, double startSpeed, double endSpeed) {
        return 0;
    }

    @Override
    public int changeLane(int turnDirection, double startSpeed, double endSpeed) {
        return 0;
    }

    public void speedUp(int increment) {
        setSpeed(getSpeed() + increment);
    }

    public void applyBrakes(int decrement) {
        setSpeed(getSpeed() - decrement);
    }

    public void printStates() {
        System.out.println(MessageFormat.format("Cadence: {0}, Speed: {1}, Gear: {2}", this.cadence, this.getSpeed(), this.gear));
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public abstract void printStart();
}

