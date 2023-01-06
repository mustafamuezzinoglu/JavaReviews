package week08_10_29_2022;

import java.util.Arrays;

public class Task1_RotateLeft {
    public static void main(String[] args) {

        int[] x = {1, 2, 3};
        int temp = x[0];

        // int [] array=new int[x.length]; reverse yapmak istersek yeni bir array yazılmalı
//for(int i=x.length-1,k=0;i>=0;i--,k++){} reverse için for teers ve yeni bir herhangi bir isimde bir değer eklenir for a
        for (int i = 0; i < x.length - 1; i++) {
            x[i] = x[i + 1];
            //array[k]=x[i];

        }

        x[x.length - 1] = temp;
        //System.out.println(Arrays.toString(array)); reverse yapcaksak yazdırma şekli böyle
        System.out.println(Arrays.toString(x));


        int[] y = {9, 12, 10, 8};

        int temp1 = y[0];
        for (int i = 0; i <y.length-1 ; i++) {
            y[i]=y[i+1];
        }
        y[y.length-1] =temp1;
        System.out.println(Arrays.toString(y));



        int[] a = {7, 0, 0};

        /*
        Task 1    : Write a program that accepts an array and prints an array with the elements "rotated left"
		int[] x = {1,2,3};			 // = > [2,3,1]
		int[] y = {17,12,10,8};		 // = > [12,10,8,17]
		int[] a = {7,0,0}; 			 // = > [0,0,7]
         */

    }
}
