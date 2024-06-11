package withoutdecorator;

public class CarWithSunroof extends BasicCar {
    @Override
    public String getDescription() {
        return super.getDescription() + " + Sunroof";
    }

    @Override
    public double getCost() {
        return super.getCost() + 1500;
    }
}
