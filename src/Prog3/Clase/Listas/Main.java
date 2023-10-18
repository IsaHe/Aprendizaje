package Prog3.Clase.Listas;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(100);
        numeros.add(25);
        numeros.add(37);
        numeros.add(49999);
        numeros.add(5552);

        System.out.println(numeros.size());
        System.out.println(numeros.isEmpty());
        for (int numero : numeros) {
            System.out.print(numero+" ");
        }
        numeros.sort(Integer::compareTo);
        System.out.println("\n"+numeros);
    }
}

