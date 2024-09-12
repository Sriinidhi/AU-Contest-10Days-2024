import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String S = sc.next();
        int N = S.length();
        
        int M = sc.nextInt();
        
        int[] A = new int[M];
        for (int i = 0; i < M; i++) {
            A[i] = sc.nextInt();
        }
        
        StringBuilder sb = new StringBuilder(S);
        
        for (int i = 0; i < M; i++) {
            int Ai = A[i];

            int start = Ai - 1;
            int end = N - Ai;
            
            while (start < end) {
                char temp = sb.charAt(start);
                sb.setCharAt(start, sb.charAt(end));
                sb.setCharAt(end, temp);
                start++;
                end--;
            }
        }
        
        System.out.println(sb.toString());
    }
}
