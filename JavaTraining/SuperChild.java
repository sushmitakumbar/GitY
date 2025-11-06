package JavaTraining;

public class SuperChild extends SuperParent{
	
	String s1="Sushmita";
	
	public void getString()
	{
		System.out.println(s1);
		System.out.println(super.s1);

		
	}
	
	public SuperChild()
	{
		super();
		System.out.println("Hello Pratham");

	}
	
	public void getdata()
	{
		super.getdata();
		System.out.println("Hello super child");

	}

	public static void main(String[] args) {  
		// TODO Auto-generated method stub
		
		SuperChild sc=new SuperChild();
		sc.getString();
		sc.getdata();
		

	}

}
