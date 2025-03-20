package org.example;

public class Produto {
    int codigo;
    String nome;
    double preco;

    // Construtor para inicializar o produto
    Produto(int codigo, String nome, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }

    // Método para exibir as informações do produto
    @Override
    public String toString() {
        return "Código: " + codigo + ", Nome: " + nome + ", Preço: R$" + preco;
    }
}
