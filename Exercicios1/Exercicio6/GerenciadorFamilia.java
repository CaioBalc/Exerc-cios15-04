package Exercicio6;

import java.util.ArrayList;
import java.util.List;

class Pessoa {
    String nome;
    int idade;
    boolean casado;

    Pessoa(String nome, int idade, boolean casado) {
        this.nome = nome;
        this.idade = idade;
        this.casado = casado;
    }
}

public class GerenciadorFamilia {
    private List<Pessoa> membrosFamilia;

    public GerenciadorFamilia() {
        this.membrosFamilia = new ArrayList<>();
    }

    public boolean adicionaMembro(Pessoa pessoa) {
        for (Pessoa membro : membrosFamilia) {
            if (membro.nome.equals(pessoa.nome)) {
                System.out.println(pessoa.nome + " já está na família.");
                return false;
            }
        }
        membrosFamilia.add(pessoa);
        System.out.println(pessoa.nome + " foi adicionado(a) na família com sucesso.");
        return true;
    }

    public void imprimeCasados() {
        System.out.println("Pessoas casadas na família:");
        for (Pessoa membro : membrosFamilia) {
            if (membro.casado) {
                System.out.println(membro.nome);
            }
        }
    }

    public Pessoa pessoaMaisVelha() {
        Pessoa maisVelha = null;
        for (Pessoa membro : membrosFamilia) {
            if (maisVelha == null || membro.idade > maisVelha.idade) {
                maisVelha = membro;
            }
        }
        return maisVelha;
    }

    public double idadeMedia() {
        if (membrosFamilia.isEmpty()) {
            return 0;
        }
        int totalIdades = 0;
        for (Pessoa membro : membrosFamilia) {
            totalIdades += membro.idade;
        }
        return (double) totalIdades / membrosFamilia.size();
    }
}