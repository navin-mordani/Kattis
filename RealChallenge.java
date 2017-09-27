import java.math.BigDecimal;
import java.util.Scanner;

public class RealChallenge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigDecimal input = new BigDecimal(sc.next());
		double fenceLength =  4 * Math.sqrt(input.doubleValue());
		System.out.println(fenceLength);
	}
}
