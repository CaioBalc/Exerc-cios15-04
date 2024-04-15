package Exercicio4;

import java.util.ArrayList;

class RegistroAgenda {
    String nome;
    String endereco;
    String telefone;
    String email;

    RegistroAgenda(String nome, String endereco, String telefone, String email) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }
}

public class Agenda {
    private ArrayList<RegistroAgenda> registros;

    public Agenda() {
        this.registros = new ArrayList<>();
    }

    public void adicionarRegistro(RegistroAgenda registro) {
        registros.add(registro);
        System.out.println("Registro adicionado com sucesso.");
    }

    public void excluirRegistro(int indice) {
        if (indice >= 0 && indice < registros.size()) {
            registros.remove(indice);
            System.out.println("Registro excluído com sucesso.");
        } else {
            System.out.println("Posição inválida.");
        }
    }

    public void visualizarRegistros() {
        if (registros.isEmpty()) {
            System.out.println("Agenda vazia.");
        } else {
            System.out.println("Registros da Agenda:");
            for (int i = 0; i < registros.size(); i++) {
                System.out.println("Posição: " + i);
                System.out.println("Nome: " + registros.get(i).nome);
                System.out.println("Endereço: " + registros.get(i).endereco);
                System.out.println("Telefone: " + registros.get(i).telefone);
                System.out.println("Email: " + registros.get(i).email);
                System.out.println();
            }
        }
    }

    public void modificarRegistro(int indice, RegistroAgenda novoRegistro) {
        if (indice >= 0 && indice < registros.size()) {
            registros.set(indice, novoRegistro);
            System.out.println("Registro modificado com sucesso.");
        } else {
            System.out.println("Posição inválida.");
        }
    }
}