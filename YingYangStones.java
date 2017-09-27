import java.util.Scanner;
import java.util.Stack;

public class YingYangStones {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Character> stack = new Stack<Character>();
		String input = sc.next();
		for(int i = 0;i<input.length();i = (i+1)){
			Character ch = input.charAt(i);
			if(stack.isEmpty()){
				stack.push(ch);
			}
			else if(stack.peek().charValue() == ch.charValue()){
				stack.push(ch);
			}
			else{
				stack.pop();
			}
		}
		if(stack.isEmpty())
			System.out.println("1");
		else
			System.out.println("0");
	}
	
}
