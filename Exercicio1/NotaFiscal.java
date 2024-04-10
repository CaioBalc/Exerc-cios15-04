// import java.util.ArrayList;
// import java.util.List;

// public class NotaFiscal {
//     private List<Produto> itensComprados;
//     private double totalCompra;

//     public NotaFiscal() {
//         this.itensComprados = new ArrayList<>();
//         this.totalCompra = 0;
//     }

//     public void comprarProduto(Produto produto, int quantidade) {
//         if (produto.getEstoque() >= quantidade) {
//             produto.setEstoque(produto.getEstoque() - quantidade);
//             this.itensComprados.add(produto);
//             this.totalCompra += produto.getPreco() * quantidade;
//         } else {
//             System.out.println("Desculpe, não temos estoque suficiente para " + produto.getNome() + ".");
//         }
//     }

//     public void gerarRelatorio() {
//         System.out.println("Relatório de Vendas:");
//         for (Produto produto : this.itensComprados) {
//             System.out.println(produto.getNome());
//         }
//         System.out.println("Total da compra: R$" + this.totalCompra);
//     }
// }

import java.util.ArrayList;
import java.util.List;

package Exercicio1;

public class NotaFiscal {
    private List<Produto> itensComprados;
    private double totalCompra;

    public NotaFiscal() {
        this.itensComprados = new ArrayList<>();
        this.totalCompra = 0;
    }

    public void comprarProduto(Produto produto, int quantidade) {
        if (produto.getEstoque() >= quantidade) {
            produto.setEstoque(produto.getEstoque() - quantidade);
            this.itensComprados.add(produto);
            this.totalCompra += produto.getPreco() * quantidade;
        } else {
            System.out.println("Desculpe, não temos estoque suficiente para " + produto.getNome() + ".");
        }
    }

    public void gerarRelatorio() {
        System.out.println("Relatório de Vendas:");
        for (Produto produto : this.itensComprados) {
            System.out.println(produto.getNome());
        }
        System.out.println("Total da compra: R$" + this.totalCompra);
    }

    public static void main(String[] args) {
        Produto p1 = new Produto("Nome1", 15.99, 2);
    }
}