package JavaTraining;

public class InterviewMinNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][]=new int[3][3];
		 a[0][0]=7;
		 a[0][1]=6;
		 a[0][2]=7;
		 a[1][0]=2;
		 a[1][1]=0;
		 a[1][2]=3;
		 a[2][0]=2;
		 a[2][1]=9;
		 a[2][2]=2;
		 int min = a[0][0];
		 
		 for(int i=0;i<3;i++)
		 {
			 for(int j=0;j<3;j++)
			 {
				 if(a[i][j]<min)
				 {
					min=a[i][j];
					
				 }
			 }
		 }
		 System.out.print(min);


		 

	}

}
