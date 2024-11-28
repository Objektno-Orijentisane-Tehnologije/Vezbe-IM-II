package geometry;

public class Donut extends Circle {

	private int innerRadius;
	
	public Donut() {
		
	}
	
	public Donut(Point center, int radius, int innerRadius) {
		super(center, radius);
		this.innerRadius = innerRadius;
	}
	
	public Donut(Point center, int radius, int innerRadius, boolean selected) {
		this(center,radius,innerRadius);
		this.selected = selected;
	}
	
	@Override
	public boolean contains(int x, int y) {
		return super.contains(x, y) && this.center.distance(new Point(x,y)) >= innerRadius;
	}
	
	@Override
	public boolean contains(Point p) {
		return this.contains(p.getX(), p.getY());
	}

	public int getInnerRadius() {
		return innerRadius;
	}

	public void setInnerRadius(int innerRadius) {
		this.innerRadius = innerRadius;
	}

}
