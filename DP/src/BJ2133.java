// 타일 채우기(골드4)
// DP
// 기본 패턴: dp[n-2] * 3
// 특수 패턴: dp[n-4] * 2 + dp[n-6] * 2 + ... -> ㄱ자 모양처럼 특이하게 채워짐
// 2를 곱하는 이유(대칭이어서)
// N까지 채우는 경우 = N-2까지 채운 뒤 3개 기본 블록 붙이기 + 이전 공간에서 발생 가능한 특수한 조합들
import java.io.*;
public class BJ2133 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int dp[] = new int[31];
        dp[0] = 1;
        if(N % 2 == 1){
            System.out.println(0);
            return;
        }
        for(int i = 2; i<=N; i+=2){
            dp[i] = dp[i - 2] * 3;
            for(int j = 0; j<=i-4; j+=2){
                dp[i] += dp[j] * 2;
            }
        }
        System.out.println(dp[N]);
    }
}
