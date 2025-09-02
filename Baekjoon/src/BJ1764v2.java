import java.util.*;
public class BJ1764v2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        Set<String> heard = new HashSet<>();
        for(int i = 0; i<N; i++){
            heard.add(sc.next());
        }

        List<String> result = new ArrayList<>();
        for(int i = 0; i<M; i++){
            String name = sc.next();
            if(heard.contains(name)){
                result.add(name);
            }
        }

        Collections.sort(result);
        System.out.println(result.size());
        for(int i = 0; i<result.size(); i++){
            System.out.println(result.get(i));
        }
        sc.close();
    }
}
