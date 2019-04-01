package com.savenko.mycollection;

import javax.xml.bind.annotation.XmlType;

public class FixedSizeCollection<E> {
    private E data[];
    private static final int DEFAULT_CAPACITY = 16;
    private int tos = -1;//указатель на позицию перед элементом с индексом tos+1



    public FixedSizeCollection(int size) {
        if (size > 0) {data = (E[]) new Object[size];}
        else if (size == 0){data = (E[]) new Object[DEFAULT_CAPACITY];}
        else {
            throw new CollectionException("Неверная инициализация, размер не может быть отрицательным: " + size);
        }
    }


    public FixedSizeCollection() {

        this.data = (E[]) new Object[DEFAULT_CAPACITY];
    }


    public int size(){
        return data.length;
    }

    public void add(E elem) {
        if(data == null) throw new CollectionException("Коллекция не инициализирована");

        if (tos==data.length-1){
            shift();
        }
            data[++tos] = elem;
        }

    public E getElem(int i){
        if (!(i < 0)&&(i < data.length)){
            return data[i];
        } else throw new CollectionException("Индекс элемента выходит за пределы коллекции");

        }

        public E getElem(){
        return data[tos];
        }

        public void delete(int k){
        if ((k < 0)||(k > data.length-1)) throw new CollectionException("Индекс элемента выходит за пределы коллекции");
            for (int i = k; i < data.length-1; i++) {
                data[i] = data[i+1]; // перезаписываем элементы с индекса удаленного элемента
            }
            data[data.length-1] = null; // удаляем последний элемент
            --tos; // сдвигаем указатель на последний элемент
        }


    private void shift() {
        --tos;
        //int b[] = new int[a.length]; так работает
        for (int i = 0; i < data.length-1; i++) {
          //  b[i] = a[i+1];
           // a[i] = b[i];
            data[i] = data[i+1];// так тоже работает


        }

    }
}


