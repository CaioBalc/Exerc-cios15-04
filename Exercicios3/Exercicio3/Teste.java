package Exercicios3.Exercicio3;

public class Teste {
    public static void main(String[] args) {
        // Iterando sobre os meses e verificando se são férias escolares
        for (Meses mes : Meses.values()) {
            if (mes.isFeriasEscolares()) {
                System.out.println(mes.name() + " é mês de férias escolares.");
            } else {
                System.out.println(mes.name() + " NÃO é mês de férias escolares.");
            }
        }
    }
}