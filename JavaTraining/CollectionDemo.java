package JavaTraining;

import java.util.ArrayList;

public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {3,5,5,6,6,8,7,7,1};
		
		//Print unique number form arrya list
		ArrayList<Integer> ad= new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			int k=0;
			
			if(!ad.contains(a[i]))
			{
				ad.add(a[i]);
				k++;
			
			for (int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					k++;
				}
			
			}
			
			System.out.println(a[i]);
			System.out.println(k);
			
			if(k==1)
				
			System.out.println(a[i]+"is unique number");
		}
	
	}
	}
}

	
	
	

	


