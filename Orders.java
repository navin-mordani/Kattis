//package Assignment4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Orders {
    private int n = 0; // number of items on the menu
    private int[] price  = null; // price of each of the n items
    private int m  = 0; // number of orders
    private static final int Ambiguous = -999;

    public void solveProblem() {
        Scanner sc  = new Scanner(System.in);
        n = sc.nextInt();
        price = new int[n];
        //initialize the price of each item
        for(int i = 0;i<n;i++){
            price[i] = sc.nextInt();
        }//for(int i = 0;i<n;i++)System.out.print(price[i] + " ");
        m = sc.nextInt();
        int orderPrice = 0;
        int[] dpArray = null;
        for(int i = 0; i<m; i++){
            orderPrice  =  sc.nextInt();
            dpArray = new int[orderPrice + 1]; //from 0 to orderPrice amount can be spent
            Arrays.fill(dpArray, -1);//initialize the array with -1
            dpArray[0] = 0;
            for(int priceIndex=0;priceIndex<price.length;priceIndex++){
                for(int loop = 0;loop < dpArray.length;loop++){
                    if(dpArray[loop]!=-1){
                        int nextIndex = loop + price[priceIndex];
                        if(nextIndex < dpArray.length){
                            if(dpArray[loop] == Ambiguous)
                                dpArray[nextIndex] = Ambiguous;
                            else if(dpArray[nextIndex] == -1)
                                dpArray[nextIndex] = priceIndex;
                            else
                                dpArray[nextIndex] = Ambiguous;
                        }
                    }
                    /*if(loop % price[priceIndex] == 0){// multiple of item price
                        if(dpArray[loop] == -1)
                            dpArray[loop] = priceIndex;
                        else {
                            dpArray[loop] = Ambiguous;
                        }
                    
                    }
                    else if(dpArray[loop]!=-1){
                        int nextIndex = loop + price[priceIndex];
                        if(nextIndex < dpArray.length){
                            if(dpArray[loop] == Ambiguous)
                                dpArray[nextIndex] = Ambiguous;
                            if(dpArray[nextIndex] == -1)
                                dpArray[nextIndex] = priceIndex;
                            else
                                dpArray[nextIndex] = Ambiguous;
                        }
                    }
                    */      
                }
            }
            //for(int x:dpArray) System.out.print(x + " ");
            if(dpArray[orderPrice] == -1)
                System.out.println("Impossible");
            else if(dpArray[orderPrice] == Ambiguous)
                System.out.println("Ambiguous");
            else{ // backtrack
                ArrayList<Integer> output = new ArrayList<Integer>();
                int index = orderPrice;
                while(index!=0){
                    output.add(dpArray[index] + 1);
                    index -= price[dpArray[index]]; 
                }
                output.sort(null);
                
                for(Integer x:output) System.out.print(x + " ");
                System.out.println();
            }
        }
    }
    
    public static void main(String[] args) {
        Orders obj = new Orders();
        obj.solveProblem();
    }
}


