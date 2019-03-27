package com.savenko.mycollection;

public class TestString {


    public static void main(String[] args) {
        FixedSizeCollection<String> col = new FixedSizeCollection(5);

        col.add("John");
        col.add("Mary");
        col.add("Peter");
        col.add("Tom");
        col.add("Alfred");

        print(col);

        System.out.println("Элемент с конца коллекции " + col.getElem());
        int i = 2;
        System.out.println("Элемент с индексом " + i + ": " + col.getElem(i));

        System.out.println("Коллекция после добавления элементов: ");

        col.add("Bony");
        col.add("Rich");
        col.add("Ann");
        print(col);


        int k = 2;
        System.out.println("Коллекция после удаления " + k + "-го элемента: " );
        col.delete(k);

        print(col);
        col.add("Val");

        System.out.println("Коллекция после добавления элементов: ");
        print(col);
}

    private static  void print(FixedSizeCollection col){
        for (int i = 0; i < col.size(); i++) System.out.print(col.getElem(i) + " ");
        System.out.println();
    }
}
