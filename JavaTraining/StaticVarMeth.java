package JavaTraining;

public class StaticVarMeth {
	
	String name; //Instance variable
	String fatherName; //Instance variable
	static String surname = "Kumbar"; //Class variable
	static int i=0; //Class variable
	
	StaticVarMeth(String name,String fathername) //local varibale
	{
		this.name = name;
		this.fatherName = fathername;
		i++;
		System.out.println(i);	
	}
	
	public void getSurname() //instance method
	{
		System.out.println(name+ " " +fatherName+ " " +surname );
	}
	
	public static void getdata()
	{
		System.out.print(surname);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVarMeth svm=new StaticVarMeth("Pratham","Sunil");
		StaticVarMeth svm1=new StaticVarMeth("Sushmita","jatteppa");
		svm.getSurname();
		svm1.getSurname();
		StaticVarMeth.getdata();

		
		

	}

}
