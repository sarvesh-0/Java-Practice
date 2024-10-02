package pb5;

public class TestVehicle {
    public static void main(String[] args) {
    	
        Vehicle vehicle1 = new Vehicle(101, "Model X", "4 wheeler", 350000);
        Vehicle vehicle2 = new Vehicle(102, "Model Y", "3 wheeler", 200000);
        Vehicle vehicle3 = new Vehicle(103, "Model Z", "2 wheeler", 120000);

        System.out.println("Vehicle 1 Details:");
        vehicle1.show();

        System.out.println("\nVehicle 2 Details:");
        vehicle2.show();

        System.out.println("\nVehicle 3 Details:");
        vehicle3.show();
    }
}
