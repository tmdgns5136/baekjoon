import java.io.*;
import java.util.*;
public class BJ17298 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int arr[] = new int[N];
        for(int i =0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<N; i++){
            int check = 0;
            for(int j = i+1; j<N; j++){
                if(arr[i] < arr[j]){
                    sb.append(arr[j] + " ");
                    check = 1;
                    break;
                }
            }
            if(check == 0) sb.append(-1 + " ");
        }
        System.out.println(sb);
    }
}
