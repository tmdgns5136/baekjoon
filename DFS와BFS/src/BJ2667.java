import java.util.*;


public class BJ2667{
	static int sum = 0;
	static void bfs(int x, int y, int N, int arr[][]) {
		if (x < 0 || x >= N || y < 0 || y>=N) return;
		if (arr[x][y] == 0) return;
		arr[x][y] = 0;
		sum +=1;
		bfs(x+1, y, N, arr);
		bfs(x-1, y, N, arr);
		bfs(x, y+1, N, arr);
		bfs(x, y-1, N, arr);
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		scanner.nextLine();
		int arr[][] = new int[N][N];
		int arr2[] = new int[1000];
		int total = 0;
		for(int i =0; i<N; i++) {
			String line = scanner.nextLine();
			for(int j = 0; j<N; j++)
				arr[i][j] = line.charAt(j) - '0';
		}
		for(int i =0; i<N; i++) {
			for(int j =0; j<N; j++) {
				if(arr[i][j] == 1) {
					sum = 0;
					bfs(i, j, N, arr);
					arr2[total] = sum;
					total += 1;
				}
			}
		}
		System.out.println(total);
		Arrays.sort(arr2, 0, total);
		for(int i =0; i<total; i++)
			System.out.println(arr2[i]);
		scanner.close();
	}
}


