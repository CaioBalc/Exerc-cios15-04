package Exercicio2;

class Funcionario {
    String nome;
    int idade;

    Funcionario(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}

public class Sistema {
    private Funcionario[] funcionarios;
    private int tamanhoMaximo;
    private int contador;

    public Sistema(int tamanhoMaximo) {
        this.tamanhoMaximo = tamanhoMaximo;
        this.funcionarios = new Funcionario[tamanhoMaximo];
        this.contador = 0;
    }

    public void adicionar(Funcionario funcionario) {
        if (contador < tamanhoMaximo) {
            funcionarios[contador] = funcionario;
            contador++;
        } else {
            System.out.println("\nLimite de funcionários atingido.");
        }
    }

    public void mostrar() {
        System.out.println("\nFuncionários:");
        for (int i = 0; i < contador; i++) {
            System.out.println("Nome: " + funcionarios[i].nome + ", Idade: " + funcionarios[i].idade);
        }
    }

    public void editar(String nome, int idade) {
        for (int i = 0; i < contador; i++) {
            if (funcionarios[i].nome.equals(nome)) {
                funcionarios[i].idade = idade;
                System.out.println("\nFuncionário " + nome + " editado");
                return;
            }
        }
        System.out.println("\nFuncionário " + nome + " não encontrado.");
    }

    public void excluir(String nome) {
        for (int i = 0; i < contador; i++) {
            if (funcionarios[i].nome.equals(nome)) {
                for (int j = i; j < contador - 1; j++) {
                    funcionarios[j] = funcionarios[j + 1];
                }
                contador--;
                return;
            }
        }
        System.out.println("\nFuncionário " + nome + " não encontrado.");
    }
}