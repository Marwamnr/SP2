import java.util.ArrayList;

public class FleetOfCars {
    private ArrayList<Car> fleet = new ArrayList<>();

    public void addCar(Car car) {
        fleet.add(car);
    }
    public int getTotalRegistrationFeeForFleet() {
        int result = 0;
        for(int i = 0; i < fleet.size(); i++ ) {
            result += fleet.get(i).getRegistrationFee();
        }
        return result;
    }

    @Override
    public String toString() {
        String result = "";
        for (Car c:
             fleet) {
            result += "\n" + c + "\n";
        }
        return result;
    }
}
