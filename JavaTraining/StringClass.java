package JavaTraining;

public class StringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Two way of creating string */
		/* 1 String Litrals*/
		
		String s= "Pratham";
		String s1="Pratham";
		
		
		
		/*2 By creating object of String*/
		
		String a=new String("Hello/Sushmita");
		
		System.out.println(a.charAt(2));
		
		System.out.println(s.indexOf("o"));
		
		System.out.println(s.substring(1, 3));
		
		System.out.println(s.substring(3));
		
		System.out.println(s.concat(" Sushmita"));
		
		System.out.println(s.length());
		
		System.out.println(s.trim());
		
		System.out.println(a.toLowerCase());
		
		System.out.println(a.toUpperCase());
		
		String arr[]=a.split("/");
		
		System.out.println(arr[0]);
		
		System.out.println(arr[1]);
		
		System.out.println(s.replace("h", "s"));

		
		
		
		

	}

}
