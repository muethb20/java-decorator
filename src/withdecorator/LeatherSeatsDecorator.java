package withdecorator;

public class LeatherSeatsDecorator extends CarDecorator {
    public LeatherSeatsDecorator(Car car) {
        super(car);
    }

    @Override
    public String getDescription() {
        return decoratedCar.getDescription() + " + Leather Seats";
    }

    @Override
    public double getCost() {
        return decoratedCar.getCost() + 2000;
    }
}
