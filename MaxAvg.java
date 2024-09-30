package arraybyvishalsir;

public class MaxAvg 
{
	public static void main(String[] args) 
	{
		int max=0;
		int []a= {1,2,3,4,5,6};
		a[0]=max;
		for(int i=0;i<6;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			
		}
		System.out.println("Maximum no is "+max);
		int sum=0;
		for(int j=0;j<6;j++)
		{
			sum=sum+a[j];
		}
		double avg=sum/a.length;
		System.out.println("Sum is "+sum);
		System.out.println("Average of no is "+avg);
	}

}
