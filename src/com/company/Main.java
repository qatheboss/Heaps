package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MaxHeap mh = new MaxHeap();
        mh.insert(5);
        mh.insert(6);
        mh.insert(3);
        System.out.println(mh);
        mh.insert(7);
        mh.insert(1);
        mh.insert(8);
        mh.insert(4);
        mh.insert(9);
        mh.insert(2);

        System.out.println(mh);
        System.out.println(mh.extractMax());
        System.out.println(mh);

        for (int i = 0; i < 8; i++) {
            System.out.println(mh.extractMax());
        }
        System.out.println(mh);


    }
}
