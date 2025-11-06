import java.util.*;
import java.io.*;
public class BJ25192 {
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet <String> arr = new HashSet<>();

        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        for(int i = 0; i<N; i++){
            String s = br.readLine();
            if(s.equals("ENTER")){
                sum += arr.size();
                arr = new HashSet<>();
            }
            else if(arr.contains(s)){
                continue;
            }
            else{
                arr.add(s);
            }
        }
        sum += arr.size();
        System.out.println(sum);
    }
}
