package withoutdecorator.components;

public class CarWithHeatedSeats extends BasicCar {
    @Override
    public String getDescription() {
        return super.getDescription() + " + Heated Seats";
    }

    @Override
    public double getCost() {
        return super.getCost() + 3000;
    }
}
