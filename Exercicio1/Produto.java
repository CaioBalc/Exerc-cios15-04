public class Produto {
    private String nome;
    private double preco;
    private int estoque;

    public Produto(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

     public void setNome(){
         this.nome = nome;
     }

     public void setPreco(){
         this.preco = preco;
     }

     public void setEstoque(){
         this.estoque = estoque;
     }

     public String getNome(){
         return nome;
     }

     public double getPreco(){
         return preco;
     }

     public int getEstoque(){
         return estoque;
     }
}