import java.util.*;
import java.io.*;
public class BJ10815 {
    static boolean binarySearch(int arr[], int t){
        int low = 0;
        int high = arr.length - 1;

        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] == t) return true;
            else if(arr[mid] < t){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return false;
    }
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i =0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i =0; i<M; i++){
            int t = Integer.parseInt(st.nextToken());
            if(binarySearch(arr, t)){
                sb.append("1 ");
            }
            else{
                sb.append("0 ");
            }
        }
        System.out.println(sb.toString().trim());
    }
}
