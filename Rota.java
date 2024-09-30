package arraybyvishalsir;

import java.util.*;

public class Rota 
{
	public static void main(String[] args) 
	{
		        int[] array = {1, 2, 3, 4, 5};
		        int n = array.length;

		        int rightPositions = 2;
		        rightPositions = rightPositions % n; 
		        int[] rightRotated = new int[n];
		        for (int i = 0; i < n; i++) {
		            rightRotated[(i + rightPositions) % n] = array[i];
		        }
		        System.out.println("Right Rotated Array: " + Arrays.toString(rightRotated));

		        int leftPositions = 2;
		        leftPositions = leftPositions % n; 
		        int[] leftRotated = new int[n];
		        for (int i = 0; i < n; i++) {
		            leftRotated[(i - leftPositions + n) % n] = array[i];
		        }
		        System.out.println("Left Rotated Array: " + (Arrays.toString(leftRotated)));
		    }
}


