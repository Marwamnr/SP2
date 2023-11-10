public class ElectricCar extends Acar {
    private int batteryCapacity;
    private int maxRange;

    public ElectricCar(String make, String registrationNumber, String model, int numberOfDoors, int batteryCapacity, int maxRange) {
        super(make, registrationNumber, model, numberOfDoors);
        this.batteryCapacity = batteryCapacity;
        this.maxRange = maxRange;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public int getMaxRange() {
        return maxRange;
    }

    public int getWhPrKm() {
        return batteryCapacity * 1000;
    }

    @Override
    public int getRegistrationFee() {
        int kmPrLiter = (int) ((getWhPrKm() / 91.25) / 100);
        if(kmPrLiter > 20 && kmPrLiter < 50) {
            return 330;
        } else if (kmPrLiter > 15 && kmPrLiter < 20) {
            return 1050;
        } else if (kmPrLiter > 10 && kmPrLiter < 15) {
            return 2340;
        } else if (kmPrLiter > 5 && kmPrLiter < 10) {
            return 5500;
        } else if (kmPrLiter > 5 ) {
            return 10470;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "(Electric)" + " " + "The car brand is " + getMake() + ", " + "The registrationNumber is: " + getRegistrationNumber() + ", " +
                "The model of the car: " + getModel() + "," + "The number of doors: " +
                getNumberOfDoors() + "," + "batteryCapacity: " + getBatteryCapacity() + ", " +
                "maxRange" + getMaxRange();
    }
}
