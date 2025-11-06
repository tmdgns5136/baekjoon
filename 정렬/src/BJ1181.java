import java.util.*;
public class BJ1181 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        HashSet<String>sa = new HashSet<>();
        for(int i = 0; i<N; i++){
            String s = sc.next();
            sa.add(s);
        }
        List<String>lt = new ArrayList<>(sa);

        lt.sort((a, b) -> {
            if(a.length() != b.length()){
                return a.length() - b.length();
            }
            return a.compareTo(b);
        });

        for(int i = 0; i<lt.size(); i++){
            System.out.println(lt.get(i));
        }
        sc.close();
    }
}
