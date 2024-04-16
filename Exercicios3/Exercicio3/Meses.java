package Exercicios3.Exercicio3;

public enum Meses {
    JANEIRO(false),
    FEVEREIRO(false),
    MARÇO(false),
    ABRIL(true),
    MAIO(true),
    JUNHO(true),
    JULHO(true),
    AGOSTO(false),
    SETEMBRO(false),
    OUTUBRO(false),
    NOVEMBRO(false),
    DEZEMBRO(false);

    private final boolean feriasEscolares;

    Meses(boolean feriasEscolares) {
        this.feriasEscolares = feriasEscolares;
    }

    public boolean isFeriasEscolares() {
        return feriasEscolares;
    }
}