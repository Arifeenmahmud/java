package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int i, n, lar,sm, elem;
        System.out.printf ("Enter total number of elements ");
        elem=sc.nextInt();

        System.out.printf ("Enter first number ");
        n=sc.nextInt();

        lar = n;
        sm=n;
        for (i=1; i<= elem -1 ; i++)
        {
            System.out.printf ("Enter another number ");

            n=sc.nextInt();
            if (n>lar)
                lar=n;
            if (n<sm)
                sm=n;

        }
        System.out.printf ("The largest number is %d", lar);
        System.out.printf (" and The smallest number is %d \n", sm);

    }
}
