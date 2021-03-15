
public class Merge_2_Sorted_arrays {

	public static void printArray(int ar[]) {
		for(int e:ar) {
			System.out.print(e+"=>");
		}
		System.out.println();
	}
	public static void merge(int ar[] , int br[]) {
		if(ar.length > br.length) {
			merge(br, ar);
			return;
		}
		
		int i=0,j=0;
		int m =ar.length, n=br.length;
		while(i<m) {
			if(ar[i]>br[j]) {
				int temp = ar[i];
				ar[i] = br[j];
				
				int k =j+1;
				while(k<n && temp >br[k]) {
					br[k-1] = br[k];
					k++;
				}
				br[k-1] = temp;
			}
			System.out.println("===="+i);
		    printArray(ar);
		    printArray(br);
			i++;
		}
	}
	
	public static void main(String[] args) {
	    int arr1[] = new int[]{1, 5, 9, 10, 15, 20};
	    int arr2[] = new int[]{2, 3, 8, 13};
	    
	    
	    merge(arr1 , arr2);
	    printArray(arr1);
	    printArray(arr2);
	}
}
