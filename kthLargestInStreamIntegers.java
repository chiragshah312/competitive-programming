// Find kth largest element in a stream of integers at arrival of every integer
import java.util.*;
import java.lang.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int T = Integer.parseInt(sc.nextLine());
		for(int i=0; i<T; i++){
		    int k = sc.nextInt();
		    int n = sc.nextInt();
		    int[] sortedArray = new int[n];
		    for(int j=0; j<n; j++){
		        sortedArray[j] = -1;
		    }
		    for(int j=0; j<n; j++){
		        sortedArray[j] = sc.nextInt();
		        int current = j;
			while(true){
			    if(current == 0){
				break;
			    }
			    if(sortedArray[current] > sortedArray[current-1]){
				int temp = sortedArray[current];
				sortedArray[current] = sortedArray[current-1];
				sortedArray[current-1] = temp;
			    }
			    else{
				break;
			    }
			    current--;
			}
			System.out.print(sortedArray[k-1]);
			System.out.print(" ");
		    }
		System.out.print("\n");
		}
	}
}
