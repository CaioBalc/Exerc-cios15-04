package Exercicio5;

import java.util.ArrayList;
import java.util.Collections;

public class Pares {
    public static void main(String[] args) {
        ArrayList<Integer> numerosPares = new ArrayList<>();

        for (int i = 2; i <= 1000; i += 2) {
            numerosPares.add(i);
        }

        Collections.sort(numerosPares, Collections.reverseOrder());

        System.out.println("Números pares em ordem decrescente:");
        for (int numero : numerosPares) {
            System.out.println(numero);
        }
    }
}