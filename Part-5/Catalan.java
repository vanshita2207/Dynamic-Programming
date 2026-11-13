// Recursion
public class Catalan {

    public static int CatalanRec(int n){
        if(n==0 || n==1) return 1;
        int ans = 0;
        for(int i=0; i<=n-1; i++){
            ans += CatalanRec(i) * CatalanRec(n-i-1);
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 40;
        System.out.println(CatalanRec(n));

    }
}
// but this code  = stack overflow condition (try for n=40)