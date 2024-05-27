package Constructor;

public class ConstructDemo {

	public static void main(String[] args) {
		
       //object for default constructor
		Construct c = new Construct();
		System.out.println(c);
		
		//object for parameterized constructor
		Construct c1 = new Construct("Priya",8);
		System.out.println(c1);
		
		//object foe overloaded constructor
		Construct c2 = new Construct("Priya",12,100);
		System.out.println(c2);
		
	}

}
