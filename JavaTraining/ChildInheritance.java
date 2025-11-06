package JavaTraining;

public class ChildInheritance extends ParentInheritance {
	
	public void engine()
	{
		System.out.print("New Engine");

	}
	
	public void color()
	{
		System.out.print(color);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildInheritance ci=new ChildInheritance();
		ci.color();
		ci.Break();
		ci.AudioSystem();
		ci.engine();
		

	}

}
