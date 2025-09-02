import java.io.*;
public class BJ11726 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long dp[] = new long[n+1];
        if(n == 1){
            System.out.println(1);
        }
        else if(n == 2){
            System.out.println(2);
        }
        else{
            dp[1] = 1;
            dp[2] = 2;
            for(int i =3; i<n+1; i++){
                dp[i] = (dp[i-1]%10007) + (dp[i-2]%10007); //세로타일 1개 + 가로타일 1개
            }
            System.out.println(dp[n]%10007);
        }
    }
}
