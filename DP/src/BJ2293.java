// 동전 1(골드4)
// DP이용
import java.util.*;
import java.io.*;
public class BJ2293 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int coins[] = new int[n];
        for(int i =0; i<n; i++){
            coins[i] = Integer.parseInt(br.readLine());
        }
        int dp[] = new int[k+1];
        dp[0] = 1; // 0원 아무것도 사용안하는 1가지

        for(int coin : coins){
            for(int j = coin; j <= k; j++){
                dp[j] += dp[j - coin]; // j원을 만드는 새로운 경우 = (j - coin)원을 만드는 경우의 수 + coin
            }
        }
        System.out.println(dp[k]);
    }
}
