package Assigment5.main;


import Assigment5.data.DefaultInitilizationAssignment;
import Assigment5.singleton.Singleton;

public class Main {
    public static void main(String[] args) {
        DefaultInitilizationAssignment defaultInitilizationAssignment=new DefaultInitilizationAssignment();
        defaultInitilizationAssignment.printLocal();
        defaultInitilizationAssignment.printNonStatic();
        Singleton singleton=Singleton.CreateObject("vamshi");
        singleton.print();

    }
}
