package Exercicio6;

public class Controle {
    public static void main(String[] args) {
        GerenciadorFamilia familia = new GerenciadorFamilia();

        Pessoa pessoa1 = new Pessoa("Caio", 21, true);
        Pessoa pessoa2 = new Pessoa("Ingridy", 22, false);
        Pessoa pessoa3 = new Pessoa("Paula", 20, false);

        familia.adicionaMembro(pessoa1);
        familia.adicionaMembro(pessoa2);
        familia.adicionaMembro(pessoa3);
        familia.adicionaMembro(pessoa1);

        familia.imprimeCasados();

        Pessoa maisVelha = familia.pessoaMaisVelha();
        if (maisVelha != null) {
            System.out.println("Pessoa mais velha da família: " + maisVelha.nome);
        } else {
            System.out.println("Não há membros na família.");
        }

        double idadeMedia = familia.idadeMedia();
        System.out.println("Idade média das pessoas da família: " + idadeMedia);
    }
}