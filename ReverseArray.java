package arraybyvishalsir;

public class ReverseArray {

	public static void main(String[] args)
	{
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		
		for (int i = 0; i < a.length / 2; i++) 
		{
            int temp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = temp;
        }
        System.out.println("Reversed array:");
        for (int num : a) {
            System.out.print(num + " ");
        }
	}

}
