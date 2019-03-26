package com.savenko.mycollection;

public class  FIxedSizeCollection {
    private int a[];
    private int tos = -1;//указатель на позицию перед элементом с индексом tos+1



    public FIxedSizeCollection(int size) {
        a = new int[size];
    }

    public FIxedSizeCollection() {
        this.a = new int[16];
    }

    public int size(){
        return a.length;
    }

    public void add(int elem){
        if (tos==a.length-1){
            shift();
        }
            a[++tos] = elem;
        }

    public int getElem(int i){
        return a[i];
        }

        public int getElem(){
        return a[tos];
        }

        public void delete(int k){
        if (k > a.length-1) throw new ArrayIndexOutOfBoundsException();
            for (int i = k; i < a.length-1; i++) {
                a[i] = a[i+1];
            }
            a[a.length-1] = 0;
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


