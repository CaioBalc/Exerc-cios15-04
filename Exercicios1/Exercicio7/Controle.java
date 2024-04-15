package Exercicio7;

public class Controle {
    public static void main(String[] args) {
        ResultadosEleicao eleicao = new ResultadosEleicao();

        eleicao.adicionarVotos("Rio Grande do Sul", 11290000);
        eleicao.adicionarVotos("Rio de Janeiro", 6748000);
        eleicao.adicionarVotos("Santa Catarina", 7165000);

        eleicao.mostrarResultados();

        double media = eleicao.calcularMedia();
        System.out.println("Média de votos por Estado: " + media);
    }
}