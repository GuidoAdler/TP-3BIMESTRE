package com.company;

import java.lang.annotation.ElementType;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

public class ListIterable<T> implements Iterable<T> {
    private T[] elements;
    private int dim; //inicia en 0
    private static int INITIAL_DIM = 5;

    public ListIterable(){
        elements = (T[]) new Comparable[INITIAL_DIM];
    }
    public boolean isEmpty() {
        return dim==0;
    }

    public void add(T element) { //cuando se añade un elemento, se suma 1 al dim
        if(dim >= elements.length) resize();
        elements[dim++] = element;
    }

    public int contains(T element) {
        for(int i = 0; i<dim; i++){
            if(elements[i] == element) return  i;
        }
        return -1;
    }

    public void remove(int index) {
        if(!(index < 0 && index >= dim))
        {
        System.arraycopy(elements,index+1,elements,index,dim-1-index); //copialo en bloque hasta index
        dim --;
        }
    }

    public T returnFirst(int index) {
        return elements[index];
    }

    public T returnFirstRemoveFirst(int index) {
        T a = elements[index];
        remove(index);
        return a;

    }

    private void resize(){
        Arrays.copyOf(elements,dim+INITIAL_DIM);
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator() {
            private int i = 0;
            @Override
            public boolean hasNext() {
                if (i < dim) return true;
                else return false;
            }

            @Override
            public T next() {
                if (hasNext()) return elements[i++];
                else throw new Error("Error: No hay elemento siguiente");
            }
        };
    }

    public T[] getList()
    {

        return elements;
    }

    public void sort()
    {
        Arrays.sort(elements);
    }

    public T min(Comparator<T> comparator) {

        T ultimo = elements[0];

        for(int i = 0; i<dim; i++){
            if (comparator.compare(ultimo, elements[i]) < 0) ultimo = elements[i];
        }

        return ultimo;

    }
}