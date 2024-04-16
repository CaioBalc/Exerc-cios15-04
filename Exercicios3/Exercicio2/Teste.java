package Exercicios3.Exercicio2;

public class Teste {
    public static void main(String[] args) {
        for (Meses mes : Meses.values()) {
            System.out.println("O número de " + mes.name() + " é: " + mes.getNumero());
        }
    }
}
