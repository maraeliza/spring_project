package web.springbootmvc.model;

public enum Tipo {
    PERECIVEL("Perecível"),
    NAO_PERECIVEL("Não perecível");

    private String descricao;

    private Tipo(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
