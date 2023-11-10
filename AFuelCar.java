public abstract class AFuelCar extends Acar {

    abstract String getFuelType();

    int kmPrLitre;


    // Super er for at kalde konstruktøren
    public AFuelCar(String make, String registrationNumber, String model, int numberOfDoors, int kmPrLitre) {
        super(make, registrationNumber, model, numberOfDoors);
        this.kmPrLitre = kmPrLitre;
    }

    public int getKmPrLitre() {
        return kmPrLitre;
    }

    @Override
    public String toString() {
        return "AFuelCar{" +
                "KmPrLitre=" + kmPrLitre +
                '}';
    }
}
