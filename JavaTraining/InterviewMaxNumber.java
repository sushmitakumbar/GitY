package JavaTraining;

public class InterviewMaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]=new int[3][3];
		 a[0][0]=10;
		 a[0][1]=6;
		 a[0][2]=7;
		 a[1][0]=7;
		 a[1][1]=11;
		 a[1][2]=3;
		 a[2][0]=2;
		 a[2][1]=7;
		 a[2][2]=4;
		 int max = a[0][0];
		 
		 for(int i=0;i<3;i++)
		 {
			 for(int j=0;j<3;j++)
			 {
				 if(a[i][j]>max)
				 {
					 max=a[i][j];
					 
				 }
			 }
		 }
		 System.out.print(max);
				

	}

}
