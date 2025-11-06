package JavaTraining;


import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d=new Date();
		System.out.print(d.toString());
		SimpleDateFormat sdf=new SimpleDateFormat("M/d/yyyy");
		String formattedDate = sdf.format(d);
        System.out.println("Formatted date: " + formattedDate);
		
		

	}

}
