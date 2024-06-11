package withdecorator;

import withdecorator.basecomponents.BasicCar;
import withdecorator.basecomponents.Car;
import withdecorator.decorators.LeatherSeatsDecorator;
import withdecorator.decorators.HeatedSeatsDecorator;
import withdecorator.decorators.SunroofDecorator;

public class MainWithDecorator {
    public static void main(String[] args) {
        Car basicCar = new BasicCar();
        System.out.println(basicCar.getDescription() + " costs " + basicCar.getCost());

        Car carWithSunroof = new SunroofDecorator(basicCar);
        System.out.println(carWithSunroof.getDescription() + " costs " + carWithSunroof.getCost());

        Car carWithLeatherSeats = new LeatherSeatsDecorator(basicCar);
        System.out.println(carWithLeatherSeats.getDescription() + " costs " + carWithLeatherSeats.getCost());

        Car carWithHeatedSeats = new HeatedSeatsDecorator(basicCar);
        System.out.println(carWithHeatedSeats.getDescription() + " costs " + carWithHeatedSeats.getCost());

        Car carWithHeatedLeatherSeats = new HeatedSeatsDecorator(new LeatherSeatsDecorator(basicCar));
        System.out.println(carWithHeatedLeatherSeats.getDescription() + " costs " + carWithHeatedLeatherSeats.getCost());

        Car fullyLoadedCar = new HeatedSeatsDecorator(new LeatherSeatsDecorator(new SunroofDecorator(basicCar)));
        System.out.println(fullyLoadedCar.getDescription() + " costs " + fullyLoadedCar.getCost());
    }
}
