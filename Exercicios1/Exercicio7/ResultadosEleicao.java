package Exercicio7;

import java.util.HashMap;
import java.util.Map;

public class ResultadosEleicao {
    private Map<String, Integer> resultados;

    public ResultadosEleicao() {
        this.resultados = new HashMap<>();
    }

    public void adicionarVotos(String estado, int votos) {
        resultados.put(estado, votos);
    }

    public void mostrarResultados() {
        System.out.println("Resultados da Eleição:");
        for (Map.Entry<String, Integer> entry : resultados.entrySet()) {
            System.out.println("Estado: " + entry.getKey() + ", Votos: " + entry.getValue());
        }
    }

    public double calcularMedia() {
        if (resultados.isEmpty()) {
            return 0;
        }

        int totalVotos = 0;
        for (int votos : resultados.values()) {
            totalVotos += votos;
        }

        return (double) totalVotos / resultados.size();
    }
}