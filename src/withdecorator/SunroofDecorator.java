package withdecorator;

public class SunroofDecorator extends CarDecorator {
    public SunroofDecorator(Car car) {
        super(car);
    }

    @Override
    public String getDescription() {
        return decoratedCar.getDescription() + " + Sunroof";
    }

    @Override
    public double getCost() {
        return decoratedCar.getCost() + 1500;
    }
}
