package withdecorator;

public class MainDecorator {
    public static void main(String[] args) {
        Car basicCar = new BasicCar();
        System.out.println(basicCar.getDescription() + " costs " + basicCar.getCost());

        Car carWithSunroof = new SunroofDecorator(basicCar);
        System.out.println(carWithSunroof.getDescription() + " costs " + carWithSunroof.getCost());

        Car carWithLeatherSeats = new LeatherSeatsDecorator(basicCar);
        System.out.println(carWithLeatherSeats.getDescription() + " costs " + carWithLeatherSeats.getCost());

        Car fullyLoadedCar = new LeatherSeatsDecorator(new SunroofDecorator(basicCar));
        System.out.println(fullyLoadedCar.getDescription() + " costs " + fullyLoadedCar.getCost());

    }
}