import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

public class ThreeDPrinterStatues {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int numberOfDays = (int)Math.ceil((Math.log(input)/Math.log(2)) + 1);
		System.out.println(numberOfDays);
		short x = 32676;
		float y = 10f;
		double z = 20f;
		System.out.println(z * y * x);
		x = (short)~x;
		System.out.println(x);
		x = 20*20;
		byte b = 5;
		b *= 10;
		x = (short)((short)6 + (short)x);
		char c = 10 +2;
		c = c+1;
		System.out.println(input++);
		if(input<15)
			
			{
			int a = 10;
			}
		else if(input<7){
			int a =0;
		}
		StringBuilder stringBuilder = new StringBuilder("ABC");
		stringBuilder.indexOf("A");
		String s ="ABC";s.indexOf(b);
		stringBuilder.append(new StringBuilder());
		System.out.println("is " + s.substring(0, 0));
		stringBuilder.insert(3, 'a');
		String array[] = {"A","B","A"};
		System.out.println(array[0] == array[2]);
		int []var = new int[3];
		System.out.println(Arrays.toString(var));
		for(int i = 0;i<var.length;i++) var[i] = i+5;
		List<Integer> l = new ArrayList<>();
		l.add(1);
		l.remove(new Integer(1));
		List<String> ls = Arrays.asList(array);
		array[2] = "Z";
		System.out.println(ls);
		ls.remove("A");
	}
	
}
