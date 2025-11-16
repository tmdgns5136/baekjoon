// 1, 2, 3 더하기 3(실버2)
// DP
// dp[n] = dp[n-1] + dp[n-2] + dp[n-3]
// n-1 -> 마지막에 1을 더했을때
// n-2 -> 마지막에 2를 더했을때
// n-3 -> 마지막에 3을 더했을때
import java.io.*;
public class BJ15988 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        long dp[] = new long[1000001];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        for(int j = 4; j<=1000000; j++){
                dp[j] = (dp[j-1] + dp[j-2] + dp[j-3])%1000000009;
            }
        for(int i = 0; i<T; i++){
            int n = Integer.parseInt(br.readLine());
            System.out.println(dp[n]%1000000009); 
        }
    }
}
