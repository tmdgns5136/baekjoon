// 제곱수의 합(실버2)
// DP
import java.io.*;
import java.util.*;
public class BJ1699 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int dp[] = new int[N+1];
        for(int i = 1; i<=N; i++){
            if(Math.sqrt(i) == Math.floor(Math.sqrt(i))){
                dp[i] = 1;
            }
            else{
                dp[i] = i;
            }
        }
        dp[1] = 1;
        for(int i = 1; i<=N; i++){
            for(int j = 1; i + j<=N; j++){
                dp[i+j] = Math.min(dp[i+j], dp[i] + dp[j]);
            }
        }
        System.out.print(dp[N]);
    }
}
