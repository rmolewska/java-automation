package qa.sandbox;

public class FirstProgram {
	
	public static void main(String[] args) {
		hello("world");
		hello("Keira");

		double len = 5;
		System.out.println("Square area is: " + area(len));

		double a = 6;
		double b = 4;
		System.out.println("Rectangle area is: " + area(a, b));

	}
	public static void hello(String somebody) {
		System.out.println("Hello," + " " + somebody +  "!" );
	}

	public static double area(double l) {
		return l * l;
	};

	public static double area(double a, double b) {
		return a * b;
	};

}