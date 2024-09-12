**#Coin Shift Challenge
**
Hey There, eager to challenge themselves, creates a puzzle during a break. This puzzle involves a special box that can change the direction of gravity.

Inside the box are n columns of coins, arranged in a straight line. The i-th column contains a[i] coins. Initially, gravity pulls the coins downward, keeping them stacked in their columns. But when the aspirant flips the switch, gravity shifts to the right, causing all the coins to move towards the right side of the box.

The figure shows the initial and final configurations of the coins in the box: the coins that have changed their position are highlighted in orange.

Initial and final configurations of coins in the box

Given the initial configuration of the coins in the special box, find the amounts of coins in each of the n columns after the gravity switch!

**Input**

The first line contains an integer n (1 ≤ n ≤ 106), the number of columns in the box.

The second line contains n space-separated integers a[1], a[2], ..., a[n] (1 ≤ a[i] ≤ 109), where a[i] denotes the number of coins in the i-th column.

Output

Print n space-separated integers representing the number of coins in each column after the gravity switch, arranged from left to right.

**Examples**

Input1

4

3 2 1 2

Output1

1 2 2 3

Input2

3

2 3 8

Output2

2 3 8

Note

In the first example case, it is shown in the figure. Each cube represents a coin.

The top cube of the first column falls to the top of the last column.

The top cube of the second column falls to the top of the third column.

The middle cube of the first column falls to the top of the second column.

In the second example case, the gravity switch does not change the heights of the coins.
