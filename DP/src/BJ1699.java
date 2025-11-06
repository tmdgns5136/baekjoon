// 제곱수의 합(실버2)
// DP
// 가능한 제곱 수만 고려(제곱 수가 있어야 항의 개수가 최소)
import java.io.*;
public class BJ1699 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int dp[] = new int[N+1];
        for(int i = 1; i<=N; i++){
            dp[i] = i;
            for(int j = 1; j * j < i; j++){
                dp[i] = Math.min(dp[i], dp[i - j*j]+1);
            }
        }
        System.out.println(dp[N]);
    }
}
