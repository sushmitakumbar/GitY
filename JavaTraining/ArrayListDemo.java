package JavaTraining;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> ald=new ArrayList<String>();
		ald.add("Pratham");
		ald.add("Sushmita");
		System.out.println(ald);
		
		ald.add(0,"Son");
		System.out.println(ald);
		
		ald.remove(2);
		ald.remove("Sushmita");
		System.out.println(ald);
		
		System.out.println(ald.get(1));
		
		ald.add("Testing");
		System.out.println(ald);

		
		//Testing
		System.out.println(ald.contains("Testing"));
		
		System.out.println(ald.indexOf("Pratham"));
		
		System.out.println(ald.isEmpty());
		
		System.out.println(ald.size());



		




		
		

	}

}
