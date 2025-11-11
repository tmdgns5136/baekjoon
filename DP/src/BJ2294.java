// 동전 2(골드5)
// DP
// dp[i] = min(dp[i], dp[i-coin] + 1)
// i-coin을 만든 뒤 coin하나 추가하면 i원이 됨
// dp[i-coin] + 1 -> 새로운 동전 사용시 필요한 개수
import java.io.*;
import java.util.*;
public class BJ2294 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int coins[] = new int[n];
        for(int i = 0; i<n; i++){
            coins[i] = Integer.parseInt(br.readLine());
        }
        int dp[] = new int[k+1];
        Arrays.fill(dp, Integer.MAX_VALUE); // dp값 최대 int값으로 초기화;
        Arrays.sort(coins); // coin 배열 정렬
        dp[0] = 0; 
        for(int coin : coins){
            for(int j = coin; j<=k; j++){
                if(dp[j - coin] != Integer.MAX_VALUE) // 오버플로우 방지
                    dp[j] = Math.min(dp[j], dp[j-coin] + 1);
            }
        }
        if(dp[k] == Integer.MAX_VALUE){
            System.out.println(-1);
        }
        else{
            System.out.println(dp[k]);
        }
        
    }
}
