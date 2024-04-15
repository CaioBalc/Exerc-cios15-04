package Exercicio3;

import java.util.ArrayList;
import java.util.List;

class Funcionario {
    String nome;
    int idade;

    Funcionario(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}

public class Sistema {
    private List<Funcionario> funcionarios;
    private int tamanhoMaximo;

    public Sistema(int tamanhoMaximo) {
        this.funcionarios = new ArrayList<>();
        this.tamanhoMaximo = tamanhoMaximo;
    }

    public void adicionar(Funcionario funcionario) {
        if (funcionarios.size() < tamanhoMaximo) {
            funcionarios.add(funcionario);
        } else {
            System.out.println("\nLimite de funcionários atingido.");
        }
    }

    public void mostrar() {
        System.out.println("\nFuncionários:");
        for (Funcionario funcionario : funcionarios) {
            System.out.println("Nome: " + funcionario.nome + ", Idade: " + funcionario.idade);
        }
    }

    public void editar(String nome, int idade) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.nome.equals(nome)) {
                funcionario.idade = idade;
                System.out.println("\nFuncionário " + nome + " editado");
                return;
            }
        }
        System.out.println("\nFuncionário " + nome + " não encontrado.");
    }

    public void excluir(String nome) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.nome.equals(nome)) {
                funcionarios.remove(funcionario);
                return;
            }
        }
        System.out.println("\nFuncionário " + nome + " não encontrado.");
    }
}