import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseanArray {
	public static void revarr(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n/2;i++) {
			int temp=arr[i];
			arr[i]=arr[n-1-i];
			arr[n-1-i]=temp;
		}
		
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		 ReverseanArray.revarr(arr);
		 System.out.println(Arrays.toString(arr));
	}

}
