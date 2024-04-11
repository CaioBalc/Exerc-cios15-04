package Exercicio4;

public class NumeroComplexo {
    private double parteReal;
    private double parteImaginaria;

    public void inicializaNumero(double parteReal, double parteImaginaria) {
        this.parteReal = parteReal;
        this.parteImaginaria = parteImaginaria;
    }

    public void imprimeNumero() {
        System.out.println(parteReal + " + " + parteImaginaria + "i");
    }

    public boolean éIgual(NumeroComplexo outroNumero) {
        return this.parteReal == outroNumero.parteReal && this.parteImaginaria == outroNumero.parteImaginaria;
    }

    public NumeroComplexo soma(NumeroComplexo outroNumero) {
        NumeroComplexo resultado = new NumeroComplexo();
        resultado.parteReal = this.parteReal + outroNumero.parteReal;
        resultado.parteImaginaria = this.parteImaginaria + outroNumero.parteImaginaria;
        return resultado;
    }

    public NumeroComplexo subtrai(NumeroComplexo outroNumero) {
        NumeroComplexo resultado = new NumeroComplexo();
        resultado.parteReal = this.parteReal - outroNumero.parteReal;
        resultado.parteImaginaria = this.parteImaginaria - outroNumero.parteImaginaria;
        return resultado;
    }

    public NumeroComplexo multiplica(NumeroComplexo outroNumero) {
        NumeroComplexo resultado = new NumeroComplexo();
        resultado.parteReal = this.parteReal * outroNumero.parteReal - this.parteImaginaria * outroNumero.parteImaginaria;
        resultado.parteImaginaria = this.parteReal * outroNumero.parteImaginaria + this.parteImaginaria * outroNumero.parteReal;
        return resultado;
    }

    public NumeroComplexo divide(NumeroComplexo outroNumero) {
        NumeroComplexo resultado = new NumeroComplexo();
        double divisor = outroNumero.parteReal * outroNumero.parteReal + outroNumero.parteImaginaria * outroNumero.parteImaginaria;
        resultado.parteReal = (this.parteReal * outroNumero.parteReal + this.parteImaginaria * outroNumero.parteImaginaria) / divisor;
        resultado.parteImaginaria = (this.parteImaginaria * outroNumero.parteReal - this.parteReal * outroNumero.parteImaginaria) / divisor;
        return resultado;
    }
}
