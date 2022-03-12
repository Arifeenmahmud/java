/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructoroverloading;

/**
 *
 * @author Arifeen Mahmud
 */
public class Test1 {
 private String name;

 public Test1() {
  System.out.println("Inside the default constructor");
 }

 public Test1(int i) {
  System.out.println("Inside the single parameter constructor with int value");
 }

 public Test1(String str) {
  System.out.println("Inside the single parameter constructor with string object");
 }

 public Test1(int i, int j) {
  System.out.println("Inside the double  parameter constructor with int");
 }
 
 public static void main (String args []){
  Test1 t1 = new Test1();
  Test1 t2 = new Test1(5);
  Test1 t3 = new Test1(5,4);
  Test1 t4 = new Test1("str");
  
  
 }

}
