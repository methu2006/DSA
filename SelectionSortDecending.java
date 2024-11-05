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
public class SelectionSortDecending {
     Integer[] a;
    
    public SelectionSortDecending(Integer[] a){
        this.a = a;
    }
    
    public void selectionSortD(Integer[] a){
        int n = a.length;
        for(int i=0; i < n; i++){
            int max_idx = i; //i hithgnnw ey thm usama kiyl
            for(int j = i; j < n; j++){
                if(a[j] > a[max_idx]){
                    max_idx = j;
                }
                System.out.println(
                "i = "
                +(i)
                +"; j = "
                +(j)
                +"; cur_max = "
                +a[max_idx]
                +"; "
                + Arrays.deepToString(a)
                );
        }
            swap(i, max_idx);
        }
    }
    
    public void swap(int i,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    
      public static void main(String[] args) {
           Integer[] a = {76,6,187,92,21,23,5,19,8,8143};
           SelectionSortDecending sorter = new SelectionSortDecending(a);
           System.out.println("Before Sorting: "+ Arrays.deepToString(a));
           sorter.selectionSortD(a);
           System.out.println("After Sorting: "+ Arrays.deepToString(a));
      }
}



