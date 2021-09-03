package com.company;

import java.util.Comparator;
import java.util.Iterator;


public class QueueImplement<T> implements Queue<T> {

    ListIterable<T> shiftsList = new ListIterable<>();

    @Override
    public boolean isEmpty() {
        return shiftsList.isEmpty();
    }

    @Override
    public String pop() throws EmptyQueueException {
        return shiftsList.returnFirstRemoveFirst(0).toString();
    }



    @Override
    public T min(Comparator<T> comparator) {
       return shiftsList.min(comparator);
    }

    @Override
    public void add(T medicalShifts) {
        shiftsList.add(medicalShifts);
    }

    @Override
    public String peek() {
        return shiftsList.returnFirst(0).toString();
    }

    @Override
    public void sort()
    {
        shiftsList.sort();
    }

    @Override
    public Iterator<T> iterator() {
        return shiftsList.iterator();
    }

}
