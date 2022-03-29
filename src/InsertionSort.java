/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertionsort;

/**
 *
 * @author Arifeen
 */
public class InsertionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] list = {1,2,3,4,56,5,-4};
        InsertionSort.insersionsort(list);
        for (int i = 0; i < list.length; i++) {
            int j = list[i];
            System.out.print(" " +j);

        }

    }
    public static void insersionsort(int[] list){
        for (int i = 0; i < list.length; i++) {
            int currentElement = list[i];
            int k;
            for (k = i - 1; k >= 0 && list[k] > currentElement; k--) {
                list[k + 1] = list[k];

            }
            list[k + 1] = currentElement;

        }
    }

}
