package br.com.liol.entities.enums;

public enum StatusMatricula {

    ATIVA("Ativa"),
    EXPIRADA("Expirada"),
    CANCELADA("Cancelada");

    private final String descricao;

    StatusMatricula(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
}
