// 분해합(브론즈2)
// 브루트포스
import java.io.*;
public class BJ2231 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        int check = 0;
        for(int i = 1; i<N; i++){
            sum = i;
            int j = i;
            while(j / 10 != 0){
                sum += j % 10;
                j /= 10;
            }
            sum += j;
            if(N == sum){
                check = i;
                break;
            }
        }
        System.out.println(check);
    }
}
