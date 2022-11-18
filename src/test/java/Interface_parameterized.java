import java.util.HashMap;
import java.util.Scanner;
/*
interface details{
	
	public void accept(int id, String name, String city);
}

class Employee implements details{
	public void accept(int id, String name, String city){
		Scanner scn= new Scanner (System.in);
		HashMap<String,String> details = new HashMap<String, String>();
		System.out.println("Enter name ");
		String str1= scn.nextLine();
		System.out.println("Enter City name ");
		String str2= scn.nextLine();
		System.out.println(details.put(str1, str2));
		if(str2.equals("pune"))
		{
			System.out.println("Welcome to pune");
		}
		else if (str2.equals("mumbai"))
		{
			System.out.println("Welcome to mumbai");
		}
		else{
			System.out.println("Wrong place");
		}
	}
}

class Staff implements details{
	public void accept(int age, String name2,String city2){
		age=17;
		Scanner scn= new Scanner (System.in);
		HashMap<String,String> details = new HashMap<String, String>();
		System.out.println("Enter name2 ");
		String str3= scn.nextLine();
		System.out.println("Enter City2 name ");
		String str4= scn.nextLine();
		System.out.println(details.put(str3, str4));
		if(str3.equals("pune"))
		{
			System.out.println("Welcome to pune");
		}
		else if (str3.equals("mumbai"))
		{
			System.out.println("Welcome to mumbai");
		}
		else{
			System.out.println("Wrong place");
		}
	}
}
*/

interface Details{
    public void accept(String name, int id,String city,int age);
}



class Emp implements Details{



   public void accept(String name, int id, String city, int age) {
        // TODO Auto-generated method stub
        
        System.out.println("Employee Information");
        System.out.println("Name:"+name);
        System.out.println("Id:"+id);
        System.out.println("City"+city);
        System.out.println("Age:"+age);
        
        if(city.equals("Pune")){
            System.out.println("Welcome to "+city);
        }else {
            System.out.println("Welcome to Mumbai");
        }
        
    }
    
}



class staff implements Details{




    public void accept(String name, int id, String city, int age) {
        // TODO Auto-generated method stub
        System.out.println("Employee Information");
        System.out.println("Name:"+name);
        System.out.println("Id:"+id);
        System.out.println("City:"+city);
        System.out.println("Age:"+age);
        
        if(age<=18){
            System.out.println("Not applicable for voting");
        }else {
            System.out.println("Applicable for voting");
        }
        
    }
    
}
public class Interface_parameterized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Details obj1;
		obj1 = new Emp();
		obj1.accept("prathamesh",100,"Pune",100);
		obj1 = new staff();
		obj1.accept("mahesh",200, "mumbai",200);

	}

}
