package withdecorator.decorator;

import withdecorator.basecomponents.Car;

public class HeatedSeatsDecorator extends CarDecorator {
    public HeatedSeatsDecorator(Car car) {
        super(car);
    }

    @Override
    public String getDescription() {
        return decoratedCar.getDescription() + " + Heated Seats";
    }

    @Override
    public double getCost() {
        return decoratedCar.getCost() + 800;
    }
}
