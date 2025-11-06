import java.io.*;
import java.util.*;
public class BJ7785 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Set<String> c = new HashSet<>();
        for(int i =0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String pm = st.nextToken();
            if(pm.equals("enter")){
                c.add(name);
            }
            else if(pm.equals("leave")){
                c.remove(name);
            }
        }

        ArrayList<String> result = new ArrayList<>(c);
        Collections.sort(result);
        for(int i = c.size()-1; i>-1; i--){
            System.out.println(result.get(i));
        }

    }
}
