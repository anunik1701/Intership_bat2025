package Day19.java;
class Parent {
	
	    int value = 100;
	}

	class Child extends Parent
	{
	    int value = 200;

	    void display()
	    {
	        System.out.println("Child value: " + value);            // refers to child variable
	        System.out.println("Parent value: " + super.value);     // refers to parent variable using super
	    }

	    public static void main(String[] args) {
	        Child c = new Child();
	        c.display();
	    }
	}


