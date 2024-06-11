package withdecorator.decorator;

import withdecorator.basecomponents.Car;

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
