package com.savenko.mycollection;

import java.util.ArrayList;

public class TestInt {
    public static void main(String[] args) {

        //ArrayList ar = new ArrayList(-10);


        FixedSizeCollection col = null;

        col = new FixedSizeCollection(5);


        col.add(20);
        col.add(30);
        col.add(70);
        col.add(50);

        print(col);

        System.out.println("Элемент с конца коллекции " + col.getElem());
        int i = 4;
        System.out.println("Элемент с индексом " + i + ": " + col.getElem(i));

        System.out.println("Коллекция после добавления элементов: ");

        col.add(100);
        col.add(200);
        col.add(300);
        print(col);


        int k = 1;
        System.out.println("Коллекция после удаления " + k + "-го элемента: ");
        col.delete(k);
        print(col);

    }
        private static void print (FixedSizeCollection col){
            for (int i = 0; i < col.size(); i++) System.out.print(col.getElem(i) + " ");
            System.out.println();
        }

}
