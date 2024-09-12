/*Your code attempts to perform the required substring reversals directly, which works for small inputs but leads to time complexity issues for larger inputs. Specifically, reversing portions of the string multiple times for large inputs becomes too slow, which is why you're getting a "time limit exceeded" verdict.

Correct Approach
To handle this problem efficiently, you should use a technique involving a difference array, which helps track how many times each character needs to be reversed. This allows you to determine the final position of each character in a single pass, achieving O(N + M) time complexity.

Key Mistakes
Direct Reversals: Reversing substrings directly in each iteration is inefficient.
Nested Loops: The nested loop structure leads to an O(N * M) complexity, which is too slow for the given constraints.
Corrected Code
Here's a minimal adjustment to your code that implements the efficient approach using a reversal count array:*/

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
        
        int[] reversals = new int[N + 1];
        
        for (int i = 0; i < M; i++) {
            int Ai = A[i];
            int index = Ai - 1;
            reversals[index]++;
            reversals[N - Ai]--;
        }
        
        int currentReversals = 0;
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < N; i++) {
            currentReversals += reversals[i];
            if (currentReversals % 2 == 0) {
                sb.append(S.charAt(i));
            } else {
                sb.append(S.charAt(N - i - 1));
            }
        }
        
        System.out.println(sb.toString());
    }
}
/*
Explanation of Changes
Reversal Count Array: Added reversals array to track the number of reversals affecting each index.
Update Reversals: For each Ai operation, update the reversals array to increase and decrease counts accordingly.
Apply Reversals: Traverse the string and apply reversals based on the reversals counts in a single loop.
These changes make the code efficient enough to handle the problem within the given constraints.
*/
