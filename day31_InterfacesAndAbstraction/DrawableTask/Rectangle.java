package day31_InterfacesAndAbstraction.DrawableTask;

public class Rectangle implements Drawable{
	
	private int x;
	private int y;
	private int width;
	private int length;
	
	public Rectangle(int x, int y, int width, int length) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.length = length;
	}

	@Override
	public void draw() {
		System.out.println("Drawing a rectangle at " + x + ", " + y + 
				" with width " + width + " and length " + length);
	}
	
	
}
