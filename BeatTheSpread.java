import java.util.Scanner;

/**
 * 
 */

/**
 * @author navin
 *
 */
public class BeatTheSpread {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberOfCases = sc.nextInt();
		for(int loop = 0; loop < numberOfCases; loop++){
			int sum = sc.nextInt();
			int absDiff = sc.nextInt();
			double greater = (double)(sum + absDiff) / 2;
			double smaller = (double)(sum - absDiff) / 2;
			if(smaller < 0)
				System.out.println("Impossible");
			else if(greater % 1 != 0)
				System.out.println("Impossible");
			else if(smaller % 1 !=0)
				System.out.println("Impossible");
			else
				System.out.println((int)greater + " " + (int)smaller);
		}
	}
}
