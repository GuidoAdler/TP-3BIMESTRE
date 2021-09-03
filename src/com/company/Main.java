package com.company;

import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        Queue < MedicalShifts > queueHospital = new QueueImplement<>();
        queueHospital.add(new MedicalShifts("harry", 0));
        queueHospital.add(new MedicalShifts("hermione", 3));
        queueHospital.add(new MedicalShifts("ron", 1));
        queueHospital.add(new MedicalShifts("luna", 5));
        queueHospital.add(new MedicalShifts("voldemort", 8));
        System.out.println(queueHospital.peek()); //harry
        System.out.println(queueHospital.isEmpty()); //false
        try {
            System.out.println(queueHospital.pop()); //harry
        } catch (EmptyQueueException emptyQueue) {
            System.out.println(emptyQueue.getMessage());
        }
        System.out.println(queueHospital.peek()); //hermione
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        queueHospital.add(new MedicalShifts("hagrid", 4));
        for (MedicalShifts shifts: queueHospital) {
            System.out.println(shifts); //hermione ron luna voldemort hagrid
        }
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        queueHospital.sort();
        for (MedicalShifts shifts: queueHospital) {
            System.out.println(shifts); //ron hermione hagrid luna voldemort
        }
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println(queueHospital.min(new Comparator<MedicalShifts>() {
            @Override
            public int compare(MedicalShifts o1, MedicalShifts o2) {
              //return compareFunctions.compareTo(o1.getID(), o2.getID()); //Solucion que filtra por orden que lo agregas
                return -compareFunctions.compareToString(o1.toString(), o2.toString()); //Solucion que returnea por orden alfabetico
            }
        }));

    }
}
