import java.util.*;
public class Main{
  public static void main (String[] args) {
    Queue<Integer> queue = new LinkedList<>();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] A = new int[n];
    for(int i=0 ; i<n ; i++)
    {
      A[i] = sc.nextInt();
      if(A[i]%2 == 0)
      {
        System.out.print(A[i]+" ");
      }
      else
      {
        queue.add(A[i]);
      }
    }
    while(!queue.isEmpty())
    {
       System.out.print(queue.remove());
       if(queue.isEmpty())
       {
         return;
       }
       else
       {
         System.out.print(" ");
       }
    }
    
  }
}
