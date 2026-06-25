class DroneDeliverySystem{
    public static void main(String[] args){
        Drone d1 = new Drone(100);
        Drone d2 = new Drone(75);
        Drone d3 = new Drone(50);

        d1.startDelivery();

        d1.displayStatus();
        d2.displayStatus();
        d3.displayStatus();
        
        d3.startDelivery();
    }
}
class Drone{
    int droneId;
    double batteryPercentage;
    static String companyName = "ABC Company";
    static int totalDrones;
    Drone(double batteryPercentage) {
        totalDrones++;
        droneId = totalDrones;
        this.batteryPercentage = batteryPercentage;
    }
    void startDelivery() {
        System.out.println("Delivery of drone " + droneId + " has been started");
    }
    void displayStatus() {
        System.out.println("Drone Id : " + droneId + "\nBattery Percentage: " + batteryPercentage + "\nCompany Name: " + companyName);
    }
}