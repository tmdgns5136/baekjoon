import java.io.*;
public class BJ11727 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int dp[] = new int[n+1];
        if(n == 1){
            System.out.println(1);
        }
        else if (n == 2){
            System.out.println(3);
        }
        else{
            dp[1] = 1;
            dp[2] = 3;
            for(int i =3; i<=n; i++){
                dp[i] = 2*(dp[i-2]%10007) + (dp[i-1]%10007); // 가로타일 2개 or 2x2타일 1개 + 세로타일 1개
            }
            System.out.println(dp[n]%10007);
        }
    }
}
