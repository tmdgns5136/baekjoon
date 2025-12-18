// 이항 계수 2(실버2)
// DP(파스칼 삼각형 이용)
// (n k) = (n-1 k-1) + (n-1 k)
import java.io.*;
import java.util.*;
public class BJ11051 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int dp[][] = new int[N+1][K+1];
        for(int i = 1; i<=N; i++){
            dp[i][0] = 1;
            if(i <= K){
                dp[i][i] = 1;
            }
        }

        for(int i = 1; i<=N; i++){
            for(int j = 1; j<=K && j<i; j++){
                dp[i][j] = (dp[i-1][j-1] + dp[i-1][j]) % 10007;
            }
        }
        System.out.println(dp[N][K]);
    }
}
