package JavaTraining;

public class StringImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="Hello";
		String b="Hello";
		a.concat("Sushmita");
		System.out.println(a);
		
		String s=new String("Hello");
		String s1=new String("Hello");

		
		StringBuffer sb = new StringBuffer("Hello");
		sb.append(" World");
		System.out.println(sb);
		
		sb.insert(2, "welcome");
		System.out.println(sb);
		
		sb.replace(0, 4, "Pratham");
		System.out.println(sb);
		
		sb.delete(7, 15);
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		System.out.println(a.equals(b)); //true
		
		System.out.println(a==b); //true
		
		System.out.println(a.equals(s)); //true - equals method checks the content
		
		System.out.println(a==s); //false - equals operator checks the reference
		
		System.out.println(s1==s); //false - reference are different as they defined with class




		

	}

}
