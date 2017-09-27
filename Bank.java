import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Scanner;



public class Bank {
    
    ArrayList<ArrayList<Integer>> bucketArray = null;
    int N = 0;
    int T = 0;
    Hashtable<Integer, ArrayList<Integer>> hashtab = new Hashtable<Integer, ArrayList<Integer>>();
    int[] currentLargest = null;
    public int evaluate(){
        Scanner sc = new Scanner(System.in);
        
        N = sc.nextInt();
        T = sc.nextInt();
        //System.out.println(N + " " + T);
        Integer c = 0;
        Integer t = 0;
        currentLargest = new int[T+1];
        
        for(int loop = 0;loop<T + 1;loop++){
            hashtab.put(loop, new ArrayList<Integer>());
            //System.out.println("Put " + hashtab.get(loop));
            
        }
            
        
        for(int loop = 0; loop < N; loop++){
            c = sc.nextInt();
            t = sc.nextInt();
            hashtab.get(t).add(c);          
        }
        for(int i = 0;i < T + 1;i++){
            ArrayList<Integer>temp = hashtab.get(i);
            temp.sort(null);
            currentLargest[i] = temp.size() - 1; 
        }
            
        
        //for(int loop = 0;loop<T+1;loop++)
        //  System.out.println(hashtab.get(loop));
        
        int max = -1;
        int maxIndex = -1;
        int total = 0;
        //System.out.println("Finding Best");
        for(int loop = T; loop >=0 ; loop--){
            max = -1;
            maxIndex = -1;
            for(int j = T;j>=loop;j--){
                int index = currentLargest[j];
                if(index<0) continue;
                int temp = hashtab.get(j).get(index);
                if(temp>max){
                    max = temp;
                    maxIndex = j;
                }
            }//end of j for loop
            if(maxIndex>-1)
             {
                //System.out.println(max + " " + maxIndex);
                currentLargest[maxIndex] -= 1;
                total += max;
             }

        }
        //System.out.println("Total " + total);
        return total;
    }

    public static void main(String[] args) {
        Bank obj = new Bank();
        System.out.println(obj.evaluate());
    }
}


