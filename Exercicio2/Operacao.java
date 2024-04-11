package Exercicio2;

public class Operacao {
    public int[][] soma(Matriz matrizA, Matriz matrizB) {
        int[][] a = matrizA.getMatriz();
        int[][] b = matrizB.getMatriz();

        if (a.length != b.length || a[0].length != b[0].length) {
            System.out.println("As matrizes não possuem o mesmo tamanho. A soma não é possível.");
            return null;
        }

        int m = a.length;
        int n = a[0].length;
        int[][] c = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        return c;
    }

    public int[][] multiplicacao(Matriz matrizA, Matriz matrizB) {
        int[][] a = matrizA.getMatriz();
        int[][] b = matrizB.getMatriz();

        if (a[0].length != b.length) {
            System.out.println("As matrizes não possuem o mesmo tamanho. A multiplicação não é possível.");
            return null;
        }

        int m = a.length;
        int p = b.length;
        int n = b[0].length;
        int[][] c = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < p; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        return c;
    }
}