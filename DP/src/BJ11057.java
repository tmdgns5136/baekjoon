// 오르막 수(실버1)
// DP
// dp[자리수][마지막 숫자] = dp[i][j]
// j보다 작은 수로 끝나는 경우의 수 + i-1자리에서 j수로 끝나는 경우의 수
import java.io.*;
public class BJ11057 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int dp[][] = new int[N+1][10];
        int sum = 0;
        for(int i = 0; i<10; i++){
            dp[1][i] = 1;
        }
        if(N == 1){
            for(int i = 0; i<10; i++){
                sum += dp[1][i];
            }
            System.out.println(sum);
        }
        else{
            for(int i = 2; i<=N; i++){
                dp[i][0] = 1; // 0으로 끝나는 경우는 1가지
                for(int j = 1; j<10; j++){
                    dp[i][j] = (dp[i][j-1] + dp[i-1][j])%10007;
                    
                }
            }
            for(int i = 0; i<10; i++){
                sum += dp[N][i];
            }
            System.out.println(sum%10007);
        }
        
    }
}
