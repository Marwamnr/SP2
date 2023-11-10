public class GasolinCar extends AFuelCar {

    public GasolinCar(String make, String registrationNumber, String model, int numberOfDoors, int kmPrLitre) {
        super(make, registrationNumber, model, numberOfDoors, kmPrLitre);
    }

    @Override
    String getFuelType() {
        return null;
    }

    @Override
    public int getRegistrationFee() {
        if(getKmPrLitre() > 20 && getKmPrLitre() < 50) {
            return 330;
        } else if (getKmPrLitre() > 15 && getKmPrLitre() < 20) {
            return 1050;
        } else if (getKmPrLitre() > 10 && getKmPrLitre() < 15) {
            return 2340;
        } else if (getKmPrLitre() > 5 && getKmPrLitre() < 10) {
            return 5500;
        } else if (getKmPrLitre() > 5 ) {
            return 10470;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "(Gasolin) " + "The car brand is " + getMake() + ", " + "The registrationNumber is: " + getRegistrationNumber() + ", " +
                "The model of the car: " + getModel() + "," + "The number of doors: " + getNumberOfDoors() + ", " + "kmPrLitre: " + getKmPrLitre() ;
    }
}