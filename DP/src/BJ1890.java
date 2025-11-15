// 점프(실버1)
// DP
// x, y를 jump하고 그 전 값을 더하면서 최종값을 찾음
import java.io.*;
import java.util.*;
public class BJ1890 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int game[][] = new int[N+1][N+1];
        for(int i = 1; i<=N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 1; j<=N; j++){
                game[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        long dp[][] = new long[N+1][N+1];
        dp[1][1] = 1;
        for(int i = 1; i<=N; i++){
            for (int j = 1; j<=N; j++){
                if(i == N && j == N) continue;
                int jump = game[i][j];
                if(i + jump <= N) dp[i+jump][j] += dp[i][j];
                if(j + jump <= N) dp[i][j+jump] += dp[i][j];
            }
        }
        System.out.println(dp[N][N]);
    }
}
