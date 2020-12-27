/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maxminarraylist.hough;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author asus
 */
public class MaxMinArrayList {

    static ArrayList<Integer> array = new ArrayList<>();
    static Scanner ton = new Scanner(System.in);
    
    public static void main(String[] args) {
       
        
        int num;
        
        System.out.println("How many elements: ");
        num = ton.nextInt();
        
        for (int i=0;i<num;i++) {
            System.out.print("Enter Element: ");
            array.add(ton.nextInt());
        }
        System.out.println(array+"\n");
        int max = findMax(array);
        System.out.println("Maximum value is = "+max);
        int min = findMin(array);
        System.out.println("Minimum value is = "+min);
    }
    static int findMax(ArrayList<Integer> array){
        int max = Integer.MIN_VALUE;
        for (int qq : MaxMinArrayList.array){
            if (qq>max){
                max=qq;
            }
        }
        return max;
    }
    static int findMin(ArrayList<Integer> array){
        int min = Integer.MAX_VALUE;
        for (int qq :MaxMinArrayList.array){
            if (qq<min){
                min=qq;
            }
        }
        return min;
    }
    
}
