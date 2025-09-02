import java.util.*;
import java.io.*;
public class BJ17219 {
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashMap<String, String> arr = new HashMap<>();
        for(int i = 0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            String site = st.nextToken();
            String pass = st.nextToken();
            arr.put(site, pass);
        }
        StringBuilder sb = new StringBuilder();
        for(int i =0; i<M; i++){
            String site = br.readLine();
            sb.append(arr.get(site)).append("\n");
        }
        System.out.println(sb);
    }
}
