package org.example;

import org.example.model.Bed;
import org.example.model.Bedroom;

public class Main {
    public static void main(String[] args) {
        Bed bed = new Bed("large", 3 ,200 ,1, 1);
       
        System.out.println(bed.getHeight());

    }
}