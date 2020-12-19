package com.company;

import java.util.ArrayList;
import java.util.List;

public class DataStructure {
    public static void printNames(List<String> names) {
        for(String name: names) {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
//        String name = "Tiago";
//        System.out.println(name);

        String[] names = new String[4];
        names[0] = "Tiago";
        names[1] = "Renzo";
        names[2] = "Pedro";
        names[3] = "Luiz";

        List<String> newNames = new ArrayList<String>();
        newNames.add("Tiago");
        newNames.add("Renzo");
        newNames.add("Pedro");
        newNames.add("Luiz");
        newNames.add("Thomas");

        printNames(newNames);

    }
}
