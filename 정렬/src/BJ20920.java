import java.util.*;
import java.io.*;
public class BJ20920 {
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<String, Integer>sa = new HashMap<>();
        for(int i = 0; i<N; i++){
            String s = br.readLine();
            if(sa.containsKey(s)){
                sa.put(s, sa.get(s)+1);
            }
            else{
                if(s.length() < M) continue;
                else{
                    sa.put(s, 1);
                }
            }
        }
        List<String> wl = new ArrayList<>(sa.keySet());
        wl.sort((w1,w2) -> {
            int f1 = sa.get(w1);
            int f2 = sa.get(w2);
            if(f1 != f2) return f2 - f1;
            // 자주나올수록 앞
            if(w1.length() != w2.length()) return w2.length() - w1.length();
            // 단어길이 길수록 앞
            return w1.compareTo(w2);
            // 사전 순
        });
        StringBuilder sb = new StringBuilder();
        for(String word : wl){
            sb.append(word).append("\n");
        }
        System.out.print(sb);
    }
}
