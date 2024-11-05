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
public class BubbleSort{

    Integer[] a;
    
    public BubbleSort(Integer[] a){
        this.a = a;
    }
    
    public void swap (int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public void sort(Integer[] a){
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length - (i+1); j++){
				
                if (a[j] > a[j+1]){
                    swap(j,j+1);
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

        }
    }
}

class BubbleSortTest{
    public static void main(String []args){
        Integer[] a = {76, 6, 107, 92, 21, 23, 5, 9, 8,8143};
        BubbleSort sorter = new BubbleSort(a);
        
        
        System.out.println("Before sort: ");
        System.out.println(Arrays.deepToString(a));
        
        sorter.sort(a);
        
        System.out.println("After sort: ");
        System.out.println(Arrays.deepToString(a));

    }
}
     
   

