// 동물원(실버1)
// DP
// dp[0]: 사자 없이
// dp[1]: 사자 왼쪽 우리
// dp[2]: 사자 오른쪽 우리
import java.io.*;
public class BJ1309 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int dp[][] = new int[N+1][3];
        int sum = 0;
        dp[1][0] = 1;
        dp[1][1] = 1;
        dp[1][2] = 1;
        if(N == 1){
            for(int i = 0; i<3; i++){
                sum += dp[N][i];
            }
            System.out.println(sum);
        }
        else{
            for(int i = 2; i<=N; i++){
                dp[i][0] = (dp[i-1][0] + dp[i-1][1] + dp[i-1][2])%9901;
                dp[i][1] = (dp[i-1][0] + dp[i-1][2])%9901;
                dp[i][2] = (dp[i-1][0] + dp[i-1][1])%9901;
            }

            for(int i = 0; i<3; i++){
                sum += dp[N][i];
            }
            System.out.println(sum%9901);
        }
    }

}
