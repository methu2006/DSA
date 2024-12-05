/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package number;

/**
 *
 * @author HP
 */
public class Factorial {
    public static long factorial(int n){
        if(n==1)
            return 1;
        else
            return n*factorial(n-1);
    }
    
    public static void main(String[] args){
        long result = factorial(10);
        System.out.println("Factorial is " + result);
       
    }
}
