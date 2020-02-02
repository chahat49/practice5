import java.util.*;

public class kthelement {
   public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int n = s.nextInt();
       int[] arr = new int[n];
       
       for(int i=0; i < n; i++){
           arr[i] = s.nextInt();
       }
       int k=s.nextInt();
    
     int g=-1;
   for(int i=0;i<n;i++)
{
      if(k==arr[i]){
        g=i;
        break;
      }

   }
   System.out.print(g);
}
}