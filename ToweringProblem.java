import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ToweringProblem {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arrayOfHeights = new int[6];
		Integer[] membersOfTower1 = new Integer[3];
		Integer[] membersOfTower2 = new Integer[3];
		for(int i = 0;i<6;i++)
			arrayOfHeights[i] = sc.nextInt();
		
		int heightOfTower1 = sc.nextInt();
		int heightOfTower2 = sc.nextInt();
		
		for(int i = 0; i<6; i++){
			for(int j = i+1; j<6; j++){
				for(int k = j+1; k<6; k++){
					int sum = arrayOfHeights[i] + arrayOfHeights[j] + arrayOfHeights[k];
					if(sum == heightOfTower1){
						membersOfTower1[0] = arrayOfHeights[i];
						membersOfTower1[1] = arrayOfHeights[j];
						membersOfTower1[2] = arrayOfHeights[k];
					}
					else if(sum == heightOfTower2){
						membersOfTower2[0] = arrayOfHeights[i];
						membersOfTower2[1] = arrayOfHeights[j];
						membersOfTower2[2] = arrayOfHeights[k];
					}
				}
			}
		}
		
		Arrays.sort(membersOfTower1, Collections.reverseOrder());
		Arrays.sort(membersOfTower2, Collections.reverseOrder());
		for(Integer i:membersOfTower1)
			System.out.print(i + " ");
		for(Integer i:membersOfTower2)
			System.out.print(i + " ");
	}
}
