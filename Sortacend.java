package arraybyvishalsir;
import java.util.*;
public class Sortacend {

	public static void main(String[] args) {
	    int[] arr = {1, 90, 34, 89, 7, 9};
        int n = arr.length;

        int mid = n / 2;
        Arrays.sort(arr, 0, mid);
        Arrays.sort(arr, mid, n);
        for (int i = mid; i < n / 2 + mid; i++) {
            
            int temp = arr[i];
            arr[i] = arr[n - 1 - (i - mid)];
            arr[n - 1 - (i - mid)] = temp;
        }
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

	}


