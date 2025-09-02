import java.util.*;
public class BJ26069 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        HashMap<String, String> arr = new HashMap<>();
        for(int i = 0; i<N; i++){
            String a = sc.next();
            String b = sc.next();
            if((!arr.containsKey(a)) && (!arr.containsValue(b)) && !arr.containsKey(b) && !arr.containsValue(a)){
                sum += 2;
            }
            else if((!arr.containsKey(a)) && arr.containsValue(b)){
                sum += 1;
            }
            else if((arr.containsKey(a)) && (!arr.containsValue(b))){
                sum += 1;
            }
            arr.put(a,b);
        }
        System.out.println(sum);
        sc.close();
    }
}
