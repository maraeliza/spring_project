package web.springbootmvc.model;

public enum Caracteristica {
    PERMITIDO_PARCELAR("Parcelamento permitido"),
    PERMITIDO_DEVOLVER("Devolução permitida"),
    GARANTIA_LOJA("Garantia de Loja"),
    GARANTIA_FABRICA("Garantia de Fábrica");

    private String descricao;

    private Caracteristica(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
