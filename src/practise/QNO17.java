package practise;

// Base class
class MyVehicle {
    String color;
    int wheels;
    String model;

    public MyVehicle(String color, int wheels, String model) {
        this.color = color;
        this.wheels = wheels;
        this.model = model;
    }

    public void displayInfo() {
        System.out.println("Model: " + model + ", Color: " + color + ", Wheels: " + wheels);
    }

    public void start() {
        System.out.println(model + " is starting.");
    }

    public void stop() {
        System.out.println(model + " is stopping.");
    }
}

// Truck class
class MyTruck extends MyVehicle {
    public MyTruck(String color, int wheels, String model) {
        super(color, wheels, model);
    }

    public void loadCargo() {
        System.out.println(model + " is loading cargo.");
    }
}

// Bus class
class MyBus extends MyVehicle {
    public MyBus(String color, int wheels, String model) {
        super(color, wheels, model);
    }

    public void pickPassengers() {
        System.out.println(model + " is picking up passengers.");
    }
}

// Car class
class MyCar extends MyVehicle {
    public MyCar(String color, int wheels, String model) {
        super(color, wheels, model);
    }

    public void playMusic() {
        System.out.println(model + " is playing music.");
    }
}

public class QNO17 {

    public static void main(String[] args) {
        MyTruck truck = new MyTruck("Red", 6, "TATA HeavyTruck");
        MyBus bus = new MyBus("Yellow", 4, "Volvo Bus");
        MyCar car = new MyCar("Blue", 4, "Honda City");

        System.out.println("--- Truck ---");
        truck.displayInfo();
        truck.start();
        truck.loadCargo();
        truck.stop();

        System.out.println("\n--- Bus ---");
        bus.displayInfo();
        bus.start();
        bus.pickPassengers();
        bus.stop();

        System.out.println("\n--- Car ---");
        car.displayInfo();
        car.start();
        car.playMusic();
        car.stop();
    }
}


/*output
--- Truck ---
Model: TATA HeavyTruck, Color: Red, Wheels: 6
TATA HeavyTruck is starting.
TATA HeavyTruck is loading cargo.
TATA HeavyTruck is stopping.

--- Bus ---
Model: Volvo Bus, Color: Yellow, Wheels: 4
Volvo Bus is starting.
Volvo Bus is picking up passengers.
Volvo Bus is stopping.

--- Car ---
Model: Honda City, Color: Blue, Wheels: 4
Honda City is starting.
Honda City is playing music.
Honda City is stopping.*/