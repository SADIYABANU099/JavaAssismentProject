package methods;

public class MethodOverloading {
	public void area(int b, int h) {
		System.out.println("Area of Triangle: " +(0.5*b*h));
	}
	public void area(int r) {
		System.out.println("Area of circle: " +3.14*r*r);
	}

	public static void main(String[] args) {
		
		MethodOverloading obj = new MethodOverloading();
		obj.area(5,12);
		obj.area(8);

	}

}
