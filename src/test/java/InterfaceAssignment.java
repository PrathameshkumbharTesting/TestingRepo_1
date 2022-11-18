import java.util.Scanner;

interface shape{
	
	public void area();

}

class Rectangle implements shape{
	
	public void area(){
		int length,breadth,Rectangle_area;
		Scanner scn = new Scanner (System.in);
		System.out.println("Enter length= ");
		length=scn.nextInt();
		System.out.println("Enter breadth= ");
		breadth=scn.nextInt();
		Rectangle_area=2*length*breadth;
		System.out.println("Rectangle_area= "+Rectangle_area);
	}
}


class Circle implements shape{
	
	public void area(){
		int radius,Circle_area;
		Scanner scn = new Scanner (System.in);
		System.out.println("Enter Radius= ");
		radius=scn.nextInt();
		
		Circle_area=(int) (2*Math.PI*radius*radius);
		System.out.println("Circle_area= "+Circle_area);
		
	}
}



public class InterfaceAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		shape obj1;
		obj1= new Rectangle();
		obj1.area();
		obj1 = new Circle();
		obj1.area();
	}

}

// methods
// interface
// constructor
