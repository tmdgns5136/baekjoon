// 1로 만들기 2(골드5)
// DP
// DP를 갱신하면서 경로도 같이 갱신해줌
import java.io.*;
import java.util.*;
public class BJ12852 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int dp[] = new int[N+1];
        int prev[] = new int[N+1]; // 경로 추적을 위한 배열
        for(int i = 2; i<=N; i++){
            dp[i] = dp[i-1] + 1;
            prev[i] = i-1;
            if(i % 2 == 0){
                if(dp[i] > dp[i/2] + 1){
                    dp[i] = dp[i/2] + 1;
                    prev[i] = i/2;
                }
            }
            if(i % 3 == 0){
                if(dp[i] > dp[i/3] + 1){
                    dp[i] = dp[i/3] + 1;
                    prev[i] = i/3;
                }
            }
        }
        System.out.println(dp[N]);
        for(int i = N; i>0;){
            System.out.printf("%d ", i);
            i = prev[i];
        }

    }
}
