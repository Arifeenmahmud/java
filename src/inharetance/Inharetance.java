/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inharetance;

/**
 *
 * @author Arifeen
 */
public class Inharetance extends NewClass{

    /**
     * @param args the command line arguments
     */
     
    public static void main(String[] args) {
        // TODO code application logic here
        NewClass ne = new NewClass();
          int bonus = 10000;
          int sum = bonus+ne.salary;
        System.out.println("salary plus Bonus= "+(sum));
    }
    
}
