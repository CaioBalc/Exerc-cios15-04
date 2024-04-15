package Exercicio3;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public boolean vemAntes(Data Data2) {
        if (this.ano < Data2.ano) {
            return true;
        } else if (this.ano > Data2.ano) {
            return false;
        } else {
            if (this.mes < Data2.mes) {
                return true;
            } else if (this.mes > Data2.mes) {
                return false;
            } else {
                return this.dia <= Data2.dia;
            }
        }
    }

    public String toString() {
        return String.format("%02d/%02d/%d", dia, mes, ano);
    }
}