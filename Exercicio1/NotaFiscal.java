package Exercicio1;

import java.util.ArrayList;
import java.util.List;

public class NotaFiscal {
    private List<Produto> itens;
    private double total;

    public NotaFiscal() {
        this.itens = new ArrayList<>();
        this.total = 0.0;
    }

    public void adicionarItem(Produto produto, int quantidade) {
        if (produto.getEstoque() >= quantidade) {
            itens.add(produto);
            total += produto.getPreco() * quantidade;
            produto.setEstoque(produto.getEstoque() - quantidade);
            System.out.println(produto.getNome() + " foi adicionado à nota fiscal. Quantidade: " + quantidade);
        } else {
            System.out.println("Estoque insuficiente de " + produto.getNome() + ", tente adicionar menos do que " + quantidade);
        }
    }

    public void imprimirNotaFiscal() {
        System.out.println("\nNota Fiscal:");
        for (Produto item : itens) {
            System.out.println("Produto: " + item.getNome() + ", Preço unitário: R$" + item.getPreco());
        }
        System.out.println("Total da compra: R$" + total);
    }
}
