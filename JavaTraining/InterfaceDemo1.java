package JavaTraining;

public class InterfaceDemo1 implements InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceDemo i=new InterfaceDemo1();
		InterfaceDemo1 s=new InterfaceDemo1();
		s.hello();
		
		i.greenGo();
		i.redStop();
		i.FlashYellow();
		
		

	}
	
	

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("Green Go Implementation");
		
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		
		System.out.println("redStrop Implementation");

		
	}

	@Override
	public void FlashYellow() {
		// TODO Auto-generated method stub
		
		System.out.println("FlashYellow Implementation");

		
	}



	@Override
	public void hello() {
		// TODO Auto-generated method stub
		System.out.println("Hello");

		
	}

}
