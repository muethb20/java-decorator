package withoutdecorator.components;

public class CarWithLeatherSeats extends BasicCar {
    @Override
    public String getDescription() {
        return super.getDescription() + " + Leather Seats";
    }

    @Override
    public double getCost() {
        return super.getCost() + 2000;
    }
}
