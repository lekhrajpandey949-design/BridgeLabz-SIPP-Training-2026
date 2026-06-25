class ElectricVehicle{
    public static void main(String[] args) {
        ChargingStation cs1 = new ChargingStation(200);
        cs1.electricityRates = 10.12;
        cs1.displayStationDetails();
        cs1.calculateBill();

        ChargingStation cs2 = new ChargingStation(567);
        cs2.electricityRates = 15;
        cs2.displayStationDetails();
        cs2.calculateBill();
    }
}
class ChargingStation {
    static int totalStations;
    static double electricityRates;
    int stationId;
    int unitsConsumed;

    ChargingStation(int unitsConsumed) {
        stationId = ++totalStations;
        this.unitsConsumed = unitsConsumed;
    }
    void calculateBill() {
        System.out.println("Generated Bill is: " + unitsConsumed * electricityRates);
    }
    void displayStationDetails() {
        System.out.println("Station Id: " + stationId + "\nTotal Stations: " + totalStations + "\nunitConsumed : " + unitsConsumed);
    }
}