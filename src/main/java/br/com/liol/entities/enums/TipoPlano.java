package br.com.liol.entities.enums;

public enum TipoPlano {

    EXPERIMENTAL("Experimental"),
    MENSAL("Mensal"),
    TRIMESTRAL("Trimestral"),
    SEMESTRAL("Semestral"),
    ANUAL("Anual");

    private final String descricao;

    TipoPlano(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
}