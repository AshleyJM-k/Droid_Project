
/*  -A Hovering Droid-
      Program that simulates a droid with
      .activate .hover .checkBatteryLevel
      Methods
      .chargeBattery
      Method will take ints hours and adds it to the total battery level. Might do something more with this later
      but most of all just small fun on Code Academy
*/
public class droid {

static int batteryLevel;
    droid() {
        batteryLevel = 100;
    }
    public static void activate() {
        System.out.println("Activated. How can I help you?");
        batteryLevel = batteryLevel - 5;
        System.out.println("Battery level is: " +batteryLevel+ " percent.");
    }
    public static void chargeBattery(int hours) {
        System.out.println("Droid charging");
        if (batteryLevel + hours > 100) {
            batteryLevel = 100;
            System.out.println("Battery level is " +batteryLevel+ " percent.");
        } else {
            batteryLevel = batteryLevel + hours;
            System.out.println("Battery level is " +batteryLevel+ " percent.");
        }
    }
    public static int checkBatteryLevel() {
        System.out.println("Battery level is " +batteryLevel+ " percent.");
        return(batteryLevel);
    }
    public static void hover(int feet) {
        if (feet > 2) {
            System.out.println("Error! I cannot hover above 2 feet.");
        } else {
            System.out.println("Hovering...");
            batteryLevel = batteryLevel - 20;
            System.out.println("Battery level is " +batteryLevel+ " percent.");
        }
    }
    public static void main(String[] args){
        droid markle = new droid();
        markle.activate();
        markle.chargeBattery(5);
        markle.hover(2);
    }
}