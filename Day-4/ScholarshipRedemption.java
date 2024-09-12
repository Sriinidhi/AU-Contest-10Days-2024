import java.util.*;
public class Main{
public static void main (String[] args) {
  
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();
    int[] denominations = {100,20,10,5,1};
    int sessions = 0;
    for(int i=0 ; i<denominations.length ; i++)
    {
      int denom = denominations[i];
      sessions += n/denom;//this line it considers to count
      //only when the denom divides n absolutely and gives 1 which is counted
      //then not dividing it means 0 untill it reaches with absolute dividing denom
      n %= denom;
    }
    System.out.print(sessions);
  }
  
}
