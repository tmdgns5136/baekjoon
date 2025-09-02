import java.util.*;
import java.io.*;
public class BJ30802 {
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int arr[] = new int[6];
        for(int i = 0; i<6; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        int ts = 0;
        for(int i = 0; i<6; i++){
            if(arr[i] % T == 0){
                ts += arr[i] / T;
            }
            else{
                ts += arr[i] / T + 1;
            }
        }
        System.out.printf("%d\n%d %d", ts, N / P, N % P);
        
    }
}
