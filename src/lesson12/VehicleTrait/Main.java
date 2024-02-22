package lesson12.VehicleTrait;

public class Main {
    public static void main(String[] args) {
        // Example of combining traits (symmetric sum)
        VehicleTrait car = new Car();
        car.start();
        car.stop();

        // Example of overriding traits (asymmetric sum)
        VehicleTrait truck = new Truck();
        truck.start(); // Truck provides its own start method
        truck.stop();  // Truck provides its own stop method

        // Example of aliasing traits (traits can be expanded)
        ExtraFunctionalityTrait truckWithAlias = new Truck();
        truckWithAlias.honk(); // Truck provides its own honk method

        // Example of excluding traits (exclusion)
        // Car does not have the honk method as it doesn't implement ExtraFunctionalityTrait
        // VehicleTrait car = new Car();
        // car.honk(); // This would result in a compilation error
    }
}
