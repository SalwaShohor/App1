package lesson12.VehicleTrait;

// Define a class Car implementing the VehicleTrait
class Car implements VehicleTrait {
    @Override
    public void start() {
        System.out.println("Car started");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }
}
