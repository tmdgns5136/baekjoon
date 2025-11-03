// 이친수(실버3)
// DP(피보나치 수열로 해결)
import java.io.*;
public class BJ2193 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long dp[] = new long[N+1];
        if(N == 1){
            System.out.println(1);
        }
        else{
            dp[1] = 1;
            for(int i = 2; i<=N; i++){
                dp[i] = dp[i-1] + dp[i-2];
            }
            System.out.println(dp[N]);
        }
        
    }
}
