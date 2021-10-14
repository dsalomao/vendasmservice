package com.asc.vendasmservice.data;

// Classe de dados para melhor visualização da troca de mensagens reais
public class Venda {
    private Integer id;
    private String codigo;
    private Float valor;

    public Venda() 
    {
    }

    public Integer getId() {
        return id;
    }

    public String getCodigo() {
        return codigo;
    }

    public Float getValor() {
        return valor;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }
}
