import java.io.*;
public class BJ4134 {
    static void pan(long n){
        long check = 0;
        if(n < 4){
            if(n == 3){
                System.out.println(n);
            }
            else{
                System.out.println(2);
            }
        }
        else{
        for(long i = n; ;i++){
            for(long j = 2; j<= Math.floor(Math.sqrt(i)); j++){
                if(i % j == 0){
                    break;
                }
                if(j == Math.floor(Math.sqrt(i))){
                    check = i;
                }
            }
            if(check != 0){
                System.out.println(check);
                break;
            }
        }
    }
    }
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());
        for(int i = 0; i<N; i++){
            long a = Long.parseLong(br.readLine());
            pan(a);
        }
        

    }
}
