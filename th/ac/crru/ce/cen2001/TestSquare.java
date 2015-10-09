package th.ac.crru.ce.cen2001;

public class TestSquare {

	public static void main(String[] args) {
		Square s1 = new Square();
		
		s1.setWidth(10);
		s1.setHeight(20);
		
		System.out.println(s1.calArea(s1.getWidth(), s1.getHeight()));
		System.out.println(s1.calArea());
	}

}
