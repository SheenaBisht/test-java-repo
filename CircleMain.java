package assignment;

class Circle{
	private double radius;
	private String color;
	
	public Circle() {
		radius = 1.0;
		color = "red";
	}

	public Circle(double radius) {
		this.radius = radius;
		color = "red";
	}
	public double getRadius() {
		return radius;
		
	}
	public double getArea() {
		double area = Math.PI * radius * radius;
		return area;
		
	}
	public String toString() {
		return "Circle[radius = " + radius + "]";
	}
}

public class CircleMain {
	

	public static void main(String[] args) {
	
		Circle c1 = new Circle(10);
		System.out.println(c1);
		System.out.println(c1.getRadius());
		System.out.println(c1.getArea());
		Circle c2 = new Circle();
		System.out.println(c2.getRadius());
		System.out.println(c2.getArea());
		
		

	}

}
