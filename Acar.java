public abstract class Acar implements Car {
    private final String registrationNumber;
    private final String make;
    private final String model;
    private final int numberOfDoors;


    public Acar(String make, String registrationNumber, String model, int numberOfDoors) {
        this.registrationNumber = registrationNumber;
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;

    }

    @Override
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    @Override
    public String getMake() {
        return make;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public int getNumberOfDoors() {
        return numberOfDoors;
    }


    @Override
    public String toString() {
        return "The car brand is " + make + ", " + "The registrationNumber is: " + registrationNumber + ", " +
                "The model of the car: " + model + "," + "The number of doors: " +
                numberOfDoors ;
    }
}

