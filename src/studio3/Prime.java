package studio3;

public class Prime {

	public static void main(String[] args) {
		int[]array=new int[41];
		
		
		boolean[]TFarr = new boolean [41];
		for(int i=2;i<41;i++)
		{
			array[i]=i;
			TFarr[i]=true;
			
		}
		for(int i=2;i<41;i++)
		{
			if (TFarr[i]==true)
			{
			for(int j=2;j<41/i +1;j++)	
			{
				TFarr[i*j]=false;
			
			}
		}
		
	}

		for(int i=2;i<41;i++)
		{
			if(TFarr[i]==true)
			{
			System.out.println(i);
			}
		}
}

}