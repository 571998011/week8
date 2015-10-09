package th.ac.crru.ce.cen2001;

public class Square {
	int width;
	int height;
	double area;
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public double calArea() {
		return this.width * this.height;
	}
	
	public double calArea(int w,int h) {
		return (w *h);
	}
	
}
