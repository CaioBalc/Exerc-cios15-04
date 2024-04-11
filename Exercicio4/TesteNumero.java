package Exercicio4;

public class TesteNumero {
    public static void main(String[] args) {
        NumeroComplexo num1 = new NumeroComplexo();
        NumeroComplexo num2 = new NumeroComplexo();
        num1.inicializaNumero(3, 2);
        num2.inicializaNumero(1, 5);

        System.out.println("Número 1:");
        num1.imprimeNumero();
        System.out.println("Número 2:");
        num2.imprimeNumero();

        System.out.println("\nOs números são iguais? " + num1.éIgual(num2));

        NumeroComplexo soma = num1.soma(num2);
        System.out.println("\nSoma:");
        soma.imprimeNumero();

        NumeroComplexo subtracao = num1.subtrai(num2);
        System.out.println("\nSubtração:");
        subtracao.imprimeNumero();

        NumeroComplexo multiplicacao = num1.multiplica(num2);
        System.out.println("\nMultiplicação:");
        multiplicacao.imprimeNumero();

        NumeroComplexo divisao = num1.divide(num2);
        System.out.println("\nDivisão:");
        divisao.imprimeNumero();
    }
}
