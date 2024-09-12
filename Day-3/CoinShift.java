//two-pointer approCH
import java.util.*;
public class Main {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int[] a = new int[n];
  for(int i=0 ; i<n ; i++)
  {
    a[i] = sc.nextInt();
  }
  sc.close();
  int src = 0;
  int end = n-1;
  int temp = 0;
  while(src < end)
  {
    if(a[src] < a[end])
    {
      temp = a[src];
      a[src] = a[end];
      a[end] = temp;
      end--;
    }
    else if(a[src] < a[end])
    {
      src++;
    }
  }
  for(int i=0 ; i<n ; i++)
  {
    if(i==n-1)
    {
      System.out.print(a[i]);
      return;
    }
    System.out.print(a[i]+" ");
  }
  
  }
}
