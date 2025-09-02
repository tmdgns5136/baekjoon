import java.util.*;
import java.io.*;
public class BJ2108 {
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int max = -4001;
        int min = 4001;
        HashMap<Integer, Integer> arr = new HashMap<>();
        int avg = 0;
        int bin = 0;
        int arr1[] = new int[N];
        for(int i =0; i<N; i++){
            int x = Integer.parseInt(br.readLine());
            if(arr.containsKey(x)){
                arr.put(x, arr.get(x) + 1);
            }
            else{
                arr.put(x, 1);
            }
            arr1[i] = x;
            avg += x;
            bin = Math.max(bin, arr.get(x));
            max = Math.max(max, x);
            min = Math.min(min, x);
        }
        Set<Integer> key = arr.keySet();
        Arrays.sort(arr1);
        List<Integer> arr2 = new ArrayList<>();
        Iterator<Integer>it = key.iterator();
        while(it.hasNext()){
            int x = it.next();
            if(arr.get(x) == bin){
                arr2.add(x);
            }
        }
        Collections.sort(arr2);
        System.out.println(Math.round((double)avg/N));
        System.out.println(arr1[Math.round(N/2)]);
        System.out.println(arr2.size() == 1 ? arr2.get(0) : arr2.get(1));
        System.out.println(max - min);
        
    }
}
