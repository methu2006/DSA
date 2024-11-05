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
public class SelectionSortTest {
    Integer[] a;
    
    public SelectionSortTest(Integer[] a){
        this.a = a;
    }
    
    public void selectionSort(Integer[] a){
        int n = a.length;
        for(int i=0; i < n; i++){
            int min_idx = i; //i hithgnnw ey thm shorter kiyl
            for(int j = i; j < n; j++){
                if(a[j] < a[min_idx]){
                    min_idx = j;
                }
                System.out.println(
                "i = "
                +(i)
                +"; j = "
                +(j)
                +"; cur_min = "
                +a[min_idx]
                +"; "
                + Arrays.deepToString(a)
                );
        }
            swap(i, min_idx);
        }
    }
    
    public void swap(int i,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    
      public static void main(String[] args) {
           Integer[] a = {76,6,187,92,21,23,5,19,8,8143};
           SelectionSortTest sorter = new SelectionSortTest(a);
           System.out.println("Before Sorting: "+ Arrays.deepToString(a));
           sorter.selectionSort(a);
           System.out.println("After Sorting: "+ Arrays.deepToString(a));
      }
}

