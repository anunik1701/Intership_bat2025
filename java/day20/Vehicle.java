package Day20.java;

public class Vehicle {
	
	    String type;
	    int wheels;

	    // Parameterized constructor
	    Vehicle(String type, int wheels) {
	        this.type = type;
	        this.wheels = wheels;
	    }

	    // Copy constructor
	    Vehicle(Vehicle other) {
	        this.type = other.type;
	        this.wheels = other.wheels;
	    }

	    void display() {
	        System.out.println("Vehicle Type: " + type);
	        System.out.println("Number of Wheels: " + wheels);
	    }

	    public static void main(String[] args) {
	        Vehicle car = new Vehicle("Car", 4);
	        Vehicle carCopy = new Vehicle(car);

	        car.display();
	        System.out.println("Copied Vehicle:");
	        carCopy.display();
	    }
	}


