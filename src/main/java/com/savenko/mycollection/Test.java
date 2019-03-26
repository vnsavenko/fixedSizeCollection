package com.savenko.mycollection;

public class Test {
    public static void main(String[] args) {
        FIxedSizeCollection col = new FIxedSizeCollection(5);

        col.add(5);
        col.add(10);
        col.add(15);
        col.add(20);
        col.add(25);

        print(col);

        System.out.println("Элемент с конца коллекции " + col.getElem());
        int i = 2;
        System.out.println("Элемент с индексом " + i + ": " + col.getElem(i));

        System.out.println("Коллекция после добавления элементов: ");

        col.add(30);
        col.add(400);
        col.add(500);
        print(col);


        int k = 4;
        System.out.println("Коллекция после удаления " + k + "-го элемента: " );
        col.delete(k);
        print(col);




    }

    private static  void print(FIxedSizeCollection col){
        for (int i = 0; i < col.size(); i++) System.out.print(col.getElem(i) + " ");
        System.out.println();
    }
}
