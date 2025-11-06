import java.util.*;
import java.io.*;
public class BJ11478 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        
        HashSet<String> arr = new HashSet<>();

        for(int i = 0; i<s.length(); i++){
            for(int j = i+1; j<=s.length(); j++){
                arr.add(s.substring(i,j));
            }
        }
        System.out.println(arr.size());
        

    }
}
