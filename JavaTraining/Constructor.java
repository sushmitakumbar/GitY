package JavaTraining;

public class Constructor {
	
	
	public Constructor()
	{
		System.out.println("Hello I am Default constructor");
	}
	
	public Constructor(int a, int b)
	{
		System.out.println("Hello I am Parameterize constructor");
		int c=a+b;
		System.out.print(c);
	}
	
	public Constructor(String str)
	{
		System.out.println("Hello I am Parameterize constructor");
		
		System.out.print(str);
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor c=new Constructor();
		Constructor cd=new Constructor(3,4);
		Constructor cdc=new Constructor("Hello");

		

	}

}
