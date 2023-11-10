public class DieselCar extends AFuelCar {
    private boolean hasParticleFilter;

    public DieselCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre, boolean hasParticleFilter ) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
        this.hasParticleFilter = hasParticleFilter;
    }

    public boolean hasParticleFilter() {
        return hasParticleFilter;
    }

    @Override
    public int getRegistrationFee() {
        int fee = 0;
        if (!hasParticleFilter){
            fee += 1000;
        }
        if (getKmPrLitre() > 20 && getKmPrLitre() < 50) {
            fee += 130;
            return fee;
        } else if (getKmPrLitre() > 15 && getKmPrLitre() < 20) {
            fee += 1390;
            return fee;
        } else if (getKmPrLitre() > 10 && getKmPrLitre() < 15) {
            fee += 1850;
            return fee;
        } else if (getKmPrLitre() > 5 && getKmPrLitre() < 10) {
            fee += 2770;
            return fee;
        } else if (getKmPrLitre() > 5) {
            fee += 15260;
            return fee;
        }
        return fee;
    }

    @Override
    String getFuelType() {
        return null;
    }

    @Override
    public String toString() {
        return "(Diesel) " + "The car brand is " + getMake() + ", " + "The registrationNumber is: " + getRegistrationNumber() + ", " +
                "The model of the car: " + getModel() + "," + "The number of doors: " +
                getNumberOfDoors() + ", " + "kmPrLitre: " + getKmPrLitre() + ", " + "hasParticleFilter: " + hasParticleFilter();
    }
}
