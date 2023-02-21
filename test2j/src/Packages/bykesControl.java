package Packages;

public interface bykesControl {
    int turn(int turnDirection, double radius, double startSpeed, double endSpeed);
    int changeLane(int turnDirection, double startSpeed, double endSpeed);
    void speedUp(int increment);

   void applyBrakes(int decrement);
   default boolean moveKickStand (boolean active) {
      return active;
   }
}
