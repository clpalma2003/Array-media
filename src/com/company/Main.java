package com.company;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner algoritmos = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();

        int array[] = {23,45,12,76,21};

        double media = 0.0;

        //array.length es por la cantidad de elementos

        for (int i = 0; i < array.length; i++){
            media = media + array[i];
        }
         media = media / array.length;

        System.out.println(" La media es: " + media);







    }
}
