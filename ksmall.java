import java.util.*;

public class ksmall {
   public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int n = s.nextInt();
       int[] arr = new int[n];
       
       for(int i=0; i < n; i++){
           arr[i] = s.nextInt();
       }
       int k=s.nextInt();
     Arrays.sort(arr);
     int g=0;
   for(int i=0;i<n;i++)
{
      if(k==i){
        g=arr[i];
      }
   }
   System.out.print(g);
}
}