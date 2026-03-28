abstract class Ride {
    double distance;
    Ride(double d) { distance = d; }
    abstract double calculateFare();
}

class BikeRide extends Ride {
    BikeRide(double d) { super(d); }
    double calculateFare() { return 5 * distance; }
}

class AutoRide extends Ride {
    AutoRide(double d) { super(d); }
    double calculateFare() { return 8 * distance; }
}

class CarRide extends Ride {
    CarRide(double d) { super(d); }
    double calculateFare() { return 12 * distance; }
}