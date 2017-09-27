import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class AkcijaSuccess {
	
	
	
	private Scanner sc = new Scanner(System.in);
	
	public int getAkcijaCostOfBooks(){
		
		int N = sc.nextInt(); // read the number of books
		Integer[] array = new Integer[N]; // declare an array to store the cost of all books
		int total = 0;
		for(int loop = 0; loop < N; loop++){
			int temp = sc.nextInt();
			total += temp;
			int j = loop - 1;
			array[j+1] = temp;
			/*for (; j >= 0; j--){
				if(array[j]<temp){
					array[j+1] = array[j];
				}
				else 
					break;
			}//end of inner loop
			array[j+1] = temp;*/
		}
		//
		Arrays.sort(array,Collections.reverseOrder());
		
		for(int loop=2;loop<N;loop = loop + 3)
			total -= array[loop];
		System.out.println(total);
		return 0;
	}
	
	
	public static void main(String[] args) {
		AkcijaSuccess akcijaSuccess = new AkcijaSuccess();
		akcijaSuccess.getAkcijaCostOfBooks();
	}

}
