package Exercicio2;

public class OperacoesMatriz {
    public static void main(String[] args) {
        int[][] matrizA = {{1, 2}, {3, 4}};
        int[][] matrizB = {{5, 6}, {7, 8}};

        Matriz matrizObjetoA = new Matriz();
        matrizObjetoA.setMatriz(matrizA);

        Matriz matrizObjetoB = new Matriz();
        matrizObjetoB.setMatriz(matrizB);

        Operacao operacao = new Operacao();
        int[][] resultadoSoma = operacao.soma(matrizObjetoA, matrizObjetoB);
        
        System.out.println("Resultado da Soma:");
        imprimirMatriz(resultadoSoma);

        int[][] resultadoMultiplicacao = operacao.multiplicacao(matrizObjetoA, matrizObjetoB);
        
        System.out.println("\nResultado da Multiplicação:");
        imprimirMatriz(resultadoMultiplicacao);
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int[] linha : matriz) {
            for (int elemento : linha) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }
}