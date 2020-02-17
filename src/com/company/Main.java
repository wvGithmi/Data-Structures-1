package com.company;

public class Main {

    public static void main(String[] args) {

	    //DynamicArray arr = new DynamicArray();

        //Example usage of IntArray class
        IntArray ar = new IntArray(50);
        ar.add(3);
        ar.add(7);
        ar.add(6);
        ar.add(-2);

        ar.sort(); //[-2, 3, 6, 7]

        //Prints[-2, 3, 6, 7]
        for(int i = 0 ; i < ar.size() ; i++){
            System.out.println(ar.get(i));
        }

        //Prints [-2, 3, 6, 7]
        System.out.println(ar);

    }
}
