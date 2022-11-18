

interface car{
	public void door();
}

class BMW implements car{
	
	public void door(){
		int a;
		System.out.println("The door of BMW car");
	}
}

class XYZ implements car{
	public void door ()
	{
		int a=5,b=4,c;
		c=a+b;
		System.out.println("The XYZ car door="+c);
	}
}



public class InterfaceDemo {

	public static void main(String[] args) {
		car obj1;
		obj1= new BMW();
		obj1.door();
		obj1=new XYZ();
		obj1.door();
		

	}

}
