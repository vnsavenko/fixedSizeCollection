package com.savenko.mycollection;

public class FixedSizeCollection<E> {
    private E a[];
    private int tos = -1;//указатель на позицию перед элементом с индексом tos+1



    public FixedSizeCollection(int size) {
        a = (E[]) new Object[size];
    }

    public FixedSizeCollection() {
        this.a = (E[]) new Object[16];
    }

    public int size(){
        return a.length;
    }

    public void add(E elem){
        if (tos==a.length-1){
            shift();
        }
            a[++tos] = elem;
        }

    public E getElem(int i){
        return a[i];
        }

        public E getElem(){
        return a[tos];
        }

        public void delete(int k){
        if (k > a.length-1) throw new ArrayIndexOutOfBoundsException();
            for (int i = k; i < a.length-1; i++) {
                a[i] = a[i+1]; // перезаписываем элементы с индекса удаленного элемента
            }
            a[a.length-1] = null; // удаляем последний элемент
            --tos; // сдвигаем указатель на последний элемент
        }


    private void shift() {
        --tos;
        //int b[] = new int[a.length]; так работает
        for (int i = 0; i < a.length-1; i++) {
          //  b[i] = a[i+1];
           // a[i] = b[i];
            a[i] = a[i+1];// так тоже работает


        }

    }
}


