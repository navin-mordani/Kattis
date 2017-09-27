import java.util.Scanner;

public class RationalSequence {

	public static void doOperation(){
		Scanner sc = new Scanner(System.in);
		int numberOfCases = sc.nextInt();
		long[][] array = new long[numberOfCases][2];
		
		sc.nextLine();
		for(int loop = 0; loop<numberOfCases; loop++){
			String s = sc.nextLine();
			String[] line = s.split("\\s+|/");
			//System.out.println(" " + line[0] + " " + line[1] + " " + line[2]);
			array[loop][0] = Long.parseLong(line[1]);
			array[loop][1] = Long.parseLong(line[2]);
		}
		for(int loop=0;loop<numberOfCases;loop++){
		    int caseNumber = loop + 1;
			long numerator = array[loop][0];
			long denominator = array[loop][1];
			long answerNumerator = 0;
			long answerDenominator = 0;
			//System.out.println(numerator + " " + denominator);
			if(numerator < denominator){//left child
				answerNumerator = denominator;
				answerDenominator = denominator - numerator;
			}
			else if(denominator == 1){
				answerNumerator = 1;
				answerDenominator = numerator + 1;				
			}
			else{
				int countSteps = 0;
				while(numerator > denominator){
					numerator = numerator - denominator;
					countSteps++;
				}
				//System.out.println("Steps " + countSteps);
				//turn from here
				answerNumerator = denominator;
				answerDenominator = denominator - numerator;
				answerDenominator += answerNumerator * countSteps;
				/*for(int i = 0;i<countSteps;i++){
					answerDenominator = answerNumerator + answerDenominator;
				}*/
				//System.out.println("Turn to " + answerNumerator + "/" + answerDenominator);
			}
			System.out.println(caseNumber + " " + answerNumerator + "/" + answerDenominator);
		}
			
	}
	public static void main(String[] args) {
		doOperation();
		}
}
