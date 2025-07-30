package practise;

abstract class Vehicle {
    abstract void startEngine();
    abstract void stopEngine();
}

class Car extends Vehicle {
    void startEngine() {
        System.out.println("Car engine started.");
    }

    void stopEngine() {
        System.out.println("Car engine stopped.");
    }
}

class Motorcycle extends Vehicle {
    void startEngine() {
        System.out.println("Motorcycle engine started.");
    }

    void stopEngine() {
        System.out.println("Motorcycle engine stopped.");
    }
}

public class QNO20 {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        Vehicle myBike = new Motorcycle();

        myCar.startEngine();
        myCar.stopEngine();

        myBike.startEngine();
        myBike.stopEngine();
    }
}
