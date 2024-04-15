package Exercicio4;

import java.util.Scanner;

public class Controle {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Adicionar Registro");
            System.out.println("2. Excluir Registro");
            System.out.println("3. Visualizar Registros");
            System.out.println("4. Modificar Registro");
            System.out.println("5. Sair");

            int escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1:
                    System.out.println("Digite o nome:");
                    String nome = scanner.nextLine();
                    System.out.println("Digite o endereço:");
                    String endereco = scanner.nextLine();
                    System.out.println("Digite o telefone:");
                    String telefone = scanner.nextLine();
                    System.out.println("Digite o email:");
                    String email = scanner.nextLine();

                    RegistroAgenda novoRegistro = new RegistroAgenda(nome, endereco, telefone, email);
                    agenda.adicionarRegistro(novoRegistro);
                    break;
                case 2:
                    System.out.println("Digite o índice do registro que deseja excluir:");
                    int indiceExcluir = scanner.nextInt();
                    agenda.excluirRegistro(indiceExcluir);
                    break;
                case 3:
                    agenda.visualizarRegistros();
                    break;
                case 4:
                    System.out.println("Digite o índice do registro que deseja modificar:");
                    int indiceModificar = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Digite o novo nome:");
                    String novoNome = scanner.nextLine();
                    System.out.println("Digite o novo endereço:");
                    String novoEndereco = scanner.nextLine();
                    System.out.println("Digite o novo telefone:");
                    String novoTelefone = scanner.nextLine();
                    System.out.println("Digite o novo email:");
                    String novoEmail = scanner.nextLine();

                    RegistroAgenda registroModificado = new RegistroAgenda(novoNome, novoEndereco, novoTelefone, novoEmail);
                    agenda.modificarRegistro(indiceModificar, registroModificado);
                    break;
                case 5:
                    System.out.println("Encerrando o programa...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }
}