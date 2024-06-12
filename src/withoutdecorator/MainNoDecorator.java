package withoutdecorator;

import withoutdecorator.components.BasicCar;
import withoutdecorator.components.CarWithHeatedSeats;
import withoutdecorator.components.CarWithLeatherSeats;
import withoutdecorator.components.CarWithSunroof;

public class MainNoDecorator {
    public static void main(String[] args) {
        BasicCar car = new BasicCar();
        System.out.println(car.getDescription() + " costs " + car.getCost());

        CarWithSunroof carWithSunroof = new CarWithSunroof();
        System.out.println(carWithSunroof.getDescription() + " costs " + carWithSunroof.getCost());

        CarWithLeatherSeats carWithLeatherSeats = new CarWithLeatherSeats();
        System.out.println(carWithLeatherSeats.getDescription() + " costs " + carWithLeatherSeats.getCost());

        CarWithHeatedSeats carWithHeatedSeats = new CarWithHeatedSeats();
        System.out.println(carWithHeatedSeats.getDescription() + " costs " + carWithLeatherSeats.getCost());
    }
}