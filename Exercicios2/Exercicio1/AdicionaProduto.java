package Exercicio1;

public class AdicionaProduto {
        public static void main(String[] args) {
            Produto produto1 = new Produto("Celular", 1500.00, 15);
            Produto produto2 = new Produto("Notebook", 3000.00, 5);
            Produto produto3 = new Produto("Fone de Ouvido", 100.00, 20);
    
            NotaFiscal notaFiscal = new NotaFiscal();
            
            notaFiscal.adicionarItem(produto1, 1);
            notaFiscal.adicionarItem(produto2, 5);
            notaFiscal.adicionarItem(produto3, 5);
            
            notaFiscal.imprimirNotaFiscal();
        }
}
