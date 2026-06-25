class Parking {
    public static void main(String[] args) {
        Vehicle v1  = new Vehicle("1234", "Rishabh", "car");
        Vehicle v2  = new Vehicle("1235", "Aman", "bike");
        Vehicle v3  = new Vehicle("1236", "Rahul", "car");
        Vehicle v4  = new Vehicle("1237", "Priya", "bike");
        Vehicle v5  = new Vehicle("1238", "Neha", "car");
        Vehicle v6  = new Vehicle("1239", "Karan", "bike");
        Vehicle v7  = new Vehicle("1240", "Ankit", "car");
        Vehicle v8  = new Vehicle("1241", "Pooja", "bike");
        Vehicle v9  = new Vehicle("1242", "Vikas", "car");
        Vehicle v10 = new Vehicle("1243", "Sneha", "bike");
        Vehicle v11 = new Vehicle("1244", "Rohit", "car");
        Vehicle v12 = new Vehicle("1245", "Simran", "bike");
        v1.displayCars();
    }
}
class Vehicle {
    String vehicleNumber;
    String ownerName;
    String vehicleType;
    static Vehicle[] vehicleArray = new Vehicle[10];
    static int idx = 0;
    Vehicle(String vehicleNumber, String ownerName, String vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        vehicleArray[idx%10] = this;
        idx++;
    }
    void displayCars() {
        for(v != null && Vehicle v : vehicleArray) {
            if(v.vehicleType.equals("car")) {
                System.out.println(v.vehicleNumber);
            }
        }
    }
    void displayBikes() {
        for(v != null && Vehicle v : vehicleArray) {
            if(v.vehicleType.equals("bike")) {
                System.out.println(v.vehicleNumber);
            }
        }
    }
}
