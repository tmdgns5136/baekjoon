import java.util.*;
public class BJ9184 {
    static int[][][] dp = new int[21][21][21];
    static int w(int a, int b, int c){
        if(a<=0 || b<=0 || c<=0) return 1;

        else if(a>20 || b >20 || c >20) return w(20,20,20);
        if(dp[a][b][c] != 0) return dp[a][b][c];

        else if(a<b && b<c){
            dp[a][b][c] =  w(a, b, c - 1) + w(a, b - 1, c - 1) - w(a, b - 1, c);
        }

        else {
            dp[a][b][c] =  w(a-1,b,c) + w(a-1,b-1,c) + w(a-1,b,c-1) - w(a-1, b-1, c-1);
        }
        return dp[a][b][c];
    }
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        while(true){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            if(a == -1 && b == -1 && c == -1) break;
            System.out.printf("w(%d, %d, %d) = %d\n", a,b,c,w(a,b,c));

        }
        scanner.close();
    }
}
