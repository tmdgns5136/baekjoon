import java.util.*;
public class BJ2485 {
    static int getGCD(int a, int b){
        if(b==0) return a;
        return getGCD(b, a % b);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int tree[] = new int[N];
        for(int i = 0; i < N; i++){
            tree[i] = sc.nextInt();
        }
        Arrays.sort(tree);

        int diffs[] = new int[N-1];
        for(int i = 0; i<N-1; i++){
            diffs[i] = tree[i+1] - tree[i];
        }
        
        int gcd = diffs[0];
        for(int i = 1; i<diffs.length; i++){
            gcd = getGCD(gcd, diffs[i]);
        }

        int totalTrees = (tree[N-1] - tree[0]) / gcd+1;
        int toPlant = totalTrees - N;
        System.out.println(toPlant);
        sc.close();
    }
}
