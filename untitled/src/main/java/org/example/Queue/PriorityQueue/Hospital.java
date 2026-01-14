package org.example.Queue.PriorityQueue;

import java.util.PriorityQueue;

public class Hospital {

    static class Patient{
        String name;
        int severity;

        public Patient(String name, int severity){
            this.name = name;
            this.severity= severity;
        }
        @Override
        public String toString() {
            return name + " (severity " + severity + ")";
        }
    }

public static void main(String[] args) {
    PriorityQueue<Patient> emrqueue = new PriorityQueue<>((p1, p2) -> Integer.compare(p2.severity, p1.severity));

    emrqueue.add(new Patient("Shubham",2));
    emrqueue.add(new Patient("Chinmayee", 1));
    emrqueue.add(new Patient("Sunny",4));

    while (!emrqueue.isEmpty()) {
        System.out.println("Treating: " + emrqueue.poll());
    }

}
}
