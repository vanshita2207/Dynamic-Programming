import  java.util.*;

public class ClimbingStairsMemo {

    public static int count(int n, int[] dp){
        if(n == 0) return 1;
        if(n < 0) return 0;

        if(dp[n] != -1) {
            return dp[n];
        }

        dp[n] = count(n-1, dp) + count(n-2, dp);
        return dp[n];
    }


    public static void main(String[] args) {
        int n = 5;
        int[] dp = new int[n+1];
        Arrays.fill(dp , -1);
        System.out.println(count(n, dp));
    }
}
