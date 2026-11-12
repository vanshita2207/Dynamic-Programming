
public class StringConversion {
    public static void main(String[] args) {
        String s1 = "pear";
        String s2 = "sea";
        int len = lcs(s1, s2);

        System.out.print("Total no of Delete and insert operations: ");
        System.out.println((s1.length() - len) + (s2.length() - len));
        
        System.out.println("Delete operation : " + (s1.length() - len));
        System.out.println("Insert operation : " + (s2.length() - len));
    }

    public static int lcs(String s1, String s2){
        int n = s1.length();
        int m = s2.length();
        int[][] dp = new int[n+1][m+1];

        for(int i=0; i<n+1; i++){
            dp[i][0] = 0;
        }
        for(int j=0; j<m+1; j++){
            dp[0][j] = 0;
        }

        for(int i=1; i<n+1; i++){
            for(int j=1; j<m+1; j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }
                else{
                    int ans1 = dp[i-1][j];
                    int ans2 = dp[i][j-1];
                    dp[i][j] = Math.max(ans1, ans2);
                }
            }
        }
        return dp[n][m];
    }
}
