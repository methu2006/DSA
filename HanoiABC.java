/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package number;

import static number.Factorial.factorial;

/**
 *
 * @author HP
 */
public class HanoiABC {
      static void hanoi(char src,char des,char aux,int n){
        if(n==1){
             System.out.println(src+"--->"+des);
}
        else{
            hanoi(src,aux,des,n-1);
            hanoi(src,des,aux,1);
            hanoi(aux,des,src,n-1);
        }
     }
 
    public static void main(String[] args){
        int NumofDisks = 4;
        hanoi('A','B','C',NumofDisks);
        
    }
       
}