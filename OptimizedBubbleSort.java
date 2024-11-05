/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package name;
import java.util.Arrays;

/**
 *
 * @author HP
 */
public class OptimizedBubbleSort {
    
    Integer[] a;
    
    public OptimizedBubbleSort(Integer[] array){
        this.a = array;
    }

    public void bubbleSort(Integer[] a){
        for(int i = 0; i < a.length; i++){
            boolean flag = false;
            for(int j = 0; j < a.length - (i+1); j++){
                if (a[j] > a[j+1]){
                    swap(j,j+1);
                    flag = true;  
                }
				System.out.println(
					"i = " 
					+ (i + 1) 
					+ "; j = " 
					+ (j + 1) 
					+ "; " 
					+ Arrays.deepToString(a)
				);
            }
            if(!flag)
                break;
        }
    }
    
    public void swap (int i, int j){
        int temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
 class OptimizedBubbleSortTest{
    public static void main(String []args){
        Integer[] a = {5, 6, 8, 9, 21, 23, 76, 92, 107, 8143};
        OptimizedBubbleSort sorter = new OptimizedBubbleSort(a);
        
        
        System.out.println("Before sort: ");
        System.out.println(Arrays.deepToString(a));
        
        sorter.bubbleSort(a);
        
        System.out.println("After sort: ");
        System.out.println(Arrays.deepToString(a));
    }
}

