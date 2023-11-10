
public class Main {
    public static void main(String[] args) {

        FleetOfCars fleet = new FleetOfCars();

        Car mercedes = new GasolinCar("Mercedes", "DK123", "A6", 5, 20);
        Car toyota = new DieselCar("Toyota", "AB123", "Corolla", 4, 30, true);
        Car tesla = new ElectricCar("Tesla", "BA234", "Model S", 5, 4,2);

        fleet.addCar(mercedes);
        fleet.addCar(toyota);
        fleet.addCar(tesla);

        System.out.println("Samlet registreringsafgift af flåden: " + fleet.getTotalRegistrationFeeForFleet());

        System.out.println(fleet.toString());
    }
}