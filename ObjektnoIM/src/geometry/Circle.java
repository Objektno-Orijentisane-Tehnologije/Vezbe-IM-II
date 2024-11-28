package geometry;

public class Circle extends Shape {

	protected Point center;
	protected int radius;
	
	public Circle() {
		
	}
	
	public Circle(Point center, int radius) {
		this.center = center;
		this.radius = radius;
	}
	
	public Circle(Point center, int radius, boolean selected) {
		this (center, radius);
		this.selected = selected;
	}
	
	public double area() {
		return radius*radius*Math.PI;
	}
	
	public double circumference() {
		return 2*radius*Math.PI;
	}
	
	public boolean contains(int x, int y) {
		return center.distance(new Point(x,y)) <= radius;
	}
	
	public boolean contains(Point p) {
		return this.contains(p.getX(), p.getY());
	}
	
	@Override
	public String toString() {
		return "Center: (" + center.getX() + ", " 
				+ center.getY() + "), radius = " + radius;  
	}
	
	@Override
	public boolean equals(Object obj) {
        if(obj instanceof Circle) {
        	Circle temp = (Circle)obj;
        	if(radius == temp.radius) {
        		return true;
        	}
        }
        return false;
    }
	
	public Point getCenter() {
		return center;
	}
	
	public int getRadius() {
		return radius;
	}
	
	public void setCenter(Point center) {
		this.center = center;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	
	
	
	
}
