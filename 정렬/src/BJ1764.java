import java.util.*;
public class BJ1764 {
    static boolean binarySearch(String arr[], String key){
        int low = 0;
        int high = arr.length-1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid].equals(key)) return true;
            if(arr[mid].compareTo(key) < 0){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int sum = 0;
        String arr[] = new String[N];
        String arr1[] = new String[N];
        for(int i = 0; i<N; i++){
            String name = sc.next();
            arr[i] = name;
            arr1[i] = "0";
        }
        Arrays.sort(arr);
        int k = 0;
        for(int i = 0; i<M; i++){
            String name = sc.next();
            
            if(binarySearch(arr, name)){
                    arr1[k] = name;
                    k+=1;
                    sum+=1;
                }
        }
        Arrays.sort(arr1);
        System.out.println(sum);
        for(int i =0; i<arr1.length; i++){
            if(arr1[i].equals("0")){
                continue;
            }
            else{
                System.out.println(arr1[i]);
            }
        }
        sc.close();
    }
}
