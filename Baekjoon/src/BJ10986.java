import java.util.*;
public class BJ10986 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        long arr[] = new long[N];
        for(int i =0; i<N; i++){
            arr[i] = sc.nextLong();
        }
        long s[] = new long[M];
        long sum = 0;
        long prefix = 0;
        s[0] = 1;
        for(int i = 0; i<N; i++){
            prefix = (prefix+arr[i]) % M;
            if(prefix < 0) prefix += M;
            s[(int)prefix]++; 
        }
        for(int i =0; i<M; i++){
            if(s[i] >= 2){
                sum += (s[i] * (s[i]-1)) / 2;
            }
        }
       
        
        System.out.println(sum);
        sc.close();
    }
}
