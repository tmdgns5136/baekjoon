import java.util.*;
import java.io.*;
public class BJ9375 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i<T; i++){
            int N = Integer.parseInt(br.readLine());
            HashMap<String, Integer>ot = new HashMap<>();
            int sum = 1;
            for(int j = 0; j<N; j++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                String a = st.nextToken();
                String b = st.nextToken();
                if(!ot.containsKey(b)){
                    ot.put(b, 1);
                }
                else{
                    ot.put(b, ot.get(b) + 1);
                }
            }
            LinkedList<String>keys = new LinkedList<>(ot.keySet());
            
            for(int k = 0; k < ot.size(); k++){
                sum *= (ot.get(keys.get(k))+1); // 모든 확률 + 1 곱한뒤 안입는 경우의 수빼기(-1)
            }
            System.out.println(sum-1);
                
            
        }

    }
}
