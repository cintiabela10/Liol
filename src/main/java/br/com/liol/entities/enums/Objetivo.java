package br.com.liol.entities.enums;

public enum Objetivo {

    EMAGRECIMENTO("Emagrecimento"),
    HIPERTROFIA("Hipertrofia"),
    CONDICIONAMENTO("Condicionamento");

    private final String descricao;

    Objetivo(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
}