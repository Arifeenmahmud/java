/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inharetance;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 *
 * @author Arifeen
 */
public class  NewClass {
    Date date = new Date();
    String Name;
    String Address;
    int Age;
    
    NewClass(String Name, String address, int age){
          this.Name =Name;
    }
    
    
    int salary=40000;
    
    NewClass(){
        
        this.salary=200;
       
      //new SimpleDateFormat("yyyy-MM-dd").parse(2016-09-05);
        System.out.println(""+date);
    }
    
}
