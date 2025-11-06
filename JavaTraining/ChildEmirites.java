package JavaTraining;

public class ChildEmirites extends ParentAirCraft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildEmirites c=new ChildEmirites();
		c.engine();
		c.Saftyguidelins();
		c.bodycolor();
		

	}

	@Override
	public void bodycolor() {
		// TODO Auto-generated method stub
		
		System.out.println("Red color");

		
	}

}
