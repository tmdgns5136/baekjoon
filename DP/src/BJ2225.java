// 합분해(골드5)
// DP
// dp[합][사용한 개수]
// dp[n][k] = dp[n-1][k] + dp[n][k-1]
// k개의 수로 n을 만든다고 할 때, 마지막 수가 0~n까지 가능 
// 그 마지막 수 빼고 나머지 합을 k-1개로 만들어야됨
import java.io.*;
import java.util.*;
public class BJ2225 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int dp[][] = new int[N+1][K+1];

        for(int i = 1; i<=K; i++){
            dp[0][i] = 1;
            for(int j = 1; j<=N; j++){
                dp[j][i] = (dp[j-1][i] + dp[j][i-1]) % 1000000000;
            }
        }
        System.out.println(dp[N][K] % 1000000000);
    }
}
