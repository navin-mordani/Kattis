import java.util.Scanner;

public class AllDifferentDirections {

	
	public static double[][] calculateDestinations(int n,Scanner sc){
		System.out.println(n);
		for(int i = 0; i < n; i++){
			String line = sc.nextLine();
			System.out.println(line);
		}
		
		return null;
	}
	public static String getInput(Scanner sc){
		return sc.nextLine();
	}
	static void foo(int a[]){
	a [0]= 25; 
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n  = 0;
		int x[] = {1,2};
		foo(x);
		System.out.println("X is " + x[0]);
		while(true){
			
			n = Integer.parseInt(sc.next()); // number of people to whom directions were asked
			if (n == 0)
				return;
			sc.nextLine();
			calculateDestinations(n, sc);
		}
		
		
		
					
	}
}
