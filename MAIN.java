
class Main {
	double radius;
	final double pi=3.142;
	Main(double radius){
		this.radius = radius;
		
		
	}
	public void areaofcircle() {
		System.out.println("Area of circle:" + (pi*Math.pow(this.radius, 2)));
	}
	public void circumferenceoofcircle() {
		System.out.println("Circumference of circle:" + (2*pi*(this.radius)));
	}
	public void volumeofsphere() {
		System.out.println("Volume of sphere:" + ((4/3)*pi*Math.pow(this.radius, 2)));
	}
	public void surfaceofsphere() {
		System.out.println("Area of sphere:" + (4*pi*(Math.pow(this.radius,2))));
	}
	public double getradius() {
		return radius;
	}
	public void setradius(double radius) {
		this.radius=radius;
	}
	public double getpi() {
		return pi;
	}
	public static void main(String[]args) {
		Main obj=new Main(9);
			obj.areaofcircle();
			obj.setradius(3);
			obj.circumferenceoofcircle();
			obj.setradius(3);
			obj.surfaceofsphere();
			obj.setradius(1);
			obj.volumeofsphere();
	}
	}

