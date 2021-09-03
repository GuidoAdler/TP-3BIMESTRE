package com.company;

import java.util.Comparator;
import java.util.Iterator;

public interface Queue<T> extends Iterable<T> {
    public void add(T harry); //Añadis

    public String peek(); // solo el primero sin borrar

    public boolean isEmpty();

    public String pop() throws EmptyQueueException; //Te devuelve el primero  y lo borra

    public void sort();

    @Override
    public Iterator<T> iterator();

    public T min(Comparator<T> comparator);
}
