import java.util.*;
import java.io.*;
public class BJ7662 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<T; i++){
            int K = Integer.parseInt(br.readLine());
            TreeMap<Integer, Integer>map = new TreeMap<>();
            for(int j = 0; j<K; j++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                String s = st.nextToken();
                int n = Integer.parseInt(st.nextToken());
                if(s.equals("I")){
                    map.put(n, map.getOrDefault(n, 0) + 1);
                }
                else if(s.equals("D")){
                        if(map.size() == 0){
                            continue;
                        }
                        else{
                        if(n == 1){
                            int max = map.lastKey();
                            if(map.get(max) == 1) map.remove(max);
                            else map.put(max, map.get(max) -1);
                        }
                        if(n == -1){
                            int min = map.firstKey();
                            if(map.get(min) == 1) map.remove(min);
                            else map.put(min, map.get(min) -1);
                        }
                    }
                }
            }
            if(map.size() == 0){
                sb.append("EMPTY\n");
            }
            else{
                sb.append(map.lastKey()).append(" ").append(map.firstKey()).append("\n");
            }
        }
        System.out.println(sb);
    }
}
