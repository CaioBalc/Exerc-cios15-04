package Exercicio3;

import java.util.Scanner;

public class Controle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o tamanho máximo do banco de registros:");
        int tamanhoMaximo = scanner.nextInt();

        Sistema sistema = new Sistema(tamanhoMaximo);
        sistema.adicionar(new Funcionario("Caio", 20));
        sistema.adicionar(new Funcionario("Paula", 20));
        sistema.mostrar();
        sistema.editar("Caio", 21);
        sistema.mostrar();
        sistema.excluir("Paula");
        sistema.mostrar();
        scanner.close();
    }
}