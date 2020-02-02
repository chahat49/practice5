import java.io.*;
import java.util.* ;

class GFG {
	public static void main (String[] args) {
	    Scanner input = new Scanner (System.in);
	    int t = input.nextInt();
	    while(t!=0)
	    {
	        int n = input.nextInt();
	        int arr[] = new int[n] ;
	        for(int i=0;i<n;i++) arr[i] = input.nextInt();
	        //System.out.println();
	        int  k=0; 
	        int narr[] = new int[n] ;
	        for(int i=0;i<n/2;i++)
	        {
	            narr[k++] = arr[n-i-1] ;
	            narr[k++] = arr[i] ;
	        }
	        for(int i=0;i<n;i++)
	        {
	            System.out.print(arr[i]+ " ");
	        }
	        System.out.println();
	        t-- ;
	    }
	}
}