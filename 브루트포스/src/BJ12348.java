import java.io.*;
public class BJ12348 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());
        int len = String.valueOf(N).length();
        long i = Math.max(1,N - 9L*len);
        long check = 0;
        for(long k = i; k<N; k++){
            long sum = k;
            long j = k;
            while(j / 10 != 0){
                sum += j % 10;
                j /= 10;
            }
            sum += j;
            if(sum == N){
                check = k;
                break;
            }
        }
        System.out.println(check);

    }
}
