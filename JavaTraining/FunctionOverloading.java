package JavaTraining;

public class FunctionOverloading {
	
	public void getData(int a)
	{
		System.out.println(a);
	}
	
	public void getData(String a)
	{
		System.out.print(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionOverloading fo=new FunctionOverloading();
		fo.getData(10);
		fo.getData("Pratham");
		

	}

}
