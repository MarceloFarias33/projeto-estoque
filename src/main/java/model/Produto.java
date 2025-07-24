package model;

public class Produto {
    private String nome_produto;
    private String valor_produto;
    private String qnt_produto;

    public String getNome_produto() {
        return nome_produto;
    }

    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }

    public String getQnt_produto() {
        return qnt_produto;
    }

    public void setQnt_produto(String qnt_produto) {
        this.qnt_produto = qnt_produto;
    }

    public String getValor_produto() {
        return valor_produto;
    }

    public void setValor_produto(String valor_produto) {
        this.valor_produto = valor_produto;
    }
}
