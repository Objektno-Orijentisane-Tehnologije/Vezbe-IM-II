package geometry;

public class Rectangle extends Shape {

	private Point upperLeft;
	private int width;
	private int height;
	
	public Rectangle() {
		
	}
	
	public Rectangle(Point upperLeft, int width, int height) {
		this.upperLeft = upperLeft;
		this.width = width;
		this.height = height;
	}
	
	public Rectangle(Point upperLeft, int width, int height, boolean selected) {
		this (upperLeft, width, height);
		this.selected = selected;
	}
	
	public int area() {
		return width * height;
	}
	
	public int circumference() {
		return 2*width + 2*height;
	}
	
	public boolean contains(int x, int y) {
		return (x >= upperLeft.getX() && x <= upperLeft.getX() + width) &&
				(y >= upperLeft.getY() && y <= upperLeft.getY() + height);
	}
	
	public boolean contains(Point p) {
		return this.contains(p.getX(), p.getY());
	}
	
	@Override
	public String toString() {
		return "Upper left point: (" + upperLeft.getX() + ", " 
				+ upperLeft.getY() + "), width = " + width 
				+ ", height = " + height;  
	}
	
	@Override
	public boolean equals(Object obj) {
        if(obj instanceof Rectangle) {
        	Rectangle temp = (Rectangle)obj;
        	if(area() == temp.area()) {
        		return true;
        	}
        }
        return false;
    }
	
	public Point getUpperLeft() {
		return upperLeft;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setUpperLeft(Point upperLeft) {
		this.upperLeft = upperLeft;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	
	
	
}
