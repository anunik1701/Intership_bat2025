package Day20.java;

public class Laptop {
	
	    String model;
	    double price;

	    // Parameterized constructor
	    Laptop(String model, double price) {
	        this.model = model;
	        this.price = price;
	    }

	    void display() {
	        System.out.println("Model: " + model);
	        System.out.println("Price: $" + price);
	    }

	    public static void main(String[] args) {
	        Laptop laptop = new Laptop("HP", 540000);
	        laptop.display();
	    }
	}


