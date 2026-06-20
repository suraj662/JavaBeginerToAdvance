package com.example;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    // public int solve(int coins[],int index ,  int sum) {
    //     // code here.
    //     if(sum == 0){
    //         return 1;
    //     }

    //     if(sum < 0 || index == coins.length){
    //         return 0;
    //     }
    //     int include =0;

    //     if(sum > 0){
    //     include = solve(coins , index , sum - coins[index]);
    //     }

    //     int exclude = solve(coins , index + 1 ,sum);

    //     return include + exclude;
    // }

    //recursion+memoization
    // public int solveMem(int coins[],int index ,  int sum , int[][] dp) {
    //     //b.c
    //     if(sum == 0) return 1;

    //     if(index == coins.length) return 0;

    //     if(dp[index][sum] != -1){
    //         return dp[index][sum];
    //     }
    //     int include =0;
    //     if(sum >= coins[index]){
    //         include = solveMem(coins , index, sum - coins[index] ,dp);
    //     }

    //     int exclude = solveMem(coins ,index+1, sum,dp);

    //     dp[index][sum] = include + exclude;
    //     return dp[index][sum];
    // }

    //bottom up approach
    // public int solveTab(int coins[],int index ,  int sum){
    //     int n = coins.length;
    //     int[][] dp = new int[n + 1][sum+1];

    //     // Base case 1: If target sum is 0, there is exactly 1 way (pick no coins)
    //     for (int i = 0; i<= n; i++) {
    //         dp[i][0] = 1;
    //     }

    //     for(int i=1;i<=n;i++){
    //         for(int j=1;j<= sum;j++){
    //             int include =0;

    //             if(j >= coins[i-1]){
    //                 include = dp[i][j - coins[i-1]];
    //             }
    //             int exclude = dp[i -1][j];
    //             dp[i][j] = include + exclude;
    //         }
    //     }
    //     return dp[n][sum];
    // }

    //space optimization
    public int solveOpti(int[] coins ,int sum){
        int n = coins.length;

        // Create two rows of size (sum + 1)
        int[] prev = new int[sum + 1];
        int[] curr = new int[sum + 1];
        prev[0] = 1;


        for (int i = 1; i <= n; i++) {
            curr[0] = 1;
            for (int j = 1; j <= sum; j++) {

                int include = 0;
                if (j >= coins[i - 1]) {
                    include = curr[j - coins[i - 1]];
                }
                int exclude = prev[j];

                curr[j] = include + exclude;
            }
            int[] temp = prev;
            prev = curr;
            curr = temp;
        }
        return prev[sum];
    }


    public int count(int coins[], int sum) {

        //int[][] dp = new int[coins.length][sum +1];
        // Fill the array with -1 to represent unvisited states
        // for (int[] row : dp) {
        //     Arrays.fill(row, -1);
        // }
        // Start from index 0 with the initial target sum
        //return solveTab(coins, 0, sum);

        return solveOpti(coins, sum);
    }
    static void main() {
        Main solver = new Main();

        // Test Case 1
        int[] coins1 = {1, 2, 3};
        int sum1 = 4;
        System.out.println("Test Case 1 - Input: coins = [1, 2, 3], sum = 4");
        System.out.println("Expected: 4 -> Output: " + solver.count(coins1, sum1));
        System.out.println("------------------------------------------------");

        // Test Case 2
        int[] coins2 = {2, 5, 3, 6};
        int sum2 = 10;
        System.out.println("Test Case 2 - Input: coins = [2, 5, 3, 6], sum = 10");
        System.out.println("Expected: 5 -> Output: " + solver.count(coins2, sum2));
        System.out.println("------------------------------------------------");

        // Test Case 3
        int[] coins3 = {5, 10};
        int sum3 = 3;
        System.out.println("Test Case 3 - Input: coins = [5, 10], sum = 3");
        System.out.println("Expected: 0 -> Output: " + solver.count(coins3, sum3));

    }
}
