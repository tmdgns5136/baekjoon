import java.util.*;
public class BJ1620 {
    static boolean isNumeric(String str){
            return str.matches("\\d+");
        }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        HashMap<Integer, String> dogam = new HashMap<>();
        HashMap<String, Integer> ndogam = new HashMap<>();
        for(int i = 1; i<=N; i++){
            String s = sc.next();
            dogam.put(i, s);
            ndogam.put(s, i);
        }
        for(int i = 0; i<M; i++){
            String s = sc.next();
            if(isNumeric(s)){
                System.out.println(dogam.get(Integer.parseInt(s)));
            }
            else{
                System.out.println(ndogam.get(s));
            }
        }
        sc.close();
    }
}
