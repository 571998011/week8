class circle {
	private double radians;
	private double area;
	
	public double getradians(){
		return radians;
	}
	public void setradians(double radians) {
		this.radians = radians;
	}
	public double area(){
		return (this.radians*this.radians*3.14159);
	}
	public String toString() {
		return " "+this.radians+"\n";
	}
}
