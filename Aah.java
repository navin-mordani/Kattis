import java.util.Scanner;

public class Aah {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		String output = s.length()>=t.length() ?"go":"no";
		System.out.println(output);
	}
}
