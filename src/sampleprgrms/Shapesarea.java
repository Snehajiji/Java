package sampleprgrms;

public class Shapesarea {

	public static void main(String[] args) 
	{
		Shapesarea sp=new Shapesarea();
		sp.rectangle();
		sp.circle(5);
		double area=sp.triangle();
		System.out.println("Area of traingle = "+area);
		int area2=sp.square(10);
		System.out.println("Area of square = "+area2);

	}
	
//Method without returntype and without parameter
	public void rectangle()
	{
		int l=4,b=9,a;
		a=l*b;
		System.out.println("Area of rectangle = "+a);
	}
	
//Method without returntype and with parameter
	public void circle(int r)
	{
		double area=3.14*r*r;
		System.out.println("Area of circle = "+area);
	}
	
//Method with returntype and without parameter
	public double triangle()
	{
		int b=5,h=2;
		double a=0.5*b*h;
		return a;
	}
	
//Method with returntype and with parameter
	public int square(int a)
	{
		int area=a*a;
		return area;
	}
	


}
